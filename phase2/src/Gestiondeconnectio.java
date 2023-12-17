import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Gestiondeconnectio {
    public  static  void main(String args[]){
        try{
         Connection cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionsysteme", "root", "");
         System.out.println("Good connection");
        }catch(SQLException e) {
            System.out.println("Bad connection");
        }}}

