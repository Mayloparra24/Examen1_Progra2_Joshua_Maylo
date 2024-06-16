package GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout; 

public class VentanaJefe extends JFrame{
     private JLabel LbMensaje;

     public VentanaJefe(){
        setTitle("Bienvenido a la ventana de Jefe");
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 

        IniciarComponentes();

     }//

     public void IniciarComponentes(){
         JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
         LbMensaje = new JLabel("Hola, soy un JLbael");
        panel.add(LbMensaje);
        add(panel);
     }//
}//