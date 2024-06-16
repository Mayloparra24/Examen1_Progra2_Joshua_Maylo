package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.GridLayout; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Login extends JFrame{
   
    private JTextField tfUsuario;
    private JPasswordField pfContraseña;
    private JLabel Lbusuario, LbContraseña;
    private JButton btnIniciar, btnCancelar;

    public Login(){

        setTitle("Ventana de inicio de seccion");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
       

        
        Lbusuario = new JLabel("Ingrese el nombre usuario:");
        Lbusuario.setBounds(10, 20, 200, 35);
        add(Lbusuario);

        tfUsuario = new JTextField();
        tfUsuario.setBounds(210, 20, 300, 35);
        add(tfUsuario);

        LbContraseña = new JLabel("Ingrese la contraseña:");
        LbContraseña.setBounds(10, 70, 200, 35); 
        add(LbContraseña);

        pfContraseña = new JPasswordField();
        pfContraseña.setBounds(210, 70, 300, 35); 
        add(pfContraseña);

        btnIniciar = new JButton("Iniciar sesión");
        btnIniciar.setBounds(150, 120, 150, 35); 
        add(btnIniciar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(310, 120, 150, 35); 
        add(btnCancelar);


        btnIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                POO.CLogin objetLogin = new POO.CLogin();
                objetLogin.Validacion(tfUsuario, pfContraseña);
                
            }
        });
    }//


    public static void main(String[] args) {
        
        Login ventana = new Login();
        ventana.setBounds(0, 0, 800, 600);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }//

}//