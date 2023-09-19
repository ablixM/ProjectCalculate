package Panel;

import UI.CustomButton;
import UI.CustomPanel;

import javax.swing.*;
import java.awt.*;

public class BottomPanel extends CustomPanel {
    private int arc;
    private Color backgroundColor;
    private boolean hasText;
    private String buttonText;
    private Point textStartLocation;
    private Icon icon;
    private Point imageStartLocation;

    public BottomPanel(){
        Font buttonFont15 = new Font("Segoe UI", Font.PLAIN, 15);
        Font buttonFont19 = new Font("Segoe UI", Font.PLAIN, 19);
        Color colorF9 = new Color(0xF9F9F9);
        Color colorFF = new Color(0xFFFFFF);
        this.setLayout(null);
        this.setBounds(0,208,408,422);

        //%button
        CustomButton modulus = new CustomButton("%", new Point(39,18),6,colorF9,buttonFont19);
        modulus.setBounds(7,5,96,62);
        this.add(modulus);

        //CE
        CustomButton ce = new CustomButton("CE", new Point(39,21  ),6,colorF9,buttonFont15);
        ce.setBounds(107,5,96,62);
        this.add(ce);

        //C
        CustomButton c = new CustomButton("C", new Point((int) 43,21  ),6,colorF9,buttonFont15);
        c.setBounds(207,5,96,64);
        this.add(c);

        //xButton
        CustomButton xButton = new CustomButton("",new Point(40,26),6,colorF9,buttonFont15) ;
        xButton.setBounds(307,5,96,64);
        this.add(xButton);

    }
}
