package quiz.application; 

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Score extends JFrame implements ActionListener{
    
    Score(String  name, int score){
        String Name = name;
        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Score.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 250,Image.SCALE_DEFAULT );
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);
        
        JLabel heading = new JLabel( "Your Score is "+ score);
        heading.setBounds(350,200,300,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,28));
        add(heading);
        
        JLabel fscore = new JLabel("Thankyou for playing Simple Minds" );
        fscore.setBounds(45,30,700,30);
        fscore.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(fscore);
        
        JButton submit = new JButton("Play Again ");
        submit.setBounds( 3800,270,120,30); 
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public static void main(String []args){
         new Score("user",0);
    }
    
}
