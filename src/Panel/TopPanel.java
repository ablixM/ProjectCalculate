package Panel;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

import UI.CustomIcons;
import  UI.CustomPanel;

public class TopPanel extends CustomPanel {
    Font customFont = new Font("Segoe UI", Font.BOLD, 19);
    Color color = new Color(0xF3F3F3);

    public TopPanel(){
        setLayout(null);
        this.setBounds(0,0,410,166);

        //Standard text
        JLabel standard = new JLabel("Standard");
        standard.setFont(customFont);
        standard.setBounds(47,9,86,26);
        this.add(standard);



        //History Icon
        ImageIcon HistoryIcon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/resources/icons/History.png")));
        Point HistoryPoint = new Point(355,14);
        CustomIcons HistIcon = new   CustomIcons(HistoryIcon,HistoryPoint);
        HistIcon.setBounds(355,14,16,16);
        this.add(HistIcon);

        //OnTop Icon
        ImageIcon onTopIcon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/resources/icons/OnTop.png")));
        Point onTopPoint = new Point(150,16);
        CustomIcons onIcon = new CustomIcons(onTopIcon,onTopPoint);
        onIcon.setBounds(150,16,14,15);
        this.add(onIcon);

        //TopField
        JLabel topField = new JLabel("0");
        topField.setFont(customFont);
        topField.setBounds(385,48,12,27);
        this.add(topField);

        //bottomField
        JTextField bottomField = new JTextField("0",20);
        bottomField.setBorder(null);
        bottomField.setBackground(color);
        Font customFontForBottomField = new Font("Segoe UI", Font.BOLD, 45);
        bottomField.setFont(customFontForBottomField);
        bottomField.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        bottomField.setBounds(0,93,400,48);
        this.add(bottomField);

        //MenuIcon
        ImageIcon menuIcon = new ImageIcon("resources/icons/Menu.png");
        Point menuIconPoint = new Point(15,21);
        CustomIcons menu = new CustomIcons(onTopIcon,onTopPoint);
        menu.setBounds(15,21,16,10);
        this.add(menu);




    }


}