import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Rules extends JFrame implements ActionListener{
    String name;
    JButton back,start;

    Rules(String name){
        this.name = name;

        JLabel heading = new JLabel("Welcome " + name + " To Simple Minds ");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        heading.setForeground(new Color(30,144,254));
        add(heading);


        JLabel startj = new JLabel("");
        startj.setBounds(20,90,700,350);
        startj.setFont(new Font("Tahoma",Font.PLAIN,16));
        startj.setText(
            "<html>"+ 
            "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
            "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
            "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
            "4. Crying is allowed but please do so quietly." + "<br><br>" +
            "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
            "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
            "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
            "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
        "<html>"
        );
        add(startj);

        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Times New Roman",Font.BOLD,17));
        back.addActionListener(this);
        back.setFocusable(false);
        add(back);

        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.setFont(new Font("Times New Roman",Font.BOLD,17));
        start.addActionListener(this);
        start.setFocusable(false);
        add(start);

        getContentPane().setBackground(Color.WHITE);

        setSize(800,650);
        setLocation(350,100);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
        
    }

    public static void main(String[] args) {
        new Rules("User");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == back){
        setVisible(false);
        new Login();
       }else if(e.getSource() == start ){
            setVisible(false);
            new Quiz(name);
       }
    }
}
