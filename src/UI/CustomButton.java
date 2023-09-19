package UI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;

public class CustomButton extends JButton implements MouseListener {
    private int arc; // The radius of rounded corners
    private Color backgroundColor; // The background color of the button
    private boolean hasText; // Indicates if the button has text
    private String buttonText; // The text to display on the button
    private Point textStartLocation;

    private Icon icon;
    private Point imageStartLocation;

    Color color = new Color(0xF3F3F3);
    public CustomButton(String buttonText, Point textStartLocation, int arc, Color backgroundColor, Font font) {
        this.buttonText = buttonText;
        this.setOpaque(false);
        this.setFocusable(true);
        this.arc = arc;
        this.backgroundColor = backgroundColor;
        this.hasText = true;
        this.setFont(font);
        this.textStartLocation = textStartLocation;
        this.setBorder(new EmptyBorder(textStartLocation.y, textStartLocation.x, 10, 10));
        this.addMouseListener(this);
    }


    public CustomButton(int arc, Color backgroundColor, Icon icon, Point imageStartLocation){
        this.setOpaque(false);
        this.setFocusable(true);
        this.arc = arc;
        this.hasText = false;
        this.backgroundColor = backgroundColor;
        this.icon = icon;
        this.imageStartLocation = imageStartLocation;
        this.addMouseListener(this);
    }

    public void paintComponent(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D)graphics;
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.setPaint(this.backgroundColor);
        graphics2D.fillRoundRect(0, 0, this.getWidth(), this.getHeight(), this.arc, this.arc);
        graphics2D.setBackground(Color.GRAY);

        if (this.hasText) {
            graphics2D.setColor(Color.BLACK);
            String[] word = this.buttonText.split("\n");
            graphics2D.drawString(word[0], this.getInsets().left, graphics.getFontMetrics().getMaxAscent() + this.getInsets().top);
            if (word.length > 1) {
                int i = 1;
                for(int marign = 2; i < word.length; marign += 2) {
                    graphics2D.drawString(word[i], this.getInsets().left,  this.getInsets().top + marign);
                    ++i;
                }
            }
        }
        if (this.icon != null && this.imageStartLocation != null) {
            graphics2D.drawImage(((ImageIcon)this.icon).getImage(), this.imageStartLocation.x, this.imageStartLocation.y, (ImageObserver)null);
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        backgroundColor = backgroundColor.darker();
    }
    @Override
    public void mousePressed(MouseEvent e) {
        backgroundColor = backgroundColor.brighter();
    }
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {
        backgroundColor = backgroundColor.darker();
    }
    @Override
    public void mouseExited(MouseEvent e) {
        backgroundColor = backgroundColor.brighter();
    }


}

