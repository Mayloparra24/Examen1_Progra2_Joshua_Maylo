package GUI;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class AdminPanel extends JFrame{
    //Atributos
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
    JPanel Principal = new PanelConFondo("/Imagenes/Fondo3.jpg");

    
    public AdminPanel(){
        setSize(1000,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        add(Principal);
        Detalles();
        
    }//Fin del constructor

    public void Detalles(){
        Datos.setLayout(null);
        Opciones.setLayout(null);
        Tabla.setLayout(null);
        Principal.setLayout(null);
        Principal.setBackground(Color.red);
    }//Fin del método Detalles

    
    }

