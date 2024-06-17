package GUI;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Derechos extends JFrame{
  JPanel Principal=new JPanel();
  ImageIcon Imagen = new ImageIcon("Imagenes/Maylo.jpg");
  Image Original = Imagen.getImage();
  Image Modificado = Original.getScaledInstance(300, 300, Image.SCALE_DEFAULT);
  ImageIcon ImagenEscalado = new ImageIcon(Modificado);
  JLabel Derechos = new JLabel("<html>FrondEnd:<br>Nombre: Maylo Daring Parra Aguirre<br>Carné: C35880<br>Carrera: Informática Empresarial</html>");
  JLabel Derechos2 = new JLabel("<html>BackEnd:<br>Nombre: Joshua David Obando Gonzalez<br>Carné: C35652<br>Carrera: Informática Empresarial</html>");
  JLabel Maylo = new JLabel();
    public Derechos(){
        setTitle("Derechos de autor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLocationRelativeTo(null);
        setResizable(false);
        add(Principal);
        Detalles(); 
    }

    public void Detalles(){
        Principal.setLayout(null);
        Principal.add(Derechos);
        Principal.add(Derechos2);
        Principal.add(Maylo);
        Derechos.setBounds(100, 300, 300, 300);
        Derechos2.setBounds(400, 300, 300, 300);
    
        Maylo.setIcon(ImagenEscalado);
        Maylo.setBounds(60, 50, 300, 300);
    }
    
}
