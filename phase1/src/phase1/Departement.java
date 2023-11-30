package phase1;

public class Departement { private String intitulé;
    private  Enseignant responsable;
    public Département(String intitulé, Enseignant responsable){
        this.intitulé=intitulé;
        this.responsable=responsable;

    }

    public String getIntitulé() {
        return intitulé;
    }

    public Enseignant getResponsable() {
        return responsable;
    }

    public void setResponsable(Enseignant responsable) {
        this.responsable = responsable;
    }

    public void setIntitulé(String intitulé) {
        this.intitulé = intitulé;
    }

    @Override
    public String toString() {
        return "Département{" +
                "intitulé='" + intitulé + '\'' +
                ", responsable=" + responsable +
                '}';
    }
}
