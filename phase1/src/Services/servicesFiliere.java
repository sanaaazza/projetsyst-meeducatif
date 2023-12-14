package Services;

import Modules.Departement;
import Modules.Enseignant;
import Modules.Filiere;

import java.util.ArrayList;

public class servicesFiliere {
    public static Filiere addFL(String intitulé, Enseignant responsable , Departement département){
        Filiere filiere=new Filiere();
        filiere.setIntitulé(intitulé);
        filiere.setResponsable(responsable);
        filiere.setDépartement(département);
        filiere.setId(Database.getId_ET());
        Database.filiere.add(filiere);
        return filiere;
    }
    public static Filiere uppdatFL( String intitulé, Enseignant responsable , Departement département){
        for (Filiere filiere:Database.filiere){
            if(filiere.getId()==id){
                filiere.setIntitulé(intitulé);
                filiere.setResponsable(responsable);
                filiere.setDépartement(département);
            }return filiere;
        }return new Filiere();
    }
    public static Filiere getFLbyid(int id){
        for (Filiere filiere: Database.filiere){
            if(filiere.getId()==id){return filiere;}
    } return new Filiere();}
    public static ArrayList<Filiere>  delleteFLbyid(int id){
        Database.filiere.remove(getFLbyid(id));
        return Database.filiere;
    }
    public static ArrayList<Filiere> getAllFL(){
        return Database.filiere;
    }
}

