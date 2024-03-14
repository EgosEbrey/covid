package Entidades;

import Conexion.*;

public class LogIN {
    
    private int usuario;
    private String clave;
    private int estado;
    private int ingresos;
    private int recordar;

    public LogIN(int usuario, String clave, int estado, int ingresos, int recordar) {
        this.usuario = usuario;
        this.clave = clave;
        this.estado = estado;
        this.ingresos = ingresos;
        this.recordar = recordar;
    }

    public LogIN(String clave, int estado, int ingresos, int recordar) {
        this.clave = clave;
        this.estado = estado;
        this.ingresos = ingresos;
        this.recordar = recordar;
    }

    public LogIN() {
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIngresos() {
        return ingresos;
    }

    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }

    public int getRecordar() {
        return recordar;
    }

    public void setRecordar(int recordar) {
        this.recordar = recordar;
    }

    @Override
    public String toString() {
        return "LogIN{" + "usuario=" + usuario + ", clave=" + clave + ", estado=" + estado + ", ingresos=" + ingresos + ", recordar=" + recordar + '}';
    }
            
    
    
   
}
