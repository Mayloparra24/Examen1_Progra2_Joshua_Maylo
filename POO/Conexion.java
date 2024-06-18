package POO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    static Connection conectar;
    
    String Usuario = "UsuarioColaborador";
    String Contraseña = "Joshua20000..**";
    String BD = "SistemaPagoAutobus";
    String IP = "10.153.156.206";
    String Puerto = "3306"; 

    String cadena = "jdbc:mysql://" + IP + ":" + Puerto + "/" + BD;

    public Connection EstablecerConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, Usuario, Contraseña);
            // JOptionPane.showMessageDialog(null, "Se conecto correctamente a la base de datos");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de SQL al conectar con la base de datos: " + e.toString());
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se encontró el driver de conexión: " + e.toString());
        }
        return conectar;
    }
}//