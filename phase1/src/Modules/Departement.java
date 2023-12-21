package Modules;

import java.util.ArrayList;

public class Departement { private static String intitulé;
    private static Enseignant responsable;
    private ArrayList<Filiere> filieres = new ArrayList<Filiere>();
     private int id;
    public Departement(String intitulé, Enseignant responsable){
        this.intitulé=intitulé;
        this.responsable=responsable;

    }

    public Departement() {
    }

    public Departement(int id, String intitulé, String enseignant) {
        this.id=id;
        this.intitulé=intitulé;
        this.responsable=responsable;
    }



    public String getIntitulé() {
        return this.intitulé;
    }

    public Enseignant getResponsable() {
        return this.responsable;
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

    public String toString() {
        return "Département{" +
                "id = " + id + '\''+
                "intitulé='" + intitulé + '\'' +
                ", responsable=" + responsable.getId() +

                '}';
    }

}
