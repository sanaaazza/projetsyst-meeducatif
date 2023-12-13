package Services;

import Modules.*;
import Modules.Module;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public static int Id_ET=0;
    public static int Id_ES=0;
    public static int Id_MD=0;
    public static int Id_FL=0;
    public static int Id_DP=0;
    public static ArrayList<Etudiant> etudiants=new ArrayList<Etudiant>();
    public static  ArrayList<Enseignant> enseignant = new ArrayList<Enseignant>();
    public static  ArrayList<Filiere> filieres = new ArrayList<Filiere>();
    public static  ArrayList<Module> modules = new ArrayList<Module>();
    public static  ArrayList<Departement> departement = new ArrayList<Departement>();
    public static ArrayList<Note> note= new ArrayList<Note>();
     public static int getId_ET(){
         Id_ET++;
         return Id_ET;
     }

    public static int getId_DP() { Id_DP++;
        return Id_DP;
    }

    public static int getId_ES() {Id_ES++;
        return Id_ES;
    }

    public static int getId_FL() {Id_FL++;
        return Id_FL;
    }

    public static int getId_MD() {Id_MD++;
        return Id_MD;
    }
}