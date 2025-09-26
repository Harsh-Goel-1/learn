package learningjava;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI4_JButton_MAC extends JFrame implements ActionListener{
	
	JButton button;
	GUI4_JButton_MAC(){
		
			this.setLayout(null);
			button=new JButton();
			button.setBounds(200,200,250,100);
			button.addActionListener(this);
			button.setText("I am a button bro!");
			button.setFont(new Font("Comic Sans",Font.BOLD,15));
			button.setFocusable(false);
		    button.setBackground(Color.magenta);
		    button.setOpaque(true);
		    //need this command in mac since the area behind button gets colored instead of button
		    button.setBorderPainted(false);
		    //adds a line of border instead of homogenous background color, giving 3D feel
			button.setForeground(Color.CYAN);
			button.setBorder(BorderFactory.createEtchedBorder());
			//button.setEnabled(false) makes the button unclickable
				
			//can also add ImageIcon and do allignment n all
				
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setSize(600,600);
			this.add(button);
			this.setVisible(true);
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button) {
					System.out.println("SMASH");
					button.setEnabled(false);
				}}


	}
