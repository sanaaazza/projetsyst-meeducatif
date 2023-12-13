package controlle;

import Modules.Departement;
import Modules.Enseignant;
import Services.Database;
import Services.MAIN;

import java.net.SocketTimeoutException;
import java.security.Provider;
import java.util.Scanner;

public class departementcontrolle {
    public static void showMenu() {

        System.out.println("-----------------------Departement-------------------");
        System.out.println("1.ajouter  un departement");
        System.out.println("2.spprimer un departement");
        System.out.println("3.modifier un departement");
        System.out.println("4.afficher un departement");
        System.out.println("5.retourner un departement");
        int choix= Services.MAIN.getIntInput("Veuillez choisir une option");
        switch (choix) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("veuiller choisir entre 1 et 5 ");

        }
    }
    public static void afficherDepa(){
        for(Departement departement: Database.departement){
            System.out.println("ID : "+departement.getId());
            System.out.println("Intitulé : "+departement.getIntitulé());
            if(!MAIN.isNull(departement.getResponsable())){
                System.out.println(" responsable :  "+departement.getResponsable().getNom()+" "+departement.getResponsable().getPrénom());
            }
            System.out.println("  ");
        }
    }


}

