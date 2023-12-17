package controlle;

import Modules.Departement;
import Modules.Enseignant;
import Services.Database;
import Services.MAIN;

import static Services.Database.departement;
import static Services.Database.enseignant;

public class enseignantcontrolle {
    public static void showMenu() {

        System.out.println("-----------------------Enseignant-------------------");
        System.out.println("1.ajouter  un enseignant");
        System.out.println("2.spprimer un enseignant");
        System.out.println("3.modifier un enseignant");
        System.out.println("4.afficher un enseignant");
        System.out.println("5.retourner un au menu principale");
        int choix= Services.MAIN.getIntInput("Veuillez choisir une option");
        switch (choix) {
            case 1:afficherEns();
                break;
            case 2:destroyEnseignant();
                break;
            case 3:editEns();
                break;
            case 4:afficherEns();
                break;
            case 5:
                MAIN.showMenu();
                break;
            default:
                System.out.println("veuiller choisir entre 1 et 5 ");

        }
    }
    public static void afficherEns(){
        for(Enseignant enseignant: enseignant){
            System.out.println("ID : "+enseignant.getId());
            System.out.println("Prénom : "+enseignant.getPrénom());
            System.out.println("Nom : "+enseignant.getNom());
            System.out.println("Email : "+enseignant.getEmail());
            System.out.println("Grade : "+enseignant.getGrade());
            System.out.println("Département : "+enseignant.getDépartement());

            if(!MAIN.isNull(enseignant.getDépartement())){
                System.out.println(" Département :  "+enseignant.getDépartement().getIntitulé()+" et "+enseignant.getDépartement().getResponsable());
            }
            System.out.println("  ");}}
    public static void ajouterEns(){
        String nom = MAIN.getStringInput("Entrez le nom :");
        String prenom = MAIN.getStringInput("Entrez le  prenom :");
        String grade = MAIN.getStringInput("Entrez le grade :");
        String Email = MAIN.getStringInput("Entrez l'email :");
        departementcontrolle.afficherDepa();
        int id = MAIN.getIntInput("Sélecionnez un departement  par id :");
        Departement departement=Services.servicesDepartement.getDepabyid(id);
        if(departement==null){System.out.println(" departement n'existe pas");
        showMenu(); return;}
       if( Services.servicesEnseignant.addEns(nom, prenom, grade, Email, Services.servicesDepartement.getDepabyid(id))!=null){
        System.out.println("L'ajout enseignant avec succés");
        afficherEns();}
        else{ System.out.println("echec d'ajout");}
        showMenu();
    }
    public static void editEns(){
       afficherEns();
        int id = MAIN.getIntInput("Sélecionnez un enseignant par id :");
        String nom = MAIN.getStringInput("Entrez le nom :");
        String prenom = MAIN.getStringInput("Entrez le  prenom :");
        String grade = MAIN.getStringInput("Entrez le grade :");
        String Email = MAIN.getStringInput("Entrez l'email :");
        departementcontrolle.ajouterDepa();
        int idDepa = MAIN.getIntInput("Sélecionnez un departement par id :");
        Services.servicesEnseignant.updateEns(id,nom,prenom,Email,grade,Services.servicesDepartement.getDepabyid(idDepa));
        afficherEns();
        showMenu();
    }
    public static void destroyEnseignant(){
        afficherEns();
        int id = MAIN.getIntInput("Sélecionnez un enseignant par id :");
        Services.servicesEnseignant.deleteEnsbyid(id);
       afficherEns();
    }
}
