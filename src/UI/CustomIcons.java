package UI;

import javax.swing.*;
import java.awt.*;


public class CustomIcons extends JPanel {
    private final ImageIcon icon;
    private final Point iconLocation;

    public CustomIcons(ImageIcon icon, Point iconLocation) {
        this.icon = icon;
        this.iconLocation = iconLocation;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
       int x = (int) iconLocation.getX();
       int y = (int) iconLocation.getY();
        if (icon != null) {
            if ( icon.getImage() != null) {
                icon.paintIcon(this,g,x,y);
            }
        }
    }
}
