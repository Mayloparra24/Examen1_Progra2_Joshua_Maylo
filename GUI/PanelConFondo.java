package GUI;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelConFondo extends JPanel{
       private Image imagen;

    public PanelConFondo(String rutaImagen) {
        try {
            imagen = new ImageIcon(getClass().getResource(rutaImagen)).getImage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagen != null) {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    } 
}
