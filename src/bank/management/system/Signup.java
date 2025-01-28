package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2, r3, r4, r5;
    JButton next;

    JTextField textName, textFather, textEmail, textAdd, textPin, textState, textCity;// globally declared because we need to access data in them for database
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
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,390,200,30);
        add(email);

        textEmail= new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel ms=new JLabel("Marital Status :");
        ms.setFont(new Font("Raleway",Font.BOLD,20));
        ms.setBounds(100,440,200,30);
        add(ms);

        r3=new JRadioButton("Married");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(222,255,228));
        r3.setBounds(300,440,100,30);
        add(r3);

        r4=new JRadioButton("Unmarried");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(new Color(222,255,228));
        r4.setBounds(450,440,100,30);
        add(r4);

        r5=new JRadioButton("Other");
        r5.setFont(new Font("Raleway",Font.BOLD,14));
        r5.setBackground(new Color(222,255,228));
        r5.setBounds(600,440,100,30);
        add(r5);

        ButtonGroup bg1=new ButtonGroup();
        bg1.add(r3);
        bg1.add(r4);
        bg1.add(r5);


        JLabel address=new JLabel("Address :");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,490,200,30);
        add(address);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway", Font.BOLD,14));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);

        JLabel city=new JLabel("City :");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,540,200,30);
        add(city);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD,14));
        textCity.setBounds(300,540,400,30);
        add(textCity);

        JLabel pincode=new JLabel("Pincode :");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway", Font.BOLD,14));
        textPin.setBounds(300,590,400,30);
        add(textPin);

        JLabel state=new JLabel("State :");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,640,200,30);
        add(state);

        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD,14));
        textState.setBounds(300,640,400,30);
        add(textState);

        next= new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno=first;
        String name=textName.getText();
        String fname=textFather.getText();
        String dob=((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(r1.isSelected()){
            gender="Male";
        }else if(r2.isSelected()){
            gender="Female";
        }
        String email=textEmail.getText();
        String marital=null;
        if(r3.isSelected()){
            marital="Married";
        }else if(r4.isSelected()){
            marital="Unmarried";
        }else if(r5.isSelected()){
            marital="Other";
        }
        String address=textAdd.getText();
        String city=textCity.getText();
        String pincode=textPin.getText();
        String state=textState.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }else{
                Connect con1=new Connect();
                String q="insert into signup values('"+formno+"','"+name+"','"+fname+"', '"+dob+"', '"+gender+"', '"+email+"','"+marital+"','"+address+"', '"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2();
                setVisible(false);

            }

        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
