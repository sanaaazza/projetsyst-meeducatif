package controlle;
import Modules.Etudiant;
import Modules.Filiere;
import Services.Database;
import Services.MAIN;

import java.security.PublicKey;

public class etudiantcontrolle {
    public static void showMenu() {

        System.out.println("-----------------------Etudiant-------------------");
        System.out.println("1.ajouter  un Etudiant");
        System.out.println("2.spprimer un Etudiant");
        System.out.println("3.modifier un Etudiant");
        System.out.println("4.afficher un Etudiant");
        System.out.println("5.retourner un au menu principale");
        int choix= Services.MAIN.getIntInput("Veuillez choisir une option");
        switch (choix) {
            case 1:ajouterET();
                break;
            case 2:destroyET();
                break;
            case 3:EditET();
                break;
            case 4:afficherET();
                break;
            case 5:MAIN.showMenu();
                break;
            default:
                System.out.println("veuiller choisir entre 1 et 5 ");

        }
    }
    public static void afficherET(){
       for(Etudiant etudiant :Database.etudiant){
           System.out.println("Nom  "+etudiant.getNom());
           System.out.println("Apogée  "+etudiant.getApogée());
           System.out.println("Email  "+etudiant.getEmail());
           System.out.println("Filiere  "+etudiant.getFilière());
           if(!MAIN.isNull(etudiant.getFilière())){
               System.out.println("Filiere :"+etudiant.getFilière().getIntitulé()+etudiant.getFilière().getResponsable());
           }
       }System.out.println("  ");
    }
    public static  void ajouterET(){
        String nom=MAIN.getStringInput("entrer un nom");
       int apoge=MAIN.getIntInput("entrer un apogé");
        String Email=MAIN.getStringInput("entrer un email");
        String filiere=MAIN.getStringInput("entrer un filiere");
        filierecontrolle.afficherFL();
        int id=MAIN.getIntInput("entrer id pour une filiere");
        Services.servicesEtudiant.addET(nom,Email,apoge,Services.servicesFiliere.getFLbyid(id));
      afficherET();
      showMenu();
    }
    public  static void EditET(){
        afficherET();
        int id=MAIN.getIntInput("entrer un id ");
        String nom=MAIN.getStringInput("enter un nom");
        int apoge=MAIN.getIntInput("entrer un apogé");
        String Email=MAIN.getStringInput("entrer un email");
        String filiere=MAIN.getStringInput("entrer un filiere");
        filierecontrolle.afficherFL();
        int idFL=MAIN.getIntInput("entrer un id pour une filiere");
       Services.servicesEtudiant.uppdateET(id,nom,Email,apoge,Services.servicesFiliere.getFLbyid(idFL));
       afficherET();
       showMenu();
        }
    public  static void destroyET(){
     afficherET();
        int id = MAIN.getIntInput("Sélecionnez une filiere par id :");
        Services.servicesFiliere.delleteFLbyid(id);
        afficherET();

    }
}

