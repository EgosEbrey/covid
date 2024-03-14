package Entidades;
 
import java.time.LocalDate;

public class Pedidos {
    
    private int idPedido;
    private Vacunatorio centro;
    private int Pf;
    private int Astra;
    private int Spuk;
    private int Jhon;
    private int Syno;
    private String estado;
    private LocalDate fecha;
    
    public Pedidos(Vacunatorio centro, int Pf,int Astra,int Spuk,int Jhon,int Syno, String estado, LocalDate fecha){
        this.centro = centro;
        this.Pf = Pf;
        this.Astra = Astra;
        this.Spuk = Spuk;
        this.Jhon = Jhon;
        this.Syno = Syno;
        this.estado = estado;
        this.fecha = fecha;
    }

    public Pedidos() {
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Vacunatorio getCentro() {
        return centro;
    }

    public void setCentro(Vacunatorio centro) {
        this.centro = centro;
    }

    public int getPf() {
        return Pf;
    }

    public void setPf(int Pf) {
        this.Pf = Pf;
    }

    public int getAstra() {
        return Astra;
    }

    public void setAstra(int Astra) {
        this.Astra = Astra;
    }

    public int getSpuk() {
        return Spuk;
    }

    public void setSpuk(int Spuk) {
        this.Spuk = Spuk;
    }

    public int getJhon() {
        return Jhon;
    }

    public void setJhon(int Jhon) {
        this.Jhon = Jhon;
    }

    public int getSyno() {
        return Syno;
    }

    public void setSyno(int Syno) {
        this.Syno = Syno;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return idPedido + " - " + centro.getNombre() + " - " + fecha.toString();
    }
    
    
}
