package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Reporte extends JPanel{


    Color nuevo=new Color(21, 85, 223);
    Color Boton=new Color(15, 60, 157);
    JLabel Titulo;
    JTextArea Dato;
    JButton Salir;
    //declaración de atributos
public Reporte (){
    Titulo=new JLabel();
    Dato=new JTextArea();
    Salir=new JButton();
    //Inicialización de atributos


    setSize(1000,700);
    setLayout(null);
    setBackground(nuevo);
    add(Titulo);
    add(Dato);
    add(Salir);
    //detalles del JPanel
    
    detalles();
    eventos();
    //llamado de métodos
}

public void detalles(){
Titulo.setBounds(380, 10, 600, 50);
Titulo.setText("Reporte Final del día");
Titulo.setFont(new Font("Arial", Font.PLAIN, 25));//este método sirve para poner fuente y tamaño de letra
Titulo.setForeground(Color.WHITE);
Dato.setBounds(10, 100, 970, 200);
Dato.setEditable(false);
Dato.setBackground(Boton);
Dato.setForeground(Color.WHITE);
Salir.setBounds(400, 400, 200, 70);
Salir.setText("Salir del sistema");
Salir.setFocusPainted(false);
Salir.setBorderPainted(false);
Salir.setBackground(Boton);
Salir.setForeground(Color.WHITE);
String d="";

Dato.setText(d);

}//Este método sirve para asignar detalles a los botones o cualquier objeto swing

public void eventos(){
    Salir.addActionListener(new ActionListener() {
            
        public void actionPerformed(ActionEvent e) {
          System.exit(0);
            
        }
    });//Esta acción es del botón Salir del sistema

}//Método para dar funcionalidad a los botones
}
