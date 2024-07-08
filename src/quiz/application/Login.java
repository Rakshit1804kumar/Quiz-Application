package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
  
public class Login extends JFrame implements ActionListener{
    
    JButton rules , back;
    JTextField tfname;
    Login(){
        
        getContentPane().setBackground(Color.YELLOW);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Login.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,-15,600,500);
        add(image);
        
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750, 60,300,45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD , 42));
        heading.setForeground(new Color(0,0,139));
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(800, 140,300,20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD , 20));
        name.setForeground(new Color(30,144,254));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(735,180,300,25);
        tfname.setFont(new Font("Time New Roman",Font.BOLD,20));
        add(tfname);                                
        
        rules = new JButton("Play");
        rules.setBounds(735,220, 120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(915,220, 120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200,450);
        setLocation(200,150);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            String name = tfname.getText();
           setVisible(false);
            Rules obj = new Rules(name);
        }
        else if(ae.getSource()==back){
            setVisible(false);
        }
    }
    public static void main(String []args){
        new Login();
        
    }
}
