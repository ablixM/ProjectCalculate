package Panel;

import UI.CustomButton;
import UI.Panel;

import javax.swing.*;
import java.awt.*;

public class MiddlePanel extends Panel {

    public MiddlePanel() {
        Font buttonFont = new Font("Segoe UI", Font.BOLD, 12);
        setLayout(null);
        this.setBounds(0,166 ,422,45);

        //MCButton
        Color color = new Color(0xF3F3F3);
        CustomButton mc = new CustomButton("MC", new Point(23,11),6,color,buttonFont);
        mc.setBounds(4,4,65,37);
        this.add(mc);
        //MRButton
        CustomButton mr = new CustomButton("MR", new Point(23,11),6,color,buttonFont);
        mr.setBounds(71,4 ,65,37);
        this.add(mr);
        //M+Button
        CustomButton mPlus = new CustomButton("M+", new Point(23,11),6,color,buttonFont);
        mPlus.setBounds(138,4,65,37);
        this.add(mPlus);

        //M-Button
        CustomButton mMinus = new CustomButton("M-", new Point(23,11),6,color,buttonFont);
        mMinus.setBounds(205,4,65,37);
        this.add(mMinus);

        //MSButton
        CustomButton ms = new CustomButton("M-", new Point(23,11),6,color,buttonFont);
        ms.setBounds(272,4,65,37);
        this.add(ms);


        //MDrop
        CustomButton mDrop = new CustomButton("M-", new Point(23,11),6,color,buttonFont);
        mDrop.setBounds(339,4,65,37);
        this.add(mDrop);

        setVisible(true);
    }
}


