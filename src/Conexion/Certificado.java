package Conexion;

import Entidades.Ciudadano;
import Entidades.Turno;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.LosslessFactory;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

public class Certificado {

    public void ArmarCertificado(Ciudadano c1, Turno t1, Turno t2, Turno t3) throws IOException {
        String codigo = "";
        codigo += "Datos: " + c1.getApellido() + " " + c1.getNombre() + " DNI: " + c1.getDNI() + " iD: " + c1.getIdCiudadano();
        codigo += "|\n| Dosis 1: " + t1.getVial().getMarca() + "/ /" + t1.getVial().getNumeroSerie() + "/ /" + t1.getVial().getFechaColocacion().toLocalDate() + "/ /" + t1.getVial().getIdVial();
        if (t2 != null) {
            codigo += "|\n| Dosis 2: " + t2.getVial().getMarca() + "/ /" + t2.getVial().getNumeroSerie() + "/ /" + t2.getVial().getFechaColocacion().toLocalDate() + "/ /" + t2.getVial().getIdVial();
        }
        if (t3 != null) {
            codigo += "|\n| Dosis 3:" + t3.getVial().getMarca() + "/ /" + t3.getVial().getNumeroSerie() + "/ /" + t3.getVial().getFechaColocacion().toLocalDate() + "/ /" + t3.getVial().getIdVial();
        }

        try {
            PDDocument document = null;
            if (t1 != null && t2 == null && t3 == null) {
                document = PDDocument.load(getClass().getResource("/Vistas/Imagenes/certificado_d1.pdf").openStream());
            } else if (t1 != null && t2 != null && t3 == null) {
                document = PDDocument.load(getClass().getResource("/Vistas/Imagenes/certificado_d2.pdf").openStream());
            } else if (t1 != null && t2 != null && t3 != null) {
                document = PDDocument.load(getClass().getResource("/Vistas/Imagenes/certificado_d3.pdf").openStream());
            }

            BufferedImage qrImage = metodoQr(codigo);
            PDPage page1 = document.getPage(0);
            PDPageContentStream contentStream1 = new PDPageContentStream(document, page1, PDPageContentStream.AppendMode.APPEND, true);
            contentStream1.setNonStrokingColor(Color.BLACK);
            PDImageXObject qrXObject = LosslessFactory.createFromImage(document, qrImage);
            contentStream1.drawImage(qrXObject, 99, 442, qrImage.getWidth(), qrImage.getHeight());

            PDPage page2 = document.getPage(0);
            PDPageContentStream contentStream2 = null;

            contentStream1.setFont(PDType1Font.HELVETICA_BOLD, 12);

            String dataCiudadano = (c1.getApellido() + " " + c1.getNombre()).toUpperCase();
            if (dataCiudadano.length() <= 20) {
                contentStream1.beginText();
                contentStream1.newLineAtOffset(318, 623);
                contentStream1.showText(dataCiudadano);
                contentStream1.endText();
            } else {
                String[] palabras = dataCiudadano.split(" ");
                StringBuilder renglon1 = new StringBuilder();
                StringBuilder renglon2 = new StringBuilder();
                StringBuilder renglon3 = new StringBuilder();

                int currentLine = 0;
                StringBuilder[] renglones = {renglon1, renglon2, renglon3};
                for (String palabra : palabras) {
                    if (renglones[currentLine].length() > 0) {
                        renglones[currentLine].append(" ");
                    }

                    if (renglones[currentLine].length() + palabra.length() <= 20) {
                        renglones[currentLine].append(palabra);
                    } else {
                        if (currentLine < 2) {
                            currentLine++;
                        }
                        renglones[currentLine].append(palabra);
                    }
                }
                for (int i = 0; i < 3; i++) {
                    contentStream1.beginText();
                    contentStream1.newLineAtOffset(318, 623 - (i * 10));
                    contentStream1.showText(renglones[i].toString());
                    contentStream1.endText();
                }
            }

            contentStream1.beginText();
            contentStream1.newLineAtOffset(318, 580);
            contentStream1.showText(Integer.toString(c1.getDNI()));
            contentStream1.endText();

            contentStream1.beginText();
            contentStream1.newLineAtOffset(318, 547);

            if (c1.getFechaNacimiento() != null) {
                contentStream1.showText(c1.getFechaNacimiento().toString());
            } else {
                contentStream1.showText("Sin Datos");
            }
            contentStream1.endText();

            String esquema = (c1.getDosisAplicadas() < 3) ? "Esquema Incompleto" : "Esquema Completo";
            contentStream1.beginText();
            contentStream1.newLineAtOffset(318, 517);
            contentStream1.showText(esquema);
            contentStream1.endText();

            contentStream1.close();

            if (t1 != null) {
                contentStream2 = new PDPageContentStream(document, page2, PDPageContentStream.AppendMode.APPEND, true);
                contentStream2.setFont(PDType1Font.HELVETICA_BOLD, 10);
                contentStream2.setNonStrokingColor(Color.BLACK);

                generateText(contentStream2, 223, 293, Integer.toString(t1.getVial().getNumeroSerie()));
                generateText(contentStream2, 416, 337, "Primera");
                generateText(contentStream2, 416, 293, t1.getVial().getFechaColocacion().toLocalDate().toString());

                String dataVacna = (t1.getVial().getMarca() + " - " + t1.getVial().getAntigeno());

                if (dataVacna.length() <= 30) {
                    contentStream2.beginText();
                    contentStream2.newLineAtOffset(223, 338);
                    contentStream2.showText(dataVacna);
                    contentStream2.endText();
                } else {
                    String[] palabras = dataVacna.split(" ");
                    StringBuilder renglon1 = new StringBuilder();
                    StringBuilder renglon2 = new StringBuilder();
                    StringBuilder renglon3 = new StringBuilder();
                    int currentLine = 0;
                    StringBuilder[] renglones = {renglon1, renglon2, renglon3};
                    for (String palabra : palabras) {
                        if (renglones[currentLine].length() > 0) {
                            renglones[currentLine].append(" ");
                        }

                        if (renglones[currentLine].length() + palabra.length() <= 30) {
                            renglones[currentLine].append(palabra);
                        } else {
                            if (currentLine < 2) {
                                currentLine++;
                            }
                            renglones[currentLine].append(palabra);
                        }
                    }
                    for (int i = 0; i < 3; i++) {
                        contentStream2.beginText();
                        contentStream2.newLineAtOffset(223, 338 - (i * 10));
                        contentStream2.showText(renglones[i].toString());
                        contentStream2.endText();
                    }
                }

                String dataVacnatorio = (t1.getVacunatorio().getNombre() + " - " + t1.getVacunatorio().getDireccion());
                if (dataVacnatorio.length() <= 40) {
                    contentStream2.beginText();
                    contentStream2.newLineAtOffset(223, 246);
                    contentStream2.showText(dataVacnatorio);
                    contentStream2.endText();
                } else {
                    String[] palabras = dataVacnatorio.split(" ");
                    StringBuilder renglon1 = new StringBuilder();
                    StringBuilder renglon2 = new StringBuilder();
                    StringBuilder renglon3 = new StringBuilder();
                    StringBuilder renglon4 = new StringBuilder();
                    int currentLine = 0;
                    StringBuilder[] renglones = {renglon1, renglon2, renglon3, renglon4};
                    for (String palabra : palabras) {
                        if (renglones[currentLine].length() > 0) {
                            renglones[currentLine].append(" ");
                        }

                        if (renglones[currentLine].length() + palabra.length() <= 40) {
                            renglones[currentLine].append(palabra);
                        } else {
                            if (currentLine < 3) {
                                currentLine++;
                            }
                            renglones[currentLine].append(palabra);
                        }
                    }
                    for (int i = 0; i < 4; i++) {
                        contentStream2.beginText();
                        contentStream2.newLineAtOffset(223, 246 - (i * 10));
                        contentStream2.showText(renglones[i].toString());
                        contentStream2.endText();
                    }
                }
                contentStream2.close();
            }

            if (document.getNumberOfPages() > 1) {
                PDPage page3 = document.getPage(1);
                PDPageContentStream contentStream3 = new PDPageContentStream(document, page3, PDPageContentStream.AppendMode.APPEND, true);
                contentStream3.setNonStrokingColor(Color.BLACK);
                PDPage page4 = document.getPage(1);
                PDPageContentStream contentStream4 = null;

                if (t2 != null) {
                    generateText(contentStream3, 223, 567, Integer.toString(t2.getVial().getNumeroSerie()));
                    generateText(contentStream3, 416, 613, "Segunda");
                    generateText(contentStream3, 416, 569, t2.getVial().getFechaColocacion().toLocalDate().toString());

                    String dataVacna = (t2.getVial().getMarca() + " - " + t2.getVial().getAntigeno());
                    if (dataVacna.length() <= 30) {
                        contentStream3.beginText();
                        contentStream3.newLineAtOffset(223, 612);
                        contentStream3.showText(dataVacna);
                        contentStream3.endText();
                    } else {
                        String[] palabras = dataVacna.split(" ");
                        StringBuilder renglon1 = new StringBuilder();
                        StringBuilder renglon2 = new StringBuilder();
                        StringBuilder renglon3 = new StringBuilder();
                        int currentLine = 0;
                        StringBuilder[] renglones = {renglon1, renglon2, renglon3};
                        for (String palabra : palabras) {
                            if (renglones[currentLine].length() > 0) {
                                renglones[currentLine].append(" ");
                            }

                            if (renglones[currentLine].length() + palabra.length() <= 30) {
                                renglones[currentLine].append(palabra);
                            } else {
                                if (currentLine < 2) {
                                    currentLine++;
                                }
                                renglones[currentLine].append(palabra);
                            }
                        }
                        for (int i = 0; i < 3; i++) {
                            contentStream3.beginText();
                            contentStream3.newLineAtOffset(223, 612 - (i * 10));
                            contentStream3.showText(renglones[i].toString());
                            contentStream3.endText();
                        }
                    }

                    String dataVacnatorio = (t2.getVacunatorio().getNombre() + " - " + t2.getVacunatorio().getDireccion());
                    if (dataVacnatorio.length() <= 40) {
                        contentStream3.beginText();
                        contentStream3.newLineAtOffset(223, 522);
                        contentStream3.showText(dataVacnatorio);
                        contentStream3.endText();
                    } else {
                        String[] palabras = dataVacnatorio.split(" ");
                        StringBuilder renglon1 = new StringBuilder();
                        StringBuilder renglon2 = new StringBuilder();
                        StringBuilder renglon3 = new StringBuilder();
                        StringBuilder renglon4 = new StringBuilder();
                        int currentLine = 0;
                        StringBuilder[] renglones = {renglon1, renglon2, renglon3, renglon4};
                        for (String palabra : palabras) {
                            if (renglones[currentLine].length() > 0) {
                                renglones[currentLine].append(" ");
                            }

                            if (renglones[currentLine].length() + palabra.length() <= 40) {
                                renglones[currentLine].append(palabra);
                            } else {
                                if (currentLine < 3) {
                                    currentLine++;
                                }
                                renglones[currentLine].append(palabra);
                            }
                        }
                        for (int i = 0; i < 4; i++) {
                            contentStream3.beginText();
                            contentStream3.newLineAtOffset(223, 522 - (i * 10));
                            contentStream3.showText(renglones[i].toString());
                            contentStream3.endText();
                        }
                        contentStream3.close();
                    }
                }

                if (t3 != null) {
                    contentStream4 = new PDPageContentStream(document, page4, PDPageContentStream.AppendMode.APPEND, true);
                    contentStream4.setFont(PDType1Font.HELVETICA_BOLD, 10);
                    contentStream4.setNonStrokingColor(Color.BLACK);

                    generateText(contentStream4, 223, 293, Integer.toString(t3.getVial().getNumeroSerie()));
                    generateText(contentStream4, 416, 337, "Tercera");
                    generateText(contentStream4, 416, 293, t3.getVial().getFechaColocacion().toLocalDate().toString());

                    String dataVacna = (t3.getVial().getMarca() + " - " + t3.getVial().getAntigeno());
                    if (dataVacna.length() <= 30) {
                        contentStream4.beginText();
                        contentStream4.newLineAtOffset(223, 337);
                        contentStream4.showText(dataVacna);
                        contentStream4.endText();
                    } else {
                        String[] palabras = dataVacna.split(" ");
                        StringBuilder renglon1 = new StringBuilder();
                        StringBuilder renglon2 = new StringBuilder();
                        StringBuilder renglon3 = new StringBuilder();
                        int currentLine = 0;
                        StringBuilder[] renglones = {renglon1, renglon2, renglon3};
                        for (String palabra : palabras) {
                            if (renglones[currentLine].length() > 0) {
                                renglones[currentLine].append(" ");
                            }

                            if (renglones[currentLine].length() + palabra.length() <= 30) {
                                renglones[currentLine].append(palabra);
                            } else {
                                if (currentLine < 2) {
                                    currentLine++;
                                }
                                renglones[currentLine].append(palabra);
                            }
                        }
                        for (int i = 0; i < 3; i++) {
                            contentStream4.beginText();
                            contentStream4.newLineAtOffset(223, 337 - (i * 10));
                            contentStream4.showText(renglones[i].toString());
                            contentStream4.endText();
                        }
                    }

                    String dataVacnatorio = (t3.getVacunatorio().getNombre() + " - " + t3.getVacunatorio().getDireccion());

                    if (dataVacnatorio.length() <= 40) {
                        contentStream4.beginText();
                        contentStream4.newLineAtOffset(223, 247);
                        contentStream4.showText(dataVacnatorio);
                        contentStream4.endText();
                    } else {
                        String[] palabras = dataVacnatorio.split(" ");
                        StringBuilder renglon1 = new StringBuilder();
                        StringBuilder renglon2 = new StringBuilder();
                        StringBuilder renglon3 = new StringBuilder();
                        StringBuilder renglon4 = new StringBuilder();
                        int currentLine = 0;
                        StringBuilder[] renglones = {renglon1, renglon2, renglon3, renglon4};
                        for (String palabra : palabras) {
                            if (renglones[currentLine].length() > 0) {
                                renglones[currentLine].append(" ");
                            }

                            if (renglones[currentLine].length() + palabra.length() <= 40) {
                                renglones[currentLine].append(palabra);
                            } else {
                                if (currentLine < 3) {
                                    currentLine++;
                                }
                                renglones[currentLine].append(palabra);
                            }
                        }
                        for (int i = 0; i < 4; i++) {
                            contentStream4.beginText();
                            contentStream4.newLineAtOffset(223, 247 - (i * 10));
                            contentStream4.showText(renglones[i].toString());
                            contentStream4.endText();
                        }
                        contentStream4.close();
                    }
                }
            }
            String nombreArchivo = c1.getApellido() + "_" + c1.getNombre().charAt(0) + "_" + "certificado.pdf";

            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Seleccionar ubicación de descarga");

            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos PDF", "pdf");
            fileChooser.setFileFilter(filter);
            fileChooser.setSelectedFile(new File(nombreArchivo));

            int userSelection = fileChooser.showSaveDialog(null);
            String rutaDescarga = null;
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                rutaDescarga = fileChooser.getSelectedFile().getAbsolutePath();
                document.save(rutaDescarga);
            }
            if (Desktop.isDesktopSupported() && new File(rutaDescarga).exists()) {
                try {
                    int opcion = JOptionPane.showConfirmDialog(null, "Descarga completa, ¿Desea abrirlo?", "Abrir", JOptionPane.YES_NO_OPTION);
                    if (opcion == JOptionPane.YES_OPTION) {
                        try {
                            File pdfFile = new File(rutaDescarga);
                            if (pdfFile.exists()) {
                                Desktop.getDesktop().open(pdfFile);
                            } else {
                                JOptionPane.showMessageDialog(null, "El archivo PDF no existe en la ubicación especificada.");
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void generateText(PDPageContentStream contentStream, float x, float y, String text) throws IOException {
        contentStream.setFont(PDType1Font.HELVETICA_BOLD, 10);
        contentStream.beginText();
        contentStream.newLineAtOffset(x, y);
        contentStream.showText(text);
        contentStream.endText();
    }

    public BufferedImage metodoQr(String codigo) {
        int size = 212;
        QRCodeWriter qrCodeWriter = new QRCodeWriter();

        try {
            BitMatrix matrix = qrCodeWriter.encode(codigo, BarcodeFormat.QR_CODE, size, size);
            return matrixToImage(matrix, 0);

        } catch (WriterException ex) {
            Logger.getLogger(Certificado.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    private static BufferedImage matrixToImage(BitMatrix matrix, int margin) {
        int width = matrix.getWidth();
        int height = matrix.getHeight();

        int startX = margin;
        int startY = margin;
        int newWidth = width - 2 * margin;
        int newHeight = height - 2 * margin;

        BufferedImage image = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
        for (int x = 0; x < newWidth; x++) {
            for (int y = 0; y < newHeight; y++) {
                image.setRGB(x, y, matrix.get(x + startX, y + startY) ? 0xFF000000 : 0x00000000);
            }
        }
        return image;
    }
}
