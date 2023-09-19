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
        Font buttonFont19Bold = new Font("Segoe UI", Font.BOLD, 19);
        Color colorF9 = new Color(0xF9F9F9);
        Color colorFF = new Color(0xFFFFFF);
        Color color00 = new Color(0x0067C0);
        int arc1 = 10;
        arc = arc1;
        this.setLayout(null);
        this.setBounds(0,208,410,418);

        //%button
        CustomButton modulus = new CustomButton("%", new Point(39,18), arc1,colorF9,buttonFont19);
        modulus.setBounds(7,5,96,62);
        this.add(modulus);

        //CE
        CustomButton ce = new CustomButton("CE", new Point(39,21  ), arc1,colorF9,buttonFont15);
        ce.setBounds(107,5,96,62);
        this.add(ce);

        //C
        CustomButton c = new CustomButton("C", new Point((int) 43,21  ), arc1,colorF9,buttonFont15);
        c.setBounds(207,5,96,62);
        this.add(c);

        //xButton
        CustomButton xButton = new CustomButton("",new Point(40,26), arc1,colorF9,buttonFont15) ;
        xButton.setBounds(307,5,96,62);
        this.add(xButton);

        //OneOverX
        CustomButton oneOverX = new CustomButton("1/x",new Point(37,22), arc1,colorF9,new Font("Segoe UI", Font.PLAIN, 13)) ;
        oneOverX.setBounds(7,71,96,62);
        this.add(oneOverX);

        //XSquare
        CustomButton xSquare = new CustomButton("X²",new Point(43,22), arc1,colorF9,new Font("Segoe UI", Font.PLAIN, 13)) ;
        xSquare.setBounds(107,71,96,62);
        this.add(xSquare);

        //Radical
        CustomButton radical = new CustomButton("²√",new Point(40,22), arc1,colorF9,buttonFont15) ;
        radical.setBounds(207,71,96,62);
        this.add(radical);

        //Division
        CustomButton division = new CustomButton("÷",new Point(42,17), arc1,colorF9,new Font("Segoe UI", Font.PLAIN, 20)) ;
        division.setBounds(307,71,96,62);
        this.add(division);

        //Seven
        CustomButton seven = new CustomButton("7",new Point(43,19), arc1,colorFF,new Font("Segoe UI", Font.PLAIN, 18));
        seven.setBounds(7,137,96,62);
        this.add(seven);

        //Eight
        CustomButton eight = new CustomButton("8",new Point(43,19), arc1,colorFF,new Font("Segoe UI", Font.PLAIN, 18));
        eight.setBounds(107,137,96,62);
        this.add(eight);

        //Nine
        CustomButton nine = new CustomButton("9",new Point(43,19), arc1,colorFF,new Font("Segoe UI", Font.PLAIN, 18));
        nine.setBounds(207,137,96,62);
        this.add(nine);

        //Multiply
        CustomButton multiply = new CustomButton("×",new Point(43,15), arc1,colorF9,new Font("Segoe UI", Font.PLAIN, 20));
        multiply.setBounds(307,137,96,62);
        this.add(multiply);

        //Four
        CustomButton four = new CustomButton("4",new Point(43,19), arc1,colorFF,new Font("Segoe UI", Font.PLAIN, 18));
        four.setBounds(7,203,96,62);
        this.add(four);

        //Five
        CustomButton five = new CustomButton("5",new Point(43,19), arc1,colorFF,new Font("Segoe UI", Font.PLAIN, 18));
        five.setBounds(107,203,96,62);
        this.add(five);

        //Six
        CustomButton six = new CustomButton("6",new Point(43,19), arc1,colorFF,new Font("Segoe UI", Font.PLAIN, 18));
        six.setBounds(207,203,96,62);
        this.add(six);

        //Subtract
        CustomButton subtract = new CustomButton("-",new Point(43,17), arc1,colorF9,new Font("Segoe UI", Font.PLAIN, 20));
        subtract.setBounds(307,203,96,62);
        this.add(subtract);

        //One
        CustomButton one = new CustomButton("1",new Point(43,19), arc1,colorFF,new Font("Segoe UI", Font.PLAIN, 18));
        one.setBounds(7,269,96,62);
        this.add(one);

        //Two
        CustomButton two = new CustomButton("2",new Point(43,19), arc1,colorFF,new Font("Segoe UI", Font.PLAIN, 18));
        two.setBounds(107,269,96,62);
        this.add(two);

        //Three
        CustomButton three = new CustomButton("3",new Point(43,19), arc1,colorFF,new Font("Segoe UI", Font.PLAIN, 18));
        three.setBounds(207,269,96,62);
        this.add(three);

        //Addition
        CustomButton addition = new CustomButton("+",new Point(40,17), arc1,colorF9,new Font("Segoe UI", Font.PLAIN, 20));
        addition.setBounds(307,269,96,62);
        this.add(addition);

        //negate
        CustomButton negate = new CustomButton("+/-",new Point(36,17), arc1,colorFF,new Font("Segoe UI", Font.PLAIN, 15));
        negate.setBounds(7,335,96,62);
        this.add(negate);

        //Zero
        CustomButton zero = new CustomButton("0",new Point(43,19), arc1,colorFF,new Font("Segoe UI", Font.PLAIN, 18));
        zero.setBounds(107,335,96,62);
        this.add(zero);

        //Point
        CustomButton point = new CustomButton(".",new Point(48,20), arc1,colorFF,new Font("Segoe UI", Font.BOLD, 25));
        point.setBounds(207,335,96,62);
        this.add(point);

        //Equals
        CustomButton equal = new CustomButton("=",new Point(39,11), arc1,color00,new Font("Segoe UI", Font.BOLD, 25));
        equal.setBounds(307,335,96,62);
        this.add(equal);


    }
}
