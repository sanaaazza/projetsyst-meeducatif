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
    public static   List<Etudiant> etudiants=new ArrayList<Etudiant>();
    public static   List<Enseignant> enseignant = new ArrayList<Enseignant>();
    public static   List<Filiere> filieres = new ArrayList<Filiere>();
    public static   List<Module> modules = new ArrayList<Module>();
    public static  List<Departement> departement = new ArrayList<Departement>();
}