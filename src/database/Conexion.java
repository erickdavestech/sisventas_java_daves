/*
package database;
// Libreria para la clase conection

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    // controlador de la conexion 
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String URL = "jdbc:mysql://127.0.0.1:3306/";
    private final String DB = "dbsistema";
    private final String USER = "root";
    private final String PASSWORD = "";
    // variable cadena de tipo conection
    public Connection cadena;

    public Conexion() {
        this.cadena = null;
    }
    // Metodo 1 -- Conectar
    public Connection conectar() {
        try {
            Class.forName(DRIVER);
            this.cadena = DriverManager.getConnection(URL + DB, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return this.cadena;
    }
    //Metodo 2 -- Desconectar
    public void desconectar() {
        try {
            this.cadena.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
*/