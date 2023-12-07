package Services;

import java.util.Scanner;

public class MAIN {

    public static void  showMenuprin() {
        int choix;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("-----------------------Bienvenue-------------------");
            System.out.println("1.pour choisir departement");
            System.out.println("2.pour choisir etudiant");
            System.out.println("3.pour choisir filiere");
            System.out.println("4.pour choisir module");
            System.out.println("5.pour choisir enseignant");
            choix = s.nextInt();
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
        } while (choix != 0);}

        public static void main (String[]args){

        }

    }
