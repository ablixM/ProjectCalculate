package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;


public class CustomIcons extends JPanel {
    private final Icon icon;

    Color backgroundColor = new Color(0xF9F9F9);
    private final Point iconLocation;

    public CustomIcons(Icon icon, Point iconLocation) {
        this.setOpaque(false);
        this.setFocusable(true);
        this.icon = icon;
        this.iconLocation = iconLocation;
    }
    @Override
    protected void paintComponent(Graphics graphics) {
        //super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D)graphics;
        if (this.icon != null && this.iconLocation != null) {
            graphics2D.setPaint(backgroundColor);
            graphics2D.fillRoundRect(0, 0, this.getWidth(), this.getHeight(), 5, 5);
            graphics.drawImage(((ImageIcon)this.icon).getImage(), this.iconLocation.x, this.iconLocation.y, (ImageObserver)null);
        }
    }
}
