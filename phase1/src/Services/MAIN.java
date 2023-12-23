package Services;

import Modules.Departement;
import Modules.Enseignant;

import java.util.Scanner;

public class MAIN {


        public static boolean isNull(Object ob) {
            return ob == null;
        }

        public static int getIntInput(String... msg){
            Scanner scanner = new Scanner(System.in);
            String message = "Entrez un nombre";
            if (msg.length > 0)
                message = msg[0];
            System.out.println(message);
            int chiffre = scanner.nextInt();
            scanner.nextLine(); // Ajout de cette ligne pour consommer la nouvelle ligne après le nombre
            return chiffre;
        }

        public static String getStringInput(String... msg) {
            Scanner scanner = new Scanner(System.in);
            String message = "Entrez un texte";
            if (msg.length > 0)
                message = msg[0];
            System.out.println(message);
            String texte = scanner.nextLine();
            return texte;
        }

        public static void showMenu() {
            System.out.println("-----------------------Bienvenue-------------------");
            System.out.println("1. Pour choisir un département");
            System.out.println("2. Pour choisir un étudiant");
            System.out.println("3. Pour choisir une filière");
            System.out.println("4. Pour choisir un module");
            System.out.println("5. Pour choisir un enseignant");
            int choix = getIntInput("Sélectionnez une option");
            switch (choix) {
                case 1:
                    controlle.departementcontrolle.showMenu();
                    break;
                case 2:
                    controlle.etudiantcontrolle.showMenu();
                    break;
                case 3:
                    controlle.filierecontrolle.showMenu();
                    break;
                case 4:
                    controlle.modulecontrolle.showMenu();
                    break;
                case 5:
                    controlle.enseignantcontrolle.showMenu();
                    break;
                default:
                    System.out.println("Veuillez choisir entre 1 et 5 ");
            }
        }

        public static void main(String[] args) {


            Enseignant enseignant = new Enseignant();
            enseignant.setNom("ali");
            enseignant.setPrénom("benani");
            enseignant.setEmail("alibnh@gmail.com");
            enseignant.setGrade("Resp");
            enseignant.setId(Database.getId_ES());
            Database.enseignant.add(enseignant);

            Enseignant enseignant1 = new Enseignant();
            enseignant1.setNom("ait said");
            enseignant1.setPrénom("Mehdi");
            enseignant1.setEmail("Mehdi.Aitsait@gmail.com");
            enseignant1.setGrade("Prof");
            enseignant1.setId(Database.getId_ES());
            Database.enseignant.add(enseignant1);

            Departement departement = new Departement();
            departement.setResponsable(enseignant);
            departement.setIntitulé("lst SITD");
            departement.setId(Database.getId_DP());
            Database.departement.add(departement);
            showMenu();
        }
    }

