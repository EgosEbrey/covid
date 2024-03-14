package Entidades;

public class Laboratorio {
    
    private String cuit;
    private String nombre;
    private String pais;
    private Coordenadas coordenadas; 
    private int stock;
    private Vial vial;
    private boolean estado;

    public Laboratorio(String cuit, String nombre, String pais, Coordenadas coordenadas, int stock, Vial vial, boolean estado) {
        this.cuit = cuit;
        this.nombre = nombre;
        this.pais = pais;
        this.coordenadas = coordenadas;
        this.stock = stock;
        this.vial = vial;
        this.estado = estado;
    }

    public Laboratorio() {
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Coordenadas getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Coordenadas coordenadas) {
        this.coordenadas = coordenadas;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Vial getVial() {
        return vial;
    }

    public void setVial(Vial vial) {
        this.vial = vial;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Laboratorio{" + "cuit=" + cuit + ", nombre=" + nombre + ", pais=" + pais + ", coordenadas=" + coordenadas + ", stock=" + stock + ", vial=" + vial + ", estado=" + estado + '}';
    }

    
  
}
