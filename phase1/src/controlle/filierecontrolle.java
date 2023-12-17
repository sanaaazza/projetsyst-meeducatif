package controlle;

import Modules.Departement;
import Modules.Enseignant;
import Modules.Filiere;
import Services.Database;
import Services.MAIN;
import com.sun.tools.javac.Main;

import java.beans.beancontext.BeanContextServices;
import java.security.Provider;

import static Services.Database.enseignant;
import static Services.Database.getId_ES;

public class filierecontrolle {
    public static void showMenu() {

    System.out.println("-----------------------Filiere-------------------");
    System.out.println("1.ajouter  une Filiere");
    System.out.println("2.spprimer une Filiere");
    System.out.println("3.modifier une Filiere");
    System.out.println("4.afficher une Filiere");
    System.out.println("5.retourner un au menu principale");
    int choix= Services.MAIN.getIntInput("Veuillez choisir une option");
    switch (choix) {
        case 1:ajouterFL();
            break;
        case 2:destroyFilliere();
            break;
        case 3:editFL();
            break;
        case 4:afficherFL();
            break;
        case 5:MAIN.showMenu();
            break;
        default:
            System.out.println("veuiller choisir entre 1 et 5 ");

    }
}
    public static void afficherFL(){
        for(Filiere filiere: Database.filiere){
            System.out.println("Id : "+filiere.getId());
            System.out.println("Intitulé : "+filiere.getIntitulé());
            System.out.println("Département : "+filiere.getDépartement());
            System.out.println("Responsable : "+filiere.getResponsable());

            if(!MAIN.isNull(filiere.getDépartement())){
                System.out.println(" Département :  "+filiere.getDépartement().getIntitulé());
            }
            if(!MAIN.isNull(filiere.getResponsable()))
                System.out.println(" Responsable : "+filiere.getResponsable().getNom()+" et "+filiere.getResponsable().getPrénom());
            System.out.println("  ");}}

    public static void ajouterFL(){
       String intitulé=MAIN.getStringInput("entre un intitulé");
       departementcontrolle.afficherDepa();
       enseignantcontrolle.afficherEns();
       int id1= MAIN.getIntInput("enter un departement par id ");
       int id2= MAIN.getIntInput("enter un enseignant  par id ");
       Enseignant enseignant=Services.servicesEnseignant.getEnsbyid(id2);
        Departement departement=Services.servicesDepartement.getDepabyid(id1);
       if(!enseignant.equals(enseignant) && departement==null){System.out.println(" enseignant et departement n'existent pas");
            showMenu(); return;}
      if(Services.servicesModule.siezofmodule()>=12 && enseignant.equals(enseignant))
      {Services.servicesFiliere.addFL(intitulé,Services.servicesEnseignant.getEnsbyid(id2),Services.servicesDepartement.getDepabyid(id1));
          System.out.println("ajout avec succés"); afficherFL();}
    else System.out.println("Impossible d'ajouter la filière. Assurez-vous que la filière a au moins 12 modules et est gérée par un enseignant.");
    showMenu();
    }
    public static void editFL(){
        afficherFL();
        int id=MAIN.getIntInput("enter un id ");
        String intitule=MAIN.getStringInput("entrer un intitulé");
        departementcontrolle.afficherDepa();
        enseignantcontrolle.afficherEns();
        int idES=MAIN.getIntInput("entrer un enseignant par id");
        int idDp=MAIN.getIntInput("enter un departement par id ");
        Services.servicesFiliere.uppdatFL(id,intitule,Services.servicesEnseignant.getEnsbyid(idES),Services.servicesDepartement.getDepabyid(idDp));
       afficherFL();
       showMenu();
        }
        public static void destroyFilliere(){
        afficherFL();
        int id=MAIN.getIntInput("enter un id ");
            Services.servicesFiliere.delleteFLbyid(id);
            afficherFL();
        }
    }


