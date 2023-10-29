package cuartelbomberos.Entidades;

import java.util.Date;

public class Siniestro {
    private int codigo;
    private String tipo;
    private Date fechaSiniestro;
    private int coordX;
    private int coordY;
    private String detalles;
    private Date fechaResolucion;
    private int puntuacion;
    private int codBrigada;

    public Siniestro() {
    }

    public Siniestro(String tipo, Date fechaSiniestro, int coordX, int coordY, String detalles, Date fechaResolucion, int puntuacion, int codBrigada) {
        this.tipo = tipo;
        this.fechaSiniestro = fechaSiniestro;
        this.coordX = coordX;
        this.coordY = coordY;
        this.detalles = detalles;
        this.fechaResolucion = fechaResolucion;
        this.puntuacion = puntuacion;
        this.codBrigada = codBrigada;
    }

    public Siniestro(int codigo, String tipo, Date fechaSiniestro, int coordX, int coordY, String detalles, Date fechaResolucion, int puntuacion, int codBrigada) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.fechaSiniestro = fechaSiniestro;
        this.coordX = coordX;
        this.coordY = coordY;
        this.detalles = detalles;
        this.fechaResolucion = fechaResolucion;
        this.puntuacion = puntuacion;
        this.codBrigada = codBrigada;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechaSiniestro() {
        return fechaSiniestro;
    }

    public void setFechaSiniestro(Date fechaSiniestro) {
        this.fechaSiniestro = fechaSiniestro;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Date getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(Date fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(int codBrigada) {
        this.codBrigada = codBrigada;
    }

    @Override
    public String toString() {
        return "Siniestro{" + "codigo=" + codigo + ", tipo=" + tipo + ", fechaSiniestro=" + fechaSiniestro + ", coordX=" + coordX + ", coordY=" + coordY + ", detalles=" + detalles + ", fechaResolucion=" + fechaResolucion + ", puntuacion=" + puntuacion + ", codBrigada=" + codBrigada + '}';
    }
    
    
    
}
