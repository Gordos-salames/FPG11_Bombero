package cuartelbomberos.Entidades;

import java.util.Date;

public class Bombero {
     private int idBombero;
    private String dni;
    private String nombreApellido;
    private Date fechaNacimiento;
    private String celular;
    private int codBrigada;
    private Brigada brigada;

    public Bombero() {
    }

    public Bombero(String dni, String nombreApellido, Date fechaNacimiento, String celular, int codBrigada, Brigada brigada) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.celular = celular;
        this.codBrigada = codBrigada;
        this.brigada = brigada;
    }

    public Bombero(int idBombero, String dni, String nombreApellido, Date fechaNacimiento, String celular, int codBrigada, Brigada brigada) {
        this.idBombero = idBombero;
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.celular = celular;
        this.codBrigada = codBrigada;
        this.brigada = brigada;
    }

    public int getIdBombero() {
        return idBombero;
    }

    public void setIdBombero(int idBombero) {
        this.idBombero = idBombero;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(int codBrigada) {
        this.codBrigada = codBrigada;
    }

    public Brigada getBrigada() {
        return brigada;
    }

    public void setBrigada(Brigada brigada) {
        this.brigada = brigada;
    }

    @Override
    public String toString() {
        return "Bombero{" + ", dni=" + dni + ", nombreApellido=" + nombreApellido + ", fechaNacimiento=" + fechaNacimiento + ", celular=" + celular + ", codBrigada=" + codBrigada + ", brigada=" + brigada + '}';
    }
    
}
