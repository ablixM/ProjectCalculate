package UI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;

public class CustomButton extends JButton implements MouseListener{
    private final int arc;
    private Color backgroundColor;
    private final boolean hasText;
    private String buttonText;
    private Icon icon;
    private Point imageStartLocation;


    public CustomButton(String buttonText, Point textStartLocation, int arc, Color backgroundColor, Font font) {
        this.buttonText = buttonText;
        this.setOpaque(false);
        this.setFocusable(true);
        this.arc = arc;
        this.backgroundColor = backgroundColor;
        this.hasText = true;
        this.setFont(font);
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
        this.setBorder(null);
        this.imageStartLocation = imageStartLocation;
        this.addMouseListener(this);

    }
    @Override
    public void mouseClicked(MouseEvent e) {
        this.backgroundColor = this.backgroundColor.darker();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.backgroundColor = this.backgroundColor.brighter();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.backgroundColor = this.backgroundColor.darker();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.backgroundColor = this.backgroundColor.brighter();
    }
    public void paintComponent(Graphics graphics) {

        Graphics2D graphics2D = (Graphics2D)graphics;
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.setPaint(this.backgroundColor);
        graphics2D.fillRoundRect(0, 0, this.getWidth(), this.getHeight(), this.arc, this.arc);
        if (this.icon != null && this.imageStartLocation != null) {
            graphics2D.drawImage(((ImageIcon)this.icon).getImage(), this.imageStartLocation.x, this.imageStartLocation.y, (ImageObserver)null);
            graphics2D.setBackground(new Color(0,0,0,0));

        }
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

    }



}

