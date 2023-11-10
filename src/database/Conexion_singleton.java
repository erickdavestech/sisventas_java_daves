package database;
// Libreria para la clase Conection

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion_singleton {

    // controlador de la conexion 
    private final String DRIVER = "com.mysql.jdbc.Driver";
    //  private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String URL = "jdbc:mysql://127.0.0.1:3306/";
    private final String DB = "dbsistema";
    private final String USER = "root";
    private final String PASSWORD = "";
    public Connection cadena;
    public static Conexion_singleton instancia;

    //Constructor
    private Conexion_singleton() {
        this.cadena = null;
    }

    // Metodo 1 -- Conectar
    public Connection conectar() {
        try {
            //Llamamos la clase completa Driver
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

    // Metodo synchronized eliminamos los conflictos de colisiones de datos
    public synchronized static Conexion_singleton getInstancia() {
        if (instancia == null) {
            instancia = new Conexion_singleton();
        }
        return instancia;
    }
}


/*
Patron_Singleton

    -Creamos una variable "PUBLIC STATIC de la clase Conexion_singleton"
        - Le colocamos como nombre "instancia"
        - Cambiamos de public a private el constructor
        -- Creamos un metodo llamado Getinstancia

 */
