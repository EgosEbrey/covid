package Entidades;

public class Vacunatorio {
    
    private int idVacunatorio;
    private String nombre;
    private Coordenadas ubicacion;
    private boolean estado;
    private Vial vial;
    private String direccion;
    

    public Vacunatorio(String nombre, Coordenadas ubicacion, boolean estado, Vial vial, String direccion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.estado = estado;
        this.vial = vial;
        this.direccion = direccion;
        
    }

    public Vacunatorio() {
    }

    public int getIdVacunatorio() {
        return idVacunatorio;
    }

    public void setIdVacunatorio(int idVacunatorio) {
        this.idVacunatorio = idVacunatorio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Coordenadas getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Coordenadas ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Vial getVial() {
        return vial;
    }

    public void setVial(Vial vial) {
        this.vial = vial;
    }

  
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Vacunatorio{" + "idVacunatorio=" + idVacunatorio + ", nombre=" + nombre + ", ubicacion=" + ubicacion + ", estado=" + estado + ", vial=" + vial +", direccion=" + direccion + '}';
    }

    
    
}
