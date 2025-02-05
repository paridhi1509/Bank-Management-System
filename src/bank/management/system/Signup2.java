package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Signup2 extends JFrame {
    JComboBox comboBox, comboBox2, comboBox3; // adds a dropdown of given array
    String formno;
    Signup2(String first){
        super("APPLICATION FORM");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno=formno;

        JLabel l1=new JLabel("Page 2");
        l1.setFont(new Font("Raleway", Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2=new JLabel("ADDITIONAL DETAILS");
        l2.setFont(new Font("Raleway", Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3=new JLabel("RELIGION :");
        l3.setFont(new Font("Raleway", Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion[]={"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        comboBox=new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway", Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4=new JLabel("CATEGORY :");
        l4.setFont(new Font("Raleway", Font.BOLD,18));
        l4.setBounds(100,170,150,30);
        add(l4);

        String category[]={"General", "OBC", "SC", "ST", "Other"};
        comboBox2=new JComboBox(category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Raleway", Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5=new JLabel("INCOME :");
        l5.setFont(new Font("Raleway", Font.BOLD,18));
        l5.setBounds(100,220,150,30);
        add(l5);

        String income[]={"Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000", ">10,00,000"};
        comboBox3=new JComboBox(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway", Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6=new JLabel("EDUCATIONAL :");
        l6.setFont(new Font("Raleway", Font.BOLD,18));
        l6.setBounds(100,170,150,30);
        add(l6);

        String category[]={"General", "OBC", "SC", "ST", "Other"};
        comboBox2=new JComboBox(category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Raleway", Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);



        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);
    }

    public static void main(String[] args) {
        new Signup2("");
    }

}
