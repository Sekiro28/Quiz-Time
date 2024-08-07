package QuizProject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class login extends JFrame implements ActionListener{

	JButton b1;
	JTextField t1;
	login(){
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		//login image icon
		ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
		JLabel image = new JLabel(icon1);
		image.setBounds(0,0,1000,100);
		add(image);
		
		//welcome label
		JLabel h1 = new JLabel("Welcome to Ez Quiz");
		h1.setBounds(250,-100,3000,450);
		h1.setFont(new Font ("Roboto",Font.BOLD,50));
		h1.setForeground(new Color(243,66,19));
		add(h1);
		
		//Username label
		JLabel h2 = new JLabel("Enter Username");
		h2.setBounds(330,-25,1000,500);
		h2.setFont(new Font ("serif",Font.BOLD,45));
		h2.setForeground(new Color(13,66,19));
		add(h2);
		
		//text box
		t1 = new JTextField();
		//          (left,up,length,width)
		t1.setBounds(330,250,300,30);
		t1.setFont(new Font ("Arial",Font.LAYOUT_LEFT_TO_RIGHT,20));
		add(t1);
		
		//Submit Button
		b1 = new JButton("Submit");
		b1.setBounds(420,300,100,30);
		b1.setBackground(Color.GREEN);
		b1.addActionListener(this);
		add(b1);
		
		
		
		setSize(1000,500);
		setLocation(200,20);
		setVisible(true);
	}

	public static void main(String[] args) {
		new login();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			String name= t1.getText();
			setVisible(false);
			new home(name);
		}
	}

	
 }

