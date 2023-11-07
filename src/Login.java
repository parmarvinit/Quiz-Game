import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    
    JButton  rules,back;
    JTextField tfname;

    Login(){
        
        ImageIcon  i1 = new ImageIcon(ClassLoader.getSystemResource("login.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);;
        add(image);

        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(new Color(30,144,254));
        add(heading);


        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(810, 150, 300, 25);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        name.setForeground(new Color(30,144,254));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);


        rules = new JButton("Rules");
        rules.setBounds(735, 260, 120, 25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.setFont(new Font("Times New Roman",Font.BOLD,17));
        rules.addActionListener(this);
        rules.setFocusable(false);
        add(rules);

        back = new JButton("Exit");
        back.setBounds(915, 260, 120, 25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Times New Roman",Font.BOLD,17));
        back.addActionListener(this);
        back.setFocusable(false);
        add(back);


        setSize(1200, 500); 
        setLocation(200, 200); 
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name).setVisible(true);;
        }else if(e.getSource() == back){
            setVisible(false);
        }
    }
}
