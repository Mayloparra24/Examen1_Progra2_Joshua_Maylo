package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.w3c.dom.events.MouseEvent;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;


public class AdminPanel extends JFrame{
    //Atributos

    Color colorPanel = new Color(234, 235, 237);
    String[] nombresColumnas = {"Usuario", "Contraseña", "Nombre1", "Nombre2", "Apellido1", "Apellido2", "Cédula", "Placa del Autobus"};
    DefaultTableModel modelo = new DefaultTableModel(nombresColumnas, 0);
    JTable tabla=new JTable(modelo);
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
        eventos();
        cargarDatosDesdeBaseDeDatos();
        
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

        JScrollPane scrollPane = new JScrollPane(tabla);
        Tabla.add(scrollPane);
        Tabla.setBounds(15, 360, 960, 300);
        Tabla.setBackground(colorPanel);
        scrollPane.setBounds(0, 0, 960, 250);

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



    }//fin del método Detalles
    public void cargarDatosDesdeBaseDeDatos() {
    try {
        // 1. Establecer conexión
        POO.Conexion objetoconexion = new POO.Conexion();
        Connection con;
        con = (Connection) objetoconexion.EstablecerConexion();
        
        // 2. Ejecutar consulta SQL
        String consulta = "SELECT Usuario, Contraseña, Nombre1, Nombre2, Apellido1, Apellido2, Cédula, PlacaDelAutobus FROM tuTabla"; // Asegúrate de cambiar "tuTabla" por el nombre real de tu tabla
        PreparedStatement ps;
        ps = (PreparedStatement) con.prepareStatement(consulta);
        ResultSet rs = ps.executeQuery();
        
        // 3. Llenar el DefaultTableModel
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0); // Limpiar el modelo para evitar duplicados
        
        while (rs.next()) {
            Object[] fila = new Object[8]; // Ajusta el tamaño del arreglo según el número de columnas
            fila[0] = rs.getString("Usuario");
            fila[1] = rs.getString("Contraseña");
            fila[2] = rs.getString("Nombre1");
            fila[3] = rs.getString("Nombre2");
            fila[4] = rs.getString("Apellido1");
            fila[5] = rs.getString("Apellido2");
            fila[6] = rs.getString("Cédula");
            fila[7] = rs.getString("PlacaDelAutobus");
            modelo.addRow(fila);
        }
        
        // 4. Asignar el modelo a la JTable
        tabla.setModel(modelo);
        
    } catch (Exception e) {
        e.printStackTrace();
    }
}
public void eventos(){
    Agregar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String[] datos = {
                TUsuario.getText(),
                TContraseña.getText(),
                TNombre1.getText(),
                TNombre2.getText(),
                TApellido1.getText(),
                TApellido2.getText(),
                TCedula.getText(),
                TAutoBus.getText()
            };
            modelo.addRow(datos);
            clearTextFields();
        }
    });

            Actualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = tabla.getSelectedRow();
                if (selectedRow >= 0) {
                    modelo.setValueAt(TUsuario.getText(), selectedRow, 0);
                    modelo.setValueAt(TContraseña.getText(), selectedRow, 1);
                    modelo.setValueAt(TNombre1.getText(), selectedRow, 2);
                    modelo.setValueAt(TNombre2.getText(), selectedRow, 3);
                    modelo.setValueAt(TApellido1.getText(), selectedRow, 4);
                    modelo.setValueAt(TApellido2.getText(), selectedRow, 5);
                    modelo.setValueAt(TCedula.getText(), selectedRow, 6);
                    modelo.setValueAt(TAutoBus.getText(), selectedRow, 7);
                    clearTextFields();
                }
            }
        });

        Eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = tabla.getSelectedRow();
                if (selectedRow >= 0) {
                    modelo.removeRow(selectedRow);
                    clearTextFields();
                }
            }
        });

        Regresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Login ventana = new Login();
                ventana.setBounds(0, 0, 800, 600);
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
            }
        });

}
    private void clearTextFields() {
        TUsuario.setText("");
        TContraseña.setText("");
        TNombre1.setText("");
        TNombre2.setText("");
        TApellido1.setText("");
        TApellido2.setText("");
        TCedula.setText("");
        TAutoBus.setText("");
    }

    
    }

