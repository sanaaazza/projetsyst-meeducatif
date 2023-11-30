package phase1;

public class Filiere {
    private String intitulé;
    private Enseignant responsable;
    private Département département;
    public Filière(String intitulé,Enseignant responsable , Département département){
        this.intitulé=intitulé;
        this.responsable=responsable;
        this.département=département;
    }

    public String getIntitulé() {
        return intitulé;
    }

    public Enseignant getResponsable() {
        return responsable;
    }

    @Override
    public String toString() {
        return "Filière{" +
                "intitulé='" + intitulé + '\'' +
                ", responsable=" + responsable +
                ", département=" + département +
                '}';
    }

    public Département getDépartement() {
        return département;
    }

    public void setIntitulé(String intitulé) {
        this.intitulé = intitulé;
    }

    public void setResponsable(Enseignant responsable) {
        this.responsable = responsable;
    }

    public void setDépartement(Département département) {
        this.département = département;
    }
}