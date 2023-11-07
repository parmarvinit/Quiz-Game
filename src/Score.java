import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Score extends JFrame implements ActionListener{

            JButton again,exit;

   Score(String name,int score){
            
            ImageIcon  i1 = new ImageIcon(ClassLoader.getSystemResource("score.jpg"));
            Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(0, 200, 300, 250);;
            add(image);

            JLabel heading = new JLabel("Thank you " + name + " for playing Simple Minds");
            heading.setBounds(45,30,700,30);
            heading.setFont(new Font("Thoma",Font.PLAIN,26));
            add(heading);

            JLabel quizscore = new JLabel("Your Score is " + score);
            quizscore.setBounds(440,200,300,30);
            quizscore.setFont(new Font("Thoma",Font.PLAIN,26));
            add(quizscore);

            again = new JButton("Play Again");
            again.setBounds(380,270,120,30);
            again.setFont(new Font("Thoma",Font.BOLD,15));
            again.setBackground(new Color(30,144,255));
            again.setForeground(Color.WHITE);
            again.addActionListener(this);
            again.setFocusable(false);
            add(again);

            exit = new JButton("Exit");
            exit.setBounds(560,270,120,30);
            exit.setFont(new Font("Thoma",Font.BOLD,15));
            exit.setBackground(new Color(30,144,255));
            exit.setForeground(Color.WHITE);
            exit.addActionListener(this);
            exit.setFocusable(false);
            add(exit);

            getContentPane().setBackground(Color.WHITE);
            setBounds(400, 150, 750, 550);
            setLayout(null);
            setUndecorated(true);
            setVisible(true);
    }  

    public static void main(String[] args) {
        new Score("User", 0);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

       if(e.getSource() == again){
            setVisible(false);
            new Login();
       }else{
            dispose();
       }
    }
}
