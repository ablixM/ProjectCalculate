package UI;

import javax.swing.*;
import java.awt.*;

public class Icons extends JPanel {
    ImageIcon icon;
    Point setIconLocation;
    public Icons(ImageIcon icon, Point setIconLocation){
        this.icon = icon;
        this.setIconLocation = setIconLocation;
    }
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D)graphics;
        //graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.drawImage(icon.getImage(),setIconLocation.x,setIconLocation.y,null);
    }

}
