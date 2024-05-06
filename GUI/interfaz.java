package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
public class interfaz extends JFrame{
    
    JPanel principal;
    JButton SanRoque, UCR,ElPulmon, AeroPuerto;
    Color nuevo=new Color(34, 175, 227);
    Color Boton=new Color(15, 60, 157);

    //Creación de atributos y objetos
    public interfaz (){
    principal=new JPanel();
    SanRoque=new JButton();
    UCR=new JButton();
    ElPulmon=new JButton();
    AeroPuerto=new JButton();
    //Inicialización de botones y etc

    add(principal);
    principal.add(SanRoque);
    principal.add(UCR);
    principal.add(ElPulmon);
    principal.add(AeroPuerto);
    principal.setLayout(null);
    //esta sección de arriba sirve para agregar botones o paneles

      Jframe();
      Detalles();
      //Llamado de métodos
    }//Constructor

    public void Jframe(){
        setSize(1000,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }//Este método sirve para darle detalles al JFrame

    public void Detalles(){
        principal.setBackground(nuevo);
        SanRoque.setBounds(50, 100, 400, 200);
        SanRoque.setText("San Roque");
        SanRoque.setFocusPainted(false);
        SanRoque.setBorderPainted(false);
        SanRoque.setBackground(Boton);
        SanRoque.setForeground(Color.WHITE);

        UCR.setBounds(550, 100, 400, 200);
        UCR.setText("UCR");
        UCR.setFocusPainted(false);
        UCR.setBorderPainted(false);
        UCR.setBackground(Boton);
        UCR.setForeground(Color.WHITE);

        ElPulmon.setBounds(50, 400, 400, 200);
        ElPulmon.setText("El Pulmón");
        ElPulmon.setFocusPainted(false);
        ElPulmon.setBorderPainted(false);
        ElPulmon.setBackground(Boton);
        ElPulmon.setForeground(Color.WHITE);

        AeroPuerto.setBounds(550, 400, 400, 200);
        AeroPuerto.setText("Aeropuerto");
        AeroPuerto.setFocusPainted(false);
        AeroPuerto.setBorderPainted(false);
        AeroPuerto.setBackground(Boton);
        AeroPuerto.setForeground(Color.WHITE);
    }// este método sirve para dar tamaño y cual detalle a los atributos del GUI
}//Clase interfaz
