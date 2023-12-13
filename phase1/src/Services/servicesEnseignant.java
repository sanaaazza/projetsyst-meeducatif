package Services;

import Modules.Departement;
import Modules.Enseignant;

import java.util.ArrayList;

public class servicesEnseignant {
    public static Enseignant addEns(String nom, String prenom, String email, String grade, Departement departement) {
        Enseignant enseignant = new Enseignant();
        enseignant.setNom(nom);
        enseignant.setPrénom(prenom);
        enseignant.setGrade(grade);
        enseignant.setEmail(email);
        enseignant.setDépartement(departement);
        enseignant.setId(Database.getId_DP());
        Database.enseignant.add(enseignant);
        return enseignant;
    }

    public static Enseignant updateEns(int id, String nom, String prenom, String email, String grade, Departement departement) {
        for (Enseignant enseignant : Database.enseignant) {
            if (enseignant.getId() == id) {
                enseignant.setNom(nom);
                enseignant.setPrénom(prenom);
                enseignant.setGrade(grade);
                enseignant.setEmail(email);
                enseignant.setDépartement(departement);
            }
            return enseignant;
        }
        return new Enseignant();
    }

    public static Enseignant getEnsbyid(int id) {
        for (Enseignant enseignant : Database.enseignant) {
            if (enseignant.getId() == id) {
                return enseignant;
            }
        }
        return new Enseignant();
    }

    public static ArrayList<Enseignant> deleteEnsbyid(int id) {
        Database.enseignant.remove(getEnsbyid(id));
        return Database.enseignant;
    }
    public static ArrayList<Enseignant> getAllEns(){
        return Database.enseignant;
    }
}
