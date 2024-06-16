package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class AdminPanel extends JFrame{
    JTable tabla=new JTable();
    JButton Agregar=new JButton("Agregar");
    JButton Actualizar=new JButton("Actualizar");
    JButton Eliminar=new JButton("Eliminar");
    JButton Regresar=new JButton("Regresar");
    JLabel Usuario=new JLabel("Usuario");
    JLabel Contraseña=new JLabel("Contraseña");
    JLabel AutoBus=new JLabel("Autobus");
    JTextField TUsuario=new JTextField();
    JTextField TContraseña=new JTextField();
    JTextField TAutoBus=new JTextField();
    JPanel Datos = new JPanel();
    JPanel Opciones = new JPanel();
    JPanel Tabla = new JPanel();

    
    public AdminPanel(){
        setSize(1000,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    public void Detalles(){
        Datos.setLayout(null);
        Opciones.setLayout(null);
        Tabla.setLayout(null);
    }
}
