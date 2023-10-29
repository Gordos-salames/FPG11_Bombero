package cuartelbomberos.Entidades;
public class Brigada {
private int codBrigada;
    private String nombreBr;
    private String especialidad;
    private boolean libre;
    private int nroCuartel;

    public Brigada() {
    }

    public Brigada(String nombreBr, String especialidad, boolean libre, int nroCuartel) {
        this.nombreBr = nombreBr;
        this.especialidad = especialidad;
        this.libre = libre;
        this.nroCuartel = nroCuartel;
    }

    public Brigada(int codBrigada, String nombreBr, String especialidad, boolean libre, int nroCuartel) {
        this.codBrigada = codBrigada;
        this.nombreBr = nombreBr;
        this.especialidad = especialidad;
        this.libre = libre;
        this.nroCuartel = nroCuartel;
    }

    public int getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(int codBrigada) {
        this.codBrigada = codBrigada;
    }

    public String getNombreBr() {
        return nombreBr;
    }

    public void setNombreBr(String nombreBr) {
        this.nombreBr = nombreBr;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public int getNroCuartel() {
        return nroCuartel;
    }

    public void setNroCuartel(int nroCuartel) {
        this.nroCuartel = nroCuartel;
    }

    @Override
    public String toString() {
        return "Brigada{" + "codBrigada=" + codBrigada + ", nombreBr=" + nombreBr + ", especialidad=" + especialidad + ", libre=" + libre + ", nroCuartel=" + nroCuartel + '}';
    }
    
    
    
}
