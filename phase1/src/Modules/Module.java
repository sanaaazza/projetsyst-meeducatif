package Modules;

public class Module {
    private int id;
    private String intitulé;
    private Filiere filière;
    private Enseignant professeur;
    public Module(String intitulé, Filiere filière, Enseignant professeur){
        this.intitulé=intitulé;
        this.filière=filière;
        this.professeur=professeur;
    }

    public  Module(){}
    public String getIntitulé() {
        return intitulé;
    }

    public Filiere getFilière() {
        return filière;
    }

    @Override
    public String toString() {
        return "Module{" +
                "intitulé='" + intitulé + '\'' +
                ", filière=" + filière +
                ", professeur=" + professeur +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Enseignant getProfesseur() {
        return professeur;
    }

    public void setIntitulé(String intitulé) {
        this.intitulé = intitulé;
    }

    public void setFilière(Filiere filière) {
        this.filière = filière;
    }

    public void setProfesseur(Enseignant professeur) {
        this.professeur = professeur;
    }
}
