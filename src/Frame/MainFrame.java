package Frame;

import javax.swing.*;
import java.awt.*;
import Panel.*;

public class MainFrame extends JFrame {
    TopPanel topPanel = new TopPanel();
    MiddlePanel middlePanel = new MiddlePanel();
    BottomPanel bottomPanel = new BottomPanel();

    MainFrame(){
        super("Calculator");
        setLayout(null);
        this.setPreferredSize(new Dimension(424 ,626));
        ImageIcon customIcon = new ImageIcon("assets/image/Icon-calculator.jpg");
        Image iconImage = customIcon.getImage();
        this.setIconImage(iconImage);


        add(topPanel);
        add(middlePanel);
         add(bottomPanel);




        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }
}
