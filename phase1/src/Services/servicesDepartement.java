package Services;

import Modules.Departement;
import Modules.Enseignant;

import java.util.ArrayList;

public class servicesDepartement {
    public static Departement addDepa(String intitulé, Enseignant... responsable) {
        Departement departement = new Departement();
        departement.setIntitulé(intitulé);
        departement.setId(Database.getId_DP());
        if (responsable.length > 0) {
            departement.setResponsable(responsable[0]);
        }
        Database.departement.add(departement);
        return departement;
    }

    public static Departement updateDepa(int id, String intitulé, Enseignant... responsable) {
        for (Departement departement : Database.departement) {
            if (departement.getId() == id) {
                departement.setIntitulé(intitulé);
                if (responsable.length > 0) {
                    departement.setResponsable(responsable[0]);
                }
            }
            return departement;
        }
        return new Departement();
    }

    public static Departement getDepabyid(int id) {
        for (Departement departement : Database.departement) {
            if (departement.getId() == id) {
                return departement;
            }
        }
        return new Departement();
    }

    public static ArrayList<Departement> deleteDepabyid(int id) {
        Database.departement.remove(getDepabyid(id));
        return Database.departement;
    }
    public static ArrayList<Departement> getAlldepa(){
        return Database.departement;
    }
}

