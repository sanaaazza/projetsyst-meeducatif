import Modules.Departement;
import Modules.Enseignant;
import Services.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;

import static Services.Database.Id_DP;
import static Services.Database.getId_ES;

public class Gestiondeconnectio {

    public  static  void main(String args[]) {

        try {
           Connection cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionsysteme", "root", "");
            System.out.println("Good connection");

createTable(cx);
createTableEn(cx);
            //int idEnseignantToDelete = 1; // Remplacez cela par l'ID réel que vous souhaitez supprimer
          //  deleteenseignant(idEnseignantToDelete, cx);

           ArrayList<Enseignant> enseignants = selectenseignat(cx);

            for (Enseignant enseignant : enseignants) {
                System.out.println(enseignant.toString());
            }
          ArrayList<Departement> departement=selectdepartement(cx);
            for(Departement depart:departement){
                System.out.println(depart.toString());}
insertEnse(new Enseignant(2,"ali","benani","alibenani@gmail.com","chef"),cx);
           insertDepar(new Departement(2,"gegm",new Enseignant(2,"benai","ali","benaiali@gmail.com","chef")),cx);
        } catch (SQLException e) {
            System.out.println("Bad connection");



        }

    }




    public static void createTable(Connection cx) throws SQLException {
        String req = "CREATE TABLE IF NOT EXISTS Departement (\n" +
                "iddep INT AUTO_INCREMENT PRIMARY KEY, \n" +
                "intitule VARCHAR(50) CHARACTER SET utf8 NULL, \n" +
                "enseignant INT ,\n" +
                "FOREIGN KEY (enseigant) REFERENCES Enseigant (idens)\n"+
                ");";

      Statement stmt = cx.createStatement();
            stmt.executeUpdate(req);
            System.out.println("Une nouvelle table 'departement' a été créée avec succès.");

    }
    public static void createTableEn(Connection cx) throws SQLException {
        String req1 = "CREATE TABLE IF NOT EXISTS Enseignant (\n" +
                "idens INT AUTO_INCREMENT PRIMARY KEY, \n" +
                "nom VARCHAR(50) CHARACTER SET utf8 NULL, \n" +
                "prenom VARCHAR(50) CHARACTER SET utf8 NULL, \n" +
                "email VARCHAR(50) CHARACTER SET utf8 NULL, \n" +
                "grade VARCHAR(50) CHARACTER SET utf8 NULL \n" +
                ");";

        try (Statement smt = cx.createStatement()) {
            smt.executeUpdate(req1);
            System.out.println("Un nouveau tableau 'enseignant' a été créé avec succès.");
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
    public static void insertDepar(Departement depart, Connection cx) throws SQLException {
        String rep = "INSERT INTO Departement(iddep, intitule, enseignant) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = cx.prepareStatement(rep)) {
            stmt.setInt(1, depart.getId());
            stmt.setString(2, depart.getIntitulé());
            stmt.setInt(3, depart.getResponsable().getId());
            stmt.executeUpdate();
            Database.departement.add(depart);
            System.out.println("ajout avec succès");
        }
    }

    public static void insertEnse(Enseignant enseignant, Connection cx) throws SQLException {
        String rep1 = "INSERT INTO Enseignant (idens, nom, prenom, email, grade) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = cx.prepareStatement(rep1)) {
            statement.setInt(1, enseignant.getId());
            statement.setString(2, enseignant.getNom());
            statement.setString(3, enseignant.getPrénom());
            statement.setString(4, enseignant.getEmail());
            statement.setString(5, enseignant.getGrade());
            statement.executeUpdate();
            Database.enseignant.add(enseignant);
        }
    }
    public static ArrayList<Departement> selectdepartement(Connection cx) throws SQLException {
        String sql = "SELECT * FROM Departement";
        ArrayList<Departement> departement = new ArrayList<>();
        Statement statement = cx.createStatement();
        ResultSet rslt = statement.executeQuery(sql);
        while (rslt.next()) {
            Departement departement1 = new Departement();
            departement1.setId(rslt.getInt("iddep"));
            departement1.setIntitulé(rslt.getString("intitule"));
            Enseignant chef = new Enseignant();
            chef.setId(rslt.getInt("enseignant"));
            departement1.setResponsable(chef);
            departement.add(departement1);
        }
        return departement;
    }
    public static ArrayList<Enseignant> selectenseignat(Connection cx) throws SQLException {
        String sql = "SELECT * FROM Enseignant";
        ArrayList<Enseignant> enseignants = new ArrayList<Enseignant>();
        Statement statement = cx.createStatement();
        ResultSet result = statement.executeQuery(sql);
        while (result.next()) {

                   Enseignant enseignant= new Enseignant(
                            result.getInt("idens"),
                            result.getString("nom"),
                            result.getString("prenom"),
                            result.getString("email"),
                            result.getString("grade")

            ) ; enseignants.add(enseignant);
        }

        return enseignants;
    }
    public static void deletedepartement(int id, Connection cx) throws SQLException {
        String query = "DELETE  FROM Departement where id = ?";
        PreparedStatement ps = cx.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
    }
    public static void deleteenseignant(int id, Connection cx) throws SQLException {
        String query = "DELETE  FROM Enseignant where id = ?";
        PreparedStatement ps = cx.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
    }
}









