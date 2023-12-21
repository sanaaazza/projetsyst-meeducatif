package controlle;

import Modules.Departement;
import Modules.Enseignant;
import Services.Database;
import Services.MAIN;

public class departementcontrolle {
    public static void showMenu() {

        System.out.println("-----------------------Departement-------------------");
        System.out.println("1.ajouter  un departement");
        System.out.println("2.spprimer un departement");
        System.out.println("3.modifier un departement");
        System.out.println("4.afficher un departement");
        System.out.println("5.retourner un au menu principale");
        int choix= Services.MAIN.getIntInput("Veuillez choisir une option");
        switch (choix) {
            case 1:ajouterDepa();
                break;
            case 2:destroyDepartement();
                break;
            case 3:editDepa();
                break;
            case 4:afficherDepa();
                break;
            case 5:MAIN.showMenu();
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
                System.out.println("responsable :  "+ departement.getResponsable().getNom() +" "+ departement.getResponsable().getPrénom());
            }
            System.out.println("  ");}}
    public static void ajouterDepa(){
        String intitule = MAIN.getStringInput("Entrez l'intitulé :");
        enseignantcontrolle.afficherEns();
        int id = MAIN.getIntInput("Sélecionnez un enseignant par id :");
        Enseignant enseignant= Services.servicesEnseignant.getEnsbyid(id);
if(!enseignant.equals(enseignant)){System.out.println("enseignant n'existe pas ");
            showMenu(); return;}
       if(enseignant.equals(enseignant)){
            Services.servicesDepartement.addDepa(intitule, Services.servicesEnseignant.getEnsbyid(id));
            System.out.println("ajout avec succes");
        afficherDepa();}
      else {System.out.println("Echec d'ajout");}
        showMenu();
    }
    public static void editDepa(){
      afficherDepa();
        int id = MAIN.getIntInput("Sélecionnez un departement par id :");
        String intitule = MAIN.getStringInput("Entrez l'intitulé :");
        enseignantcontrolle.afficherEns();
        int idEns = MAIN.getIntInput("Sélecionnez un enseignant par id :");

        Services.servicesDepartement.updateDepa(id, intitule, Services.servicesEnseignant.getEnsbyid(idEns));

        afficherDepa();
        showMenu();
    }
    public static void destroyDepartement(){
      afficherDepa();
        int id = MAIN.getIntInput("Sélecionnez un departement par id :");
        Services.servicesDepartement.deleteDepabyid(id);
        System.out.println("suppression avec succès");
        afficherDepa();

    }



}

