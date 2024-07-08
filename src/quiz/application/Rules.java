package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    String name; 
    JButton start , back;
    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome "+ name +" to Simple Minds");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD ,28));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        JLabel rules = new JLabel( );
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font(" Tahoma", Font.PLAIN ,16));
        rules.setText(
                "<html>"+
                        "1.All participants must register before the quiz begins." + "<br><br>"+
                        "2.Participants will have [time limit] to answer each question." + "<br><br>"+
                        "3.Each correct answer will be awarded [+5] points." + "<br><br>"+
                        "4.Any form of cheating or misconduct will result in immediate disqualification" + "<br><br>"+
                        "5.No points will be deducted for incorrect answers." + "<br><br>"+
                        "6.Participants must submit their answers within the allotted time." + "<br><br>"+
                        
                "<html>"        
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250,500, 100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400,500, 100,30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    } 
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start){
            setVisible(false);
             new Quiz(name);
        }
        else if(ae.getSource()==back){
            setVisible(false);
            new Login();
        }
    }
    public static void main(String args[]){
       new Rules("User");
   } 
}
