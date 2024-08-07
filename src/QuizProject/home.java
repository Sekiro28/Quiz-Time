package QuizProject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.URL;
import java.net.URL;


public class home extends JFrame implements ActionListener{
	
	String[][] questions = new String[10][5];
	String[][] answers = new String[10][2];
	String[][] Userans = new String[10][1];
	
	JLabel questno ,quest ,Welcome ;
	JRadioButton opt1,opt2,opt3,opt4;
	ButtonGroup Grp ;
	JButton nxt,prv,submit;
	public static int time = 15;
	public static int ans_done = 0;
	public static int count = 0;
	public static int score =0;

	
	String name;
	home(String name){
		this.name=name;	
		getContentPane().setBackground(Color.gray);
		setLayout(null);
		setBounds(50,0,1440,800);
		
		
		// image icon
		ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("icons/background.jpg"));
		JLabel image2 = new JLabel(icon2);
		image2.setBounds(0,70,1500,300);
		add(image2);

		//testing
		
		questno = new JLabel();
		questno.setBounds(80,380,600,60);
		questno.setFont(new Font ("Arial",Font.PLAIN,30));
		add(questno);
		setVisible(true);
		
		quest = new JLabel();
		quest.setBounds(150,380,1000,60);
		quest.setFont(new Font ("Arial",Font.PLAIN,30));
		add(quest);
		
		Welcome = new JLabel("Welcome "+name);
		Welcome.setBounds(0,0,1000,60);
		Welcome.setFont(new Font ("Arial",Font.PLAIN,30));
		add(Welcome);
		
		//static questions and answers
		questions[0][0] = "The first computer architecture was designed (or developed) in";
        questions[0][1] = "1970";
        questions[0][2] = "1980";
        questions[0][3] = "1990";
        questions[0][4] = "2000";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";

 
        
        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";
        
        opt1 = new JRadioButton();
        opt1.setBounds(170, 450, 700, 30);
        opt1.setBackground(Color.gray);
        opt1.setFont(new Font("Arial",Font.PLAIN,30));
		add(opt1);
		
		opt2 = new JRadioButton();
        opt2.setBounds(170, 500, 700, 30);
        opt2.setBackground(Color.gray);
        opt2.setFont(new Font("Arial",Font.PLAIN,30));
		add(opt2);
		
		opt3 = new JRadioButton();
        opt3.setBounds(170, 550, 700, 30);
        opt3.setBackground(Color.gray);
        opt3.setFont(new Font("Arial",Font.PLAIN,30));
		add(opt3);
		
		opt4 = new JRadioButton();
        opt4.setBounds(170, 600, 700, 30);
        opt4.setBackground(Color.gray);
        opt4.setFont(new Font("Arial",Font.PLAIN,30));
		add(opt4);
		
		Grp = new ButtonGroup();
		Grp.add(opt1);
		Grp.add(opt2);
		Grp.add(opt3);
		Grp.add(opt4);
		
		//next question
		nxt = new JButton("Next");
		nxt.setBounds(1000,450,200,50);
		nxt.setBackground(Color.BLUE);
		nxt.setForeground(Color.white);	
		nxt.addActionListener(this);
		nxt.setFont(new Font("Arial",Font.PLAIN,40));
		add(nxt);
		
		//previous question
		prv = new JButton("Previous");
		prv.setBounds(1000,550,200,50);
		prv.setBackground(Color.BLUE);
		prv.setForeground(Color.white);	
		prv.addActionListener(this);
		prv.setFont(new Font("Arial",Font.PLAIN,40));
		add(prv);
		
		submit = new JButton("Submit");
		submit.setBounds(1000,650,200,50);
		submit.setBackground(Color.BLUE);
		submit.setForeground(Color.white);
		submit.addActionListener(this);
		submit.setFont(new Font("Arial",Font.PLAIN,40));
		submit.setEnabled(false);
		add(submit);
		
		
		start(count);
		
		setVisible(true);
		
		
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()== nxt) {
			repaint();
			ans_done=1;
			if(Grp.getSelection()==null) {
				Userans[count][0] = "";
			}else {
				Userans[count][0] = Grp.getSelection().getActionCommand();
			}
			// disable next 
			if(count ==8) {
				nxt.setEnabled(false);
				submit.setEnabled(true);
			}
			
			count++;
			start(count);
			
		}else if(ae.getSource()== prv) {
			repaint();
			ans_done=0;
			if(Grp.getSelection()==null) {
				Userans[count][0] = "";
			}else {
				Userans[count][0] = Grp.getSelection().getActionCommand();
			}
			// disable when its 1st question
			if(count ==-1) {
				prv.setEnabled(false);
			}
			
			count--;
			start(count);
			
		}else if (ae.getSource()== submit){
			ans_done = 1;  
			if(Grp.getSelection()==null) {
				Userans[count][0] = "";
			}else {
				Userans[count][0] = Grp.getSelection().getActionCommand();
			}
			
			for(int i=0 ;i<Userans.length;i++) {
				if(Userans[i][0].equals(answers[i][1])) {
					score += 10; 
				}else {
					score += 0;
					
				}
			}
			setVisible(false);
			new Score(name ,score);
		}
	}
	
	
	public void paint(Graphics g) {
		super.paint(g);
		
		/*String timer = "Time left "+ time +" seconds";
		g.setColor(Color.RED);
		g.setFont(new Font("Arial",Font.BOLD,20));
		
		if(time>0) {
			g.drawString(timer, 1220, 440);
		}
		else {
			g.drawString("Times Up", 1220, 440);
		}
		time--;
		*/
		try {
			Thread.sleep(1000);
			repaint();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		if(ans_done==1) {
			ans_done=0;
			time=15;
		}
		else if (time<0) {
			time=15;
			
			if(count ==8) {
				nxt.setEnabled(false);
				submit.setEnabled(true);
			}
			
			if(count==9) {
				
				if(Grp.getSelection()==null) {
					Userans[count][0] = "";
				}else {
					Userans[count][0] = Grp.getSelection().getActionCommand();
				}
				
				for(int i=0 ;i<Userans.length;i++) {
					if(Userans[i][0].equals(answers[i][1])) {
						score += 10; 
					}else {
						score += 0;
						
					}
				}
				setVisible(false);
				
				new Score(name,score);
				
			}else {
					
				if(Grp.getSelection()==null) {
					Userans[count][0] = "";
				}else {
					Userans[count][0] = Grp.getSelection().getActionCommand();
				}
				count++;
				start(count);
			}
		}
	}
	
	public void start(int i) {
		questno.setText(""+(i+1)+". ");
		quest.setText(questions[i][0]);
		opt1.setText(questions[i][1]);
		opt1.setActionCommand(questions[count][1]);
		
		opt2.setText(questions[i][2]);
		opt2.setActionCommand(questions[count][2]);

		
		opt3.setText(questions[i][3]);
		opt3.setActionCommand(questions[count][3]);

		opt4.setText(questions[i][4]);
		opt4.setActionCommand(questions[count][4]);
		
		Grp.clearSelection();

	}

	
	
	public static void main(String[] args) {
		new home("users");
	}


	
}
