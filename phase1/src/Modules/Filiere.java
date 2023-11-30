package Modules;

public class Filiere {
    private String intitulé;
    private Enseignant responsable;
    private Departement département;
    public Filiere(String intitulé,Enseignant responsable , Departement département){
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

    public Departement getDépartement() {
        return département;
    }

    public void setIntitulé(String intitulé) {
        this.intitulé = intitulé;
    }

    public void setResponsable(Enseignant responsable) {
        this.responsable = responsable;
    }

    public void setDépartement(Departement département) {
        this.département = département;
    }
}
