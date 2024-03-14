package Conexion;

import Entidades.Ciudadano;
import Entidades.Turno;
import Entidades.Vacunatorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

public class ArmadoDatosBD {

    private Connection con = Conectar.getConectar();
    private CiudadanoData cD = new CiudadanoData();
    private VacunatorioData vD = new VacunatorioData();
    private TurnoData tD = new TurnoData();

    public void armarTurnos_COMPLETAR_BASE_DATOS() {
        ArrayList<Ciudadano> ciudadanos = cD.buscarCiudadanos(0,"todos");
        Vacunatorio vac;
        Turno turno;
        LocalDate fecha = LocalDate.of(2023, 10, 1);

        for (Ciudadano ciudadano : ciudadanos) {
            vac = vD.vacunatorioCercano(ciudadano);
            int turnos_libres;
            do {
                turnos_libres = tD.buscarTurnoLibre_porTurnosLibres(fecha, vac);
                fecha = fecha.plusDays(1);
            } while (turnos_libres <= 0);

            ArrayList<String> turnos = tD.armarArrayHorariosLibres(fecha.minusDays(1), vac);

            if (!turnos.isEmpty()) {
                Random random = new Random();
                int indice_aleatorio = random.nextInt(turnos.size());
                String turno_aleatorio = turnos.get(indice_aleatorio);

                turno = new Turno();
                turno.setFecha(tD.colocarHora_aFecha(fecha.minusDays(1), turno_aleatorio));
                turno.setVacunatorio(vac);
                ciudadano.setTurno(turno);
                int updates = cD.cargarTurno(ciudadano);
                if (updates > 0) {
                    tD.actualizarTurnero_Hora(ciudadano.getTurno());
                    tD.updateTurno_Libre(ciudadano.getTurno());
                }
            }
        }
    }

    public void acomodarTurnero(LocalDate fecha) {
        int total = 0;
        PreparedStatement ps;
        String sql = "SELECT * FROM turnero_3 WHERE fecha = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, fecha.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")).toString());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String[] values = {"8_9", "9_10", "10_11", "11_12", "12_13", "13_14", "14_15", "15_16", "16_17"};
                for (String value : values) {
                    total += rs.getInt(value);
                }
            }
            ps = null;

            String sql2 = "UPDATE turnero_3 SET turnos_libres = ? WHERE fecha = ?";

            ps = con.prepareStatement(sql2);
            ps.setInt(1, total);
            ps.setDate(2, java.sql.Date.valueOf(fecha));

            int resultado2 = ps.executeUpdate();
        } catch (SQLException e) {
        }

    }

    public void vacunar_Aleatorios() {
        ArrayList<Ciudadano> ciudadanos = cD.buscarCiudadanos(0, "todos");

        for (Ciudadano ciudadano : ciudadanos) {
            for (Turno turno : tD.listar_Turnos(null, null, "DNI", null, ciudadano.getDNI())) {
                if (turno.isEstado().equalsIgnoreCase("Pendiente")) {
                    int menem = (int) (Math.random() * 10);
                    if (menem < 7) {
                        tD.actualizar_VialFecha_TurnoData(tD.buscar_VialParaAsignar(ciudadano).get(0), turno, ciudadano);
                    }
                }
            }
        }
    }
    
    public void corregirAntigenos(){
        String sql = "UPDATE viales SET Antigeno = ? WHERE Antigeno = ?";
        
        PreparedStatement ps = null;
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(2, "Adenovirus rAd26 con gliproteina S del virus SARS-CoV-2");
            ps.setString(1,"Adenovirus rAd26::S de SARS-CoV-2");
            int resultado = ps.executeUpdate();
        }catch (SQLException e){}
    }
    
}
