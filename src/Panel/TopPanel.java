package Panel;

import javax.swing.*;
import java.awt.*;

import UI.Icons;
import  UI.Panel;

public class TopPanel extends Panel {
    Font customFont = new Font("Segoe UI", Font.BOLD, 19);
    Color color = new Color(0xF3F3F3);

    public TopPanel(){
        setLayout(null);
        this.setBounds(0,0,422,166);

        //Standard text
        JLabel standard = new JLabel("Standard");
        standard.setFont(customFont);
        standard.setBounds(47,9,86,26);
        this.add(standard);



        //History Icon
        ImageIcon HistoryIcon = new ImageIcon("assets/image/Icon-calculator.jpg");
        Point HistoryPoint = new Point(355,14);
        Icons Hicon = new Icons(HistoryIcon,HistoryPoint);
        Hicon.setBounds(355,14,16,16);
        this.add(Hicon);

        //OnTop Icon
        ImageIcon onTopIcon = new ImageIcon("assets/icons/OnTop.png");
        Point onTopPoint = new Point(150,16);
        Icons onIcon = new Icons(onTopIcon,onTopPoint);
        onIcon.setBounds(150,16,14,15);
        this.add(onIcon);

        //TopField
        JLabel topField = new JLabel("0");
        topField.setFont(customFont);
        topField.setBounds(360,48,12,27);
        this.add(topField);

        //bottomField
        JTextField bottomField = new JTextField("0",20);
        bottomField.setBorder(null);
        bottomField.setBackground(color);
        Font customFontForBottomField = new Font("Segoe UI", Font.BOLD, 45);
        bottomField.setFont(customFontForBottomField);
        bottomField.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        bottomField.setBounds(47,83,326,48);
        this.add(bottomField);



    }


}