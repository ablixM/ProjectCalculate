package Panel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import UI.CustomButton;
import UI.CustomIcons;
import  UI.CustomPanel;

public class TopPanel extends CustomPanel {
    Font customFont = new Font("Segoe UI", Font.BOLD, 19);
    Color color = new Color(0xF3F3F3);

    public TopPanel() throws IOException {
        setLayout(null);
        this.setBounds(0,0,410,166);

        //Standard text
        JLabel standard = new JLabel("Standard");
        standard.setFont(customFont);
        standard.setBounds(47,9,86,26);
        this.add(standard);

        Point HistoryStartLocation = new Point(5,5);
        URL HistoryButtonLocation = (Objects.requireNonNull(getClass().getResource("/resources/icons/History.png")));
        ImageIcon HistoryButtonIcon = new ImageIcon(HistoryButtonLocation);
        CustomButton HistoryButton = new CustomButton(5,color,HistoryButtonIcon,HistoryStartLocation) ;

        HistoryButton.setBounds(372,15,25,25);
        this.add(HistoryButton);

       /* //History Icon
        Point historyIconStartLocation = new Point(0,0);
        URL historyIconLocation = (Objects.requireNonNull(getClass().getResource("/resources/icons/History.png")));
        ImageIcon historyIcon = new ImageIcon(historyIconLocation);
        CustomIcons HistIcon = new   CustomIcons(historyIcon,historyIconStartLocation);
        HistIcon.setBounds(372,15,16,16);
        this.add(HistIcon);
/*
        //OnTop Icon
        Point onTopIconStartLocation = new Point(150,16);
        URL  onTopIconLocation  = (Objects.requireNonNull(getClass().getResource("/resources/icons/OnTop.png")));
        ImageIcon onTopIcon = new ImageIcon(onTopIconLocation);
        CustomIcons onIcon = new CustomIcons(onTopIcon,onTopIconStartLocation);
        onIcon.setBounds(150,16,14,15);
        this.add(onIcon);*/

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
        Point menuButtonStartLocation = new Point((int)4.5, (int) 7.5);
        URL  menuButtonLocation  = (Objects.requireNonNull(getClass().getResource("/resources/icons/Menu.png")));
        ImageIcon menuIcon = new ImageIcon(menuButtonLocation);
        CustomButton menuButton = new CustomButton(5,color,menuIcon,menuButtonStartLocation) ;
        menuButton.setBounds(10 ,11,25,25);
        this.add(menuButton);

    }


}