package controlle;

import Modules.Module;
import Services.Database;
import Services.MAIN;

public class modulecontrolle {
    public static void showMenu() {

        System.out.println("-----------------------Module-------------------");
        System.out.println("1.ajouter  un Module");
        System.out.println("2.spprimer un Module ");
        System.out.println("3.modifier un Module");
        System.out.println("4.afficher un Module");
        System.out.println("5.retourner un au menu principale");
        int choix = Services.MAIN.getIntInput("Veuillez choisir une option");
        switch (choix) {
            case 1:ajouterMD();
                break;
            case 2:destroyModule();
                break;
            case 3:editMD();
                break;
            case 4:afficherMD();
                break;
            case 5:
                MAIN.showMenu();
                break;
            default:
                System.out.println("veuiller choisir entre 1 et 5 ");

        }
    }

    public static void afficherMD() {
        for (Module module : Database.module) {
            System.out.println("Id :" + module.getId());
            System.out.println("Intitule :" + module.getIntitulé());
            if (!MAIN.isNull(module.getFilière())) {
                System.out.println("Filiere : " + module.getFilière().getIntitulé() + " et " + module.getFilière().getDépartement());
            }
            if (!MAIN.isNull(module.getProfesseur())) {
                System.out.println(module.getProfesseur().getNom() + " et " + module.getProfesseur().getPrénom() + " et " + module.getProfesseur().getEmail());
            }

        }
        System.out.println(" ");
    }
    public static void ajouterMD(){
      String intitule=MAIN.getStringInput("enter un intitule");
        filierecontrolle.afficherFL();
        enseignantcontrolle.afficherEns();
        int id1=MAIN.getIntInput("entrer une filiere par un id");
        int id2=MAIN.getIntInput("entrer un enseignant par id");
        Services.servicesModule.addMD(intitule,Services.servicesFiliere.getFLbyid(id1),Services.servicesEnseignant.getEnsbyid(id2));
    afficherMD();
    showMenu();
    }
    public static void editMD(){
        afficherMD();
        int id=MAIN.getIntInput("enter un id ");
        String intitule=MAIN.getStringInput("entrer un intitulé");
        filierecontrolle.afficherFL();
        enseignantcontrolle.afficherEns();
        int idES=MAIN.getIntInput("entrer un enseignant par id");
        int idFl=MAIN.getIntInput("enter un departement par id ");
        Services.servicesModule.uppdateMD(id,intitule,Services.servicesFiliere.getFLbyid(idFl),Services.servicesEnseignant.getEnsbyid(idFl));
        afficherMD();
        showMenu();
    }
    public static void destroyModule(){
        afficherMD();
        int id=MAIN.getIntInput("enter un id ");
        Services.servicesModule.getMDbyid(id);
        afficherMD();
    }
}

