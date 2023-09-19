package UI;

import javax.swing.*;
import java.awt.*;

public class CustomPanel extends JPanel {
    public CustomPanel(){
        this.setLayout(null);
    };

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Color color = new Color(0xF3F3F3);
        setBackground(color);
    }
}
