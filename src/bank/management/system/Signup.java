package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame {
    JRadioButton r1,r2;

    JTextField textName, textFather, textEmail, textMs, textAdd;// globally declared because we need to access data in them for database
    JDateChooser datechooser;
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

        JLabel name=new JLabel("Name :");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100,190,100,30);
        add(name);

        textName= new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel Fname=new JLabel("Father's Name :");
        Fname.setFont(new Font("Raleway", Font.BOLD, 20));
        Fname.setBounds(100,240,200,30);
        add(Fname);

        textFather= new JTextField();
        textFather.setFont(new Font("Raleway", Font.BOLD,14));
        textFather.setBounds(300,240,400,30);
        add(textFather);

        JLabel DOB=new JLabel("Date of Birth :");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100,340,200,30);
        add(DOB);

        datechooser=new JDateChooser();
        datechooser.setForeground(new Color(105,105,105));
        datechooser.setBounds(300,340,400,30);
        add(datechooser);

        JLabel gender=new JLabel("Gender :");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,90,30);
        add(r2);

        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);// doing this so that either male or female can be selected instead of both

        JLabel email=new JLabel("Email address :");
        email.setFont(new Font("Raleway",Font.BOLD,30));
        email.setBounds(100,390,200,30);
        add(email);

        textEmail= new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel ms=new JLabel("Marital Status :");
        ms.setFont(new Font("Raleway",Font.BOLD,30));
        ms.setBounds(100,440,200,30);
        add(ms);

        textMs= new JTextField();
        textMs.setFont(new Font("Raleway", Font.BOLD,14));
        textMs.setBounds(300,440,400,30);
        add(textMs);

        JLabel address=new JLabel("Address :");
        address.setFont(new Font("Raleway",Font.BOLD,30));
        address.setBounds(100,490,200,30);
        add(address);

        JTextField textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway", Font.BOLD,14));
        textAdd.setBounds(300,440,400,30);
        add(textAdd);



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
