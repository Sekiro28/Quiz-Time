package QuizProject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
	
	Score(String name , int score){
		getContentPane().setBackground(Color.white);
		setLayout(null);
		setBounds(600,150,750,600);
		
		/*-ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("/Project_1/src/Icons/quiz.png"));
		JLabel image2 = new JLabel(icon2);
		image2.setBounds(0,200,300,250);
		add(image2);*/
		
		JLabel Header = new JLabel("Your Score "+ name +" is "+score);
		Header.setBounds(250,200,600,60);
		Header.setFont(new Font ("Arial",Font.PLAIN,30));
		add(Header);
		setVisible(true);
		
		//Play again Btn
		JButton pa = new JButton("Try again");
		pa.setBounds(300,250,200,60);
		pa.setBackground(Color.GREEN);
		pa.addActionListener(this);
		add(pa);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		new login();
	}
	public static void main(String[] args) {
		new Score("users",0);
	}
	
}
