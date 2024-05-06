package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class interfaz extends JFrame{
    
    JPanel principal;
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
}
