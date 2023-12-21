package Modules;

import java.util.ArrayList;

public class Enseignant {
    private int id;
    private  String nom;
    private String prénom;
    private String email;
    private String grade;
    Departement département;
    public static ArrayList<Enseignant> enseignant = new ArrayList<Enseignant>();
     public static ArrayList<Module> module = new ArrayList<Module>();
    public Enseignant(String nom, String prénom,String email , String grade,Departement département){
        this.nom=nom;
        this.prénom=prénom;
        this.email=email;
        this.grade=grade;
        this.département=département;
    }
     public Enseignant(){
     }

    public Enseignant(int idens, String nom, String prenom, String email, String grade) {
        this.nom=nom;
        this.prénom=prenom;
        this.email=email;
        this.grade=grade;
    }

    public Enseignant(String benani, String ali, String mail, String chef) {
    }


    public static ArrayList<Enseignant> getEnseignant() {
        return enseignant;
    }

    public String getNom() {
        return nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public String getEmail() {
        return email;
    }

    public String getGrade() {
        return grade;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Departement getDépartement() {
        return département;
    }

    public void setDépartement(Departement département) {
        this.département = département;
    }

    public static ArrayList<Module> getModule() {
        return module;
    }

    public static void setModule(ArrayList<Module> module) {
        Enseignant.module = module;
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "nom='" + nom + '\'' +
                ", prénom='" + prénom + '\'' +
                ", email='" + email + '\'' +
                ", grade='" + grade + '\'' +

                '}';
    }
    public boolean equals(Enseignant obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getId()!= this.id) {
            return false;
        }
        return true;
    }


}

