package Modules;

import java.util.ArrayList;

public class Departement { private String intitulé;
    private  Enseignant responsable;
    private ArrayList<Filiere> filieres = new ArrayList<Filiere>();
     private int id;
    public Departement(String intitulé, Enseignant responsable){
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

    public ArrayList<Filiere> getFilieres() {
        return filieres;
    }

    public void setFilieres(ArrayList<Filiere> filieres) {
        this.filieres = filieres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Département{" +
                "intitulé='" + intitulé + '\'' +
                ", responsable=" + responsable +
                '}';
    }

}
