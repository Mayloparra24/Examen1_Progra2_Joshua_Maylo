package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import POO.ReporteDelDia;


public class Ucr extends JPanel{
        JButton Efectivo,PagoFacil;
    Color nuevo=new Color(21, 85, 223);
    Color Boton=new Color(15, 60, 157);
    //Declaración de atributos

    public Ucr(){
        Efectivo=new JButton();
        PagoFacil=new JButton();
        //inicialización
    
            setSize(1000,700);
            setLayout(null);
            add(Efectivo);
            add(PagoFacil);
            setBackground(nuevo);
            //detalles del JPanel
    
            detales();
            eventos();
            //Llamado de métodos
    }
     public void detales(){
    Efectivo.setBounds(150, 300, 300, 50);
    Efectivo.setText("EFECTIVO");
    Efectivo.setFocusPainted(false);
    Efectivo.setBorderPainted(false);
    Efectivo.setBackground(Boton);
    Efectivo.setForeground(Color.WHITE);

    PagoFacil.setBounds(550, 300, 300, 50);
    PagoFacil.setText("PAGO FÁCIL");
    PagoFacil.setFocusPainted(false);
    PagoFacil.setBorderPainted(false);
    PagoFacil.setBackground(Boton);
    PagoFacil.setForeground(Color.WHITE);

    }//Este método sirve para dar detalle a botones y etc
    public void NuevoPanel(JPanel panel){

        panel.setSize(1000,700);
        panel.setLocation(0, 0);
        removeAll();
        add(panel,BorderLayout.CENTER);
        repaint();
        revalidate();

    }//método para intercambiar paneles
    public void eventos(){
        ActionListener accion = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                POO.Conexion objetoconexion = new POO.Conexion();
               
                String consultaObtenerEfectivo = "SELECT efectivo FROM tabla WHERE condicion='algunaCondicion';";
                String consultaObtenerPagoFacil = "SELECT pagoFacil FROM tabla WHERE condicion='algunaCondicion';";
               
                String consultaActualizarEfectivo = "UPDATE tabla SET efectivo=? WHERE condicion='algunaCondicion';";
                String consultaActualizarPagoFacil = "UPDATE tabla SET pagoFacil=? WHERE condicion='algunaCondicion';";
                try {
                    Statement stmt = (Statement)objetoconexion.EstablecerConexion().createStatement();
                    ResultSet rs;
                    int valorActual;
                    String consultaActualizar;
                    
                    if(e.getSource() == Efectivo){
                        rs = stmt.executeQuery(consultaObtenerEfectivo);
                        consultaActualizar = consultaActualizarEfectivo;
                    } else { 
                        rs = stmt.executeQuery(consultaObtenerPagoFacil);
                        consultaActualizar = consultaActualizarPagoFacil;
                    }
                    
                    if(rs.next()){
                        valorActual = rs.getInt(1); 
                        int nuevoValor = valorActual + 500;
                        
                        PreparedStatement pstmt = (PreparedStatement)objetoconexion.EstablecerConexion().prepareStatement(consultaActualizar);
                        pstmt.setInt(1, nuevoValor);
                        pstmt.executeUpdate();
                        
                        if(e.getSource() == Efectivo){
                            JOptionPane.showMessageDialog(null, "El pasaje es de 500 colones"+"\n"+"Por favor pagar al chofer");
                        } else { 
                            JOptionPane.showMessageDialog(null, "El Pago se ha realizado correctamente");
                        }//dgdg
                        NuevoPanel(new interfaz().principal);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error al actualizar la base de datos: " + ex.toString());
                }
            }
        };
        
        Efectivo.addActionListener(accion);
        PagoFacil.addActionListener(accion);
    }
}//