package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
public class interfaz extends JFrame{
    
    JPanel principal;
    Color nuevo=new Color(34, 175, 227);
    public interfaz (){
    principal=new JPanel();
    add(principal);
      Jframe();

    }

    public void Jframe(){
        setSize(1000,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    public void Detalles(){
        principal.setBackground(nuevo);
    }
}
