package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class CustomIcons extends JPanel {
    private ImageIcon icon;
    private Point iconLocation;

    public CustomIcons(ImageIcon icon, Point iconLocation) {
        this.icon = icon;
        this.iconLocation = iconLocation;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
        repaint(); // Repaint the panel when the icon is changed
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIconLocation(Point iconLocation) {
        this.iconLocation = iconLocation;
        repaint(); // Repaint the panel when the icon location is changed
    }

    public Point getIconLocation() {
        return iconLocation;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);

        // Draw the icon if it's not null
        if (icon != null) {
            Image image = icon.getImage();
            if (image != null) {
                g2d.drawImage(image, iconLocation.x, iconLocation.y, null);
            }
        }
    }

    public static void main(String[] args) {
        // Example usage:
        JFrame frame = new JFrame("Custom Icons Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        ImageIcon icon = new ImageIcon("path_to_your_image.png");
        CustomIcons customIcons = new CustomIcons(icon, new Point(50, 50));

        frame.add(customIcons);
        frame.setVisible(true);
    }
}
