package Entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class Ciudadano {
    
    private int idCiudadano;
    private int DNI;
    private String nombre;
    private String apellido;
    private String email;
    private long celular;
    private String ambitoTrabajo;
    private int dosisAplicadas;
    private Coordenadas cordenadas;
    private ArrayList<String> patologias;
    private Turno turno;
    private LocalDate fechaNacimiento;

    public Ciudadano(int DNI, String nombre, String apellido, String email, long celular, String ambitoTrabajo, int dosisAplicadas, Coordenadas cordenadas, ArrayList<String> patologias, Turno turno, LocalDate fechaNacimiento) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.celular = celular;
        this.ambitoTrabajo = ambitoTrabajo;
        this.dosisAplicadas = dosisAplicadas;
        this.cordenadas = cordenadas;
        this.patologias = patologias;
        this.turno = turno;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Ciudadano() {
    }

    public int getIdCiudadano() {
        return idCiudadano;
    }

    public void setIdCiudadano(int idCiudadano) {
        this.idCiudadano = idCiudadano;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getAmbitoTrabajo() {
        return ambitoTrabajo;
    }

    public void setAmbitoTrabajo(String ambitoTrabajo) {
        this.ambitoTrabajo = ambitoTrabajo;
    }

    public int getDosisAplicadas() {
        return dosisAplicadas;
    }

    public void setDosisAplicadas(int dosisAplicadas) {
        this.dosisAplicadas = dosisAplicadas;
    }

    public Coordenadas getCordenadas() {
        return cordenadas;
    }

    public void setCordenadas(Coordenadas cordenadas) {
        this.cordenadas = cordenadas;
    }

    public ArrayList<String> getPatologias() {
        return patologias;
    }

    public void setPatologias(ArrayList<String> patologias) {
        this.patologias = patologias;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Ciudadano{" + "idCiudadano=" + idCiudadano + ", DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", celular=" + celular + ", ambitoTrabajo=" + ambitoTrabajo + ", dosisAplicadas=" + dosisAplicadas + ", cordenadas=" + cordenadas + ", patologias=" + patologias + ", turno=" + turno + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
        
}

   