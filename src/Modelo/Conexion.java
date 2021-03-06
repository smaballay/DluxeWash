package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private final String base = "dbo_deluxewash";
    private final String user = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://127.0.0.1/" + base;
    private Connection con = null;              //Obtiene y guarda la conexion y retorna
    
    public Connection getConexion()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
        } catch(SQLException e){
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    return con;
    }   
}