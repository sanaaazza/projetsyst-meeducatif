package Modules;

import java.util.ArrayList;

public class Departement {
    public static ArrayList<Departement> departements = new ArrayList<>();
    private String intitulé;
    private Enseignant responsable;
    private ArrayList<Filiere> filieres = new ArrayList<>();
    private int id;



    public ArrayList<Departement> getDepartements() {
        return departements;
    }

    public void setDepartements(ArrayList<Departement> departements) {
        this.departements = departements;
    }

    public Departement() {
    }

    public Departement(int id, String intitulé, Enseignant ensei) {
        this.id = id;
        this.intitulé = intitulé;
        this.responsable = ensei;
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

    public String toString() {
        return "Département{" +
                "id='" + id + '\'' +
                ", intitulé='" + intitulé + '\'' +
                ", responsable=" + responsable.getId() +
                '}';
    }
}