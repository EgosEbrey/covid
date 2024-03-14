package Entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Vial {
    
    private int idVial;
    private int numeroSerie;
    private String marca;
    private String antigeno;
    private LocalDate fechaVencimiento;
    private int volumenVial;
    private int estado;
    private int volumenVacuna;
    private LocalDateTime fechaColocacion;
    private Vacunatorio vacunatorio;

    public Vial(int idVial, int numeroSerie, String marca, String antigeno, LocalDate fechaVencimiento, int volumenVial, int estado, int volumenVacuna, LocalDateTime fechaColocacion, Vacunatorio vacunatorio) {
        this.idVial = idVial;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.antigeno = antigeno;
        this.fechaVencimiento = fechaVencimiento;
        this.volumenVial = volumenVial;
        this.estado = estado;
        this.volumenVacuna = volumenVacuna;
        this.fechaColocacion = fechaColocacion;
        this.vacunatorio = vacunatorio;
    }

    public Vial(int numeroSerie, String marca, String antigeno, LocalDate fechaVencimiento, int volumenVial, int estado, int volumenVacuna, LocalDateTime fechaColocacion, Vacunatorio vacunatorio) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.antigeno = antigeno;
        this.fechaVencimiento = fechaVencimiento;
        this.volumenVial = volumenVial;
        this.estado = estado;
        this.volumenVacuna = volumenVacuna;
        this.fechaColocacion = fechaColocacion;
        this.vacunatorio = vacunatorio;
    }

    public Vial() {
    }

    public int getIdVial() {
        return idVial;
    }

    public void setIdVial(int idVial) {
        this.idVial = idVial;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAntigeno() {
        return antigeno;
    }

    public void setAntigeno(String antigeno) {
        this.antigeno = antigeno;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getVolumenVial() {
        return volumenVial;
    }

    public void setVolumenVial(int volumenVial) {
        this.volumenVial = volumenVial;
    }

    public int isEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getVolumenVacuna() {
        return volumenVacuna;
    }

    public void setVolumenVacuna(int volumenVacuna) {
        this.volumenVacuna = volumenVacuna;
    }

    public LocalDateTime getFechaColocacion() {
        return fechaColocacion;
    }

    public void setFechaColocacion(LocalDateTime fechaColocacion) {
        this.fechaColocacion = fechaColocacion;
    }

    public Vacunatorio getVacunatorio() {
        return vacunatorio;
    }

    public void setVacunatorio(Vacunatorio vacunatorio) {
        this.vacunatorio = vacunatorio;
    }

    @Override
    public String toString() {
        return "Vial{" + "idVial=" + idVial + ", numeroSerie=" + numeroSerie + ", marca=" + marca + ", antigeno=" + antigeno + ", fechaVencimiento=" + fechaVencimiento + ", volumenVial=" + volumenVial + ", estado=" + estado + ", volumenVacuna=" + volumenVacuna + ", fechaColocacion=" + fechaColocacion + ", vacunatorio=" + vacunatorio + '}';
    }

}
