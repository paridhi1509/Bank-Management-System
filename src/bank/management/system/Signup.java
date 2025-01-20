package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Signup extends JFrame {
    Random ran=new Random();
    long first4=(ran.nextLong()%9000L)+1000L;
    // ran.nextLong() generates random long integer(both + and -)
    // %9000L ensures it's in range -8999 t0 8999
    // +1000L shifts it to 1000 so range becomes 1000 to 9999 so 4 digit number only
    String first=" "+Math.abs(first4);
    Signup(){
        super("APPLICATION FORM");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1=new JLabel("APPLICATION FORM NO:"+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2=new JLabel("Page 1");
        label2.setFont(new Font("Raelway", Font.BOLD, 22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3=new JLabel("PERSONAL DETAILS");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(290,90,600,30);
        add(label3);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Signup();
    }
}
