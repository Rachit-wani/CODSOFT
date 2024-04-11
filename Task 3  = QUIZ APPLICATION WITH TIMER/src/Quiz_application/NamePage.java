package Quiz_application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class NamePage extends JFrame implements ActionListener {
    String name;
    JButton start, back;

    NamePage(String name)
    {
        this.name = name;
        setLayout(null);

        JLabel header1 = new JLabel("Learn Good");
        header1.setBounds(380, 50, 500, 80);
        header1.setFont(new Font("Times New Roman", Font.BOLD, 45));
        add(header1);

        JLabel header2 = new JLabel("Welcome "+name+" to Learn Good");
        header2.setBounds(300, 100, 500, 80);
        header2.setFont(new Font("Times New Roman", Font.BOLD, 30));
        add(header2);

        start = new JButton("Start");
        start.setBounds(360, 410, 100, 30);
        start.addActionListener(this);
        add(start);

        back  = new JButton("Back");
        back.setBounds(500, 410, 100, 30);
        back.addActionListener(this);
        add(back);

        setSize(1000, 500);
        setLocation(150, 120);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== start){
            setVisible(false);
            new Quiz(name);
        }
        else if (e.getSource()== back){
            setVisible(false);
            new LoginPage();
        }

    }


    public static void main(String[] args) {
new NamePage("user");
    }
}
