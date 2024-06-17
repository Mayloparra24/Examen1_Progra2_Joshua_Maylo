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

    Color colorPanel = new Color(234, 235, 237);
    String[] nombresColumnas = {"Usuario", "Contraseña", "Nombre1", "Nombre2", "Apellido1", "Apellido2", "Cédula", "Placa del Autobus"};
    
    
    JTable tabla=new JTable();
    JButton Agregar=new JButton("Agregar");
    JButton Actualizar=new JButton("Actualizar");
    JButton Eliminar=new JButton("Eliminar");
    JButton Regresar=new JButton("Regresar");
    JLabel Usuario=new JLabel("Usuario: ");
    JLabel Contraseña=new JLabel("Contraseña: ");
    JLabel AutoBus=new JLabel("Placa del Autobus: ");
    JLabel Nombre1 = new JLabel("Primer nombre: ");
    JLabel Nombre2 = new JLabel("Segundo nombre: ");
    JLabel Apellido1 = new JLabel("Primer apellido: ");
    JLabel Apellido2 = new JLabel("Segundo apellido: ");
    JLabel Cedula = new JLabel("Cédula: ");
    JTextField TUsuario=new JTextField();
    JTextField TContraseña=new JTextField();
    JTextField TAutoBus=new JTextField();
    JTextField TNombre1 = new JTextField();
    JTextField TNombre2 = new JTextField();
    JTextField TApellido1 = new JTextField();
    JTextField TApellido2 = new JTextField();
    JTextField TCedula = new JTextField();
    JPanel Datos = new JPanel();
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

        Tabla.setLayout(null);
        Principal.setLayout(null);
        Principal.setBackground(Color.red);
        Principal.add(Datos);
        Principal.add(Tabla);

        Datos.setBounds(15, 0, 960, 330);
        Datos.setBackground(colorPanel);
        Datos.add(Usuario);
        Datos.add(TUsuario);
        Datos.add(Contraseña);
        Datos.add(TContraseña);
        Datos.add(AutoBus);
        Datos.add(TAutoBus);
        Datos.add(Nombre1);
        Datos.add(TNombre1);
        Datos.add(Nombre2);
        Datos.add(TNombre2);
        Datos.add(Apellido1);
        Datos.add(TApellido1);
        Datos.add(Apellido2);
        Datos.add(TApellido2);
        Datos.add(Cedula);
        Datos.add(TCedula);
        Datos.add(Agregar);
        Datos.add(Actualizar);
        Datos.add(Eliminar);
        Datos.add(Regresar);

        Tabla.add(tabla);
        Tabla.setBounds(15, 330, 960, 330);
        Tabla.setBackground(colorPanel);
        tabla.setBounds(0, 0, 960, 250);

        Usuario.setBounds(10, 10, 100, 30);
        TUsuario.setBounds(140, 10, 200, 30);
        Contraseña.setBounds(10, 50, 100, 30);
        TContraseña.setBounds(140, 50, 200, 30);
        AutoBus.setBounds(10, 90, 120, 30);
        TAutoBus.setBounds(140, 90, 200, 30);
        Nombre1.setBounds(10, 130, 100, 30);
        TNombre1.setBounds(140, 130, 200, 30);
        Nombre2.setBounds(10, 170, 120, 30);
        TNombre2.setBounds(140, 170, 200, 30);
        Apellido1.setBounds(10, 210, 100, 30);
        TApellido1.setBounds(140, 210, 200, 30);
        Apellido2.setBounds(10, 250, 120, 30);
        TApellido2.setBounds(140, 250, 200, 30);
        Cedula.setBounds(10, 290, 100, 30);
        TCedula.setBounds(140, 290, 200, 30);
        Agregar.setBounds(400, 290, 100, 30);
        Actualizar.setBounds(515, 290, 100, 30);
        Eliminar.setBounds(630, 290, 100, 30);
        Regresar.setBounds(745, 290, 100, 30);



    }//Fin del método Detalles

    
    }

