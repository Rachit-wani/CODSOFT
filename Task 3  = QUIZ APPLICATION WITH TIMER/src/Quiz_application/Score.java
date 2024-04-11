package Quiz_application;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import static Quiz_application.Quiz.score;

public class Score extends JFrame implements ActionListener {
    JButton submit,exit ;

    public Score(String name, int score, String[] userSelectedOptions) {
        setBounds(50, 0, 1440, 850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        JLabel heading = new JLabel("Thankyou " + name + " for playing Learn Good");
        heading.setBounds(480, 30, 490, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);

        JLabel lblscore = new JLabel("Your score is =  " + score);
        lblscore.setBounds(600, 130, 300, 30);
        lblscore.setFont(new Font("Times New Roman", Font.PLAIN, 26));
        add(lblscore);

        submit = new JButton("Play Again");
        submit.setBounds(550, 680, 120, 30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        exit = new JButton("Exit");
        exit.setBounds(700, 680, 120, 30);
        exit.setBackground(new Color(30, 144, 255));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);

        int incorrect = 100 - score;

        JLabel in = new JLabel();
        in.setText("Incorrect count = "+incorrect);
        in.setBounds(590, 200, 300, 30);
        in.setFont(new Font("Times New Roman", Font.PLAIN, 26));
        add(in);

        JLabel selectedOptionsLabel = new JLabel("Your Selected Options:");
        selectedOptionsLabel.setBounds(300, 250, 300, 30);
        selectedOptionsLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(selectedOptionsLabel);

        JLabel selectedOptionsLabel1 = new JLabel("Correct Options are :");
        selectedOptionsLabel1.setBounds(900, 250, 300, 30);
        selectedOptionsLabel1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(selectedOptionsLabel1);

        JTextArea selectedOptionsTextArea = new JTextArea();
        selectedOptionsTextArea.setBounds(320, 300, 400, 250);
        selectedOptionsTextArea.setFont(new Font("Tahoma", Font.PLAIN, 18));
        selectedOptionsTextArea.setEditable(false);
        add(selectedOptionsTextArea);

        JLabel correct1 = new JLabel("Question 1 : JDB");
        JLabel correct2 = new JLabel("Question 2 : Java ");
        JLabel correct3 = new JLabel("Question 3 : Translate source code into machine code ");
        JLabel correct4 = new JLabel("Question 4 : Stack ");
        JLabel correct5 = new JLabel("Question 5 : Hyper Text Markup Language ");
        JLabel correct6 = new JLabel("Question 6 : Structured Query Language ");
        JLabel correct7 = new JLabel("Question 7 : DTP (Desktop Publishing)");
        JLabel correct8 = new JLabel("Question 8 : Prevent unauthorized access to a network\n");
        JLabel correct9 = new JLabel("Question 9 : 11001");
        JLabel correct10 = new JLabel("Question 10: Tree");




        correct1.setBounds(900, 290+2, 800, 17);
        correct1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(correct1);
        correct2.setBounds(900, 307+2, 800, 17);
        correct2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(correct2);
        correct3.setBounds(900, 321+2, 800, 17);
        correct3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(correct3);
        correct4.setBounds(900, 338+2, 800, 17);
        correct4.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(correct4);
        correct5.setBounds(900, 355+2, 800, 17);
        correct5.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(correct5);
        correct6.setBounds(900, 372+2, 800, 17);
        correct6.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(correct6);
        correct7.setBounds(900, 389+2, 800, 17);
        correct7.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(correct7);
        correct8.setBounds(900, 406+2, 800, 17);
        correct8.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(correct8);
        correct9.setBounds(900, 423+2, 800, 17);
        correct9.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(correct9);
        correct10.setBounds(900, 440+2, 800, 17);
        correct10.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(correct10);



        StringBuilder selectedOptionsText = new StringBuilder();
        for (int i = 0; i < userSelectedOptions.length; i++) {
            selectedOptionsText.append("Question ").append(i + 1).append(": ").append(userSelectedOptions[i]).append("\n");
        }
        selectedOptionsTextArea.setText(selectedOptionsText.toString());



        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== submit) {
            setVisible(false);
            new LoginPage();
        } else if (ae.getSource()== exit) {
            setVisible(false);

        }
    }

    public static void main(String[] args)
    {
        String[] userSelectedOptions = {"Option 1", "Option 2", "Option 3", "Option 4", "Option 5", "Option 6", "Option 7", "Option 8", "Option 9", "Option 10"};
        new Score("User", 0, userSelectedOptions);
    }
}
