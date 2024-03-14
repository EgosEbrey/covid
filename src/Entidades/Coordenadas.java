package Entidades;

public class Coordenadas {
    
    private String nombre;
    private double latitud;
    private double longitud;

    public Coordenadas(String nombre, double latitud, double longitud) {
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public Coordenadas() {
    }
    
    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Coordenadas{" + "nombre=" + nombre + ", latitud=" + latitud + ", longitud=" + longitud + '}';
    }
    
    
    
}
