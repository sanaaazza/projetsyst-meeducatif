import Services.Database;

import java.security.Provider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Gestiondeconnectio {
    public  static  void main(String args[]) {

        try {
           Connection cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionsysteme", "root", "");
            System.out.println("Good connection");
        } catch (SQLException e) {
            System.out.println("Bad connection");
            e.printStackTrace();

        }

    }
    public static void createTable (Connection cx) throws  SQLException{
        String req = "create table IF NOT EXISTS Departement \n" + "(\n" +
                "iddep int auto_increment +\n" + "primary key , \n" +
                "intitulé varchar(50) charset utf8 null,\n" +
                "enseignant int  +\n" + "foreign key idens REFERENCES  Enseignant (idens),\n" + ");";
        Statement stmt = cx.createStatement();
        stmt.executeQuery(req);
        System.out.println("un nouveau tableau departement a été crée avec succès");
        String req1="create table IF NOT EXISTS Enseignant \n"+"(\n"+
                "idens int auto_increment +\n"+"primary key, \n"+
                "nom varchar(50)charset utf8 null ,\n "+
                "prenom varchar(50) charset utf8 null ,\n"+
                "email varchar(50) charset utf8 null ,\n"+
                "grade varchar(50) charset utf8 null,\n"+
                "deparement int +\n"+"foreign key iddep references Departement (iddep),\n"+
                ");";
        Statement smt=cx.createStatement();
        smt.executeQuery(req1);
        System.out.println("un nouveau tableau enseignant a été crée avec succès");
    }
  public static void insertable(Modules.Departement depart , Connection cx) throws SQLException {
        String rep="insert to Departement(indep,intuition,enseignant) values(?,?,?)";
        PreparedStatement stmt=cx.prepareStatement(rep);
        stmt.setInt(1,depart.getId());
    }

}





