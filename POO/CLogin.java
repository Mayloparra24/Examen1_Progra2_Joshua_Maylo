package POO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import GUI.AdminPanel;
import GUI.interfaz;

public class CLogin {

    public void Validacion(JTextField Usuario, JPasswordField contraseña) {
        ResultSet rs = null;
        PreparedStatement ps = null;
        Connection con = null;

        try {
            Conexion objetoconexion = new Conexion();
            con = objetoconexion.EstablecerConexion();
            
            if (con != null) {
                String consulta = "SELECT * FROM registrousuarios WHERE idUsuarios = ? AND contraseñas = ?";
                ps = con.prepareStatement(consulta);

                String user = Usuario.getText();
                String contra = new String(contraseña.getPassword());

                ps.setString(1, user);
                ps.setString(2, contra);

                rs = ps.executeQuery();

                if (rs.next()) {
                    if (user.equals("Adminbus") && contra.equals("admin321")) {
                        JOptionPane.showMessageDialog(null, "Bienvenido al sistema Admin bus");
                        interfaz ventana = new interfaz();
                        ventana.setVisible(true);
                        ventana.setLocationRelativeTo(null);                        
                    } else if (user.equals("AdminJefe") && contra.equals("admin123")) {
                        JOptionPane.showMessageDialog(null, "Bienvenido al sistema Admin Jefe");
                        AdminPanel ventana = new AdminPanel();
                        ventana.setVisible(true);
                        ventana.setLocationRelativeTo(null);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto");
                }

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo establecer la conexión con la base de datos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}// fin de la clase