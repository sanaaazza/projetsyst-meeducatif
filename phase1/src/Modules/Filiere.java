package Modules;

import java.util.ArrayList;

public class Filiere {
    private  int id;
    private String intitulé;
    private Enseignant responsable;
    private Departement département;
    public Filiere(String intitulé,Enseignant responsable , Departement département){
        this.intitulé=intitulé;
        this.responsable=responsable;
        this.département=département;
    }
     public  static ArrayList<Module> module = new ArrayList<Module>();

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
public Filiere(){}
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static ArrayList<Module> getModules() {
        return module;
    }

    public static void setModules(ArrayList<Module> module) {
        Filiere.module = module;
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
