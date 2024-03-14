package Entidades;

public class Medico {
    
    private Vacunatorio centro;
    private String nombre;
    private int matricula;

    public Medico(Vacunatorio centro, String nombre, int matricula) {
        this.centro = centro;
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public Vacunatorio getCentro() {
        return centro;
    }

    public void setCentro(Vacunatorio centro) {
        this.centro = centro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Medico{" + "centro=" + centro + ", nombre=" + nombre + ", matricula=" + matricula + '}';
    }
    
    
    
    
}
