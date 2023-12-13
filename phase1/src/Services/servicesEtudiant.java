package Services;

import Modules.Etudiant;
import Modules.Filiere;

import java.util.ArrayList;

public class servicesEtudiant{
    public  static Etudiant addET(String nom, String email, int apogée , Filiere filière){
        Etudiant etudiant=new Etudiant();
        etudiant.setNom(nom);
        etudiant.setEmail(email);
        etudiant.setApogée(apogée);
        etudiant.setFiliere(filière);
       etudiant.setId(Database.getId_ET());
        Database.etudiant.add(etudiant);
        return etudiant;
    }
    public  static Etudiant uppdateET(int id,String nom, String email, int apogée , Filiere filière){
        for (Etudiant etudiant:Database.etudiant){
            if(etudiant.getId()==id){ etudiant.setNom(nom);
                etudiant.setEmail(email);
                etudiant.setApogée(apogée);
                etudiant.setFiliere(filière);
        }return etudiant;
    } return new Etudiant(); }
    public static Etudiant getEtbyid(int id){
        for (Etudiant etudiant: Database.etudiant){
            if(etudiant.getId()==id){
                return etudiant;
            }
        } return  new Etudiant();
    }
    public  static ArrayList<Etudiant> deleteEtbyid(int id){
        Database.etudiant.remove(getEtbyid(id));
        return Database.etudiant;
    }
    public static ArrayList<Etudiant> getAllET(){
        return Database.etudiant;
    }
}
