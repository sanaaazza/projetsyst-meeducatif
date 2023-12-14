package Services;

import Modules.Departement;
import Modules.Module;

import java.util.Scanner;

public class MAIN {
    public static boolean isNull(Object ob) {
        return ob == null ;
    }

    public static int getIntInput(String... msg){
    Scanner scanner=new Scanner(System.in);
   String message= ("entrez un nombre");
    if(msg.length>0)
        message=msg[0];
        System.out.println(message);
        int chiffre=scanner.nextInt();
        scanner.close();
        return chiffre;
    }
    public static String getStringInput(String...msg){
       Scanner scanner=new Scanner(System.in);
       String message=("entrez un texte");
       if(msg.length>0)
           message=msg[0];
       System.out.println(message);
        String texte=scanner.nextLine();
        scanner.close();
        return texte;
    }
public static void showMenu(){
        System.out.println("-----------------------Bienvenue-------------------");
        System.out.println("1.pour choisir departement");
        System.out.println("2.pour choisir etudiant");
        System.out.println("3.pour choisir filiere");
        System.out.println("4.pour choisir module");
        System.out.println("5.pour choisir enseignant");
        int choix=getIntInput("Selectionner une option");
        switch (choix) {
            case 1:
              controlle.departementcontrolle.showMenu();
                break;
            case 2:controlle.enseignantcontrolle.showMenu();
                break;
            case 3:controlle.filierecontrolle.showMenu();
                break;
            case 4:controlle.modulecontrolle.showMenu();
                break;
            case 5:controlle.etudiantcontrolle.showMenu();
                break;
            default:
                System.out.println("veuiller choisir entre 1 et 5 ");

        }}


        public static void main (String[]args){
            Modules.Enseignant enseignant = new Modules.Enseignant();
            enseignant.setNom("Ali");
            enseignant.setPrénom("Benani");
            enseignant.setEmail("alibenani2@gmail.com");
            enseignant.setGrade("PES");
            enseignant.setId(Database.getId_ES());
            Database.enseignant.add(enseignant);
            showMenu();
        }
    }
