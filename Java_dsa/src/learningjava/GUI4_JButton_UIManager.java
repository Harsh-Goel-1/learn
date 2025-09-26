package learningjava;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class GUI4_JButton_UIManager extends JFrame implements ActionListener {
		
	JButton button;
	JLabel label;
	GUI4_JButton_UIManager(){
		try {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		//gives you windows gui feel on mac..
		//try adding background color without this it wont work as it is supposed to
		this.setLayout(null);
		button=new JButton();
		button.setBounds(200,200,250,100);
		button.addActionListener(this);
		button.setText("I am a button bro!");
		button.setFont(new Font("Comic Sans",Font.BOLD,15));
		button.setFocusable(false);
	    button.setBackground(Color.magenta);
		button.setForeground(Color.CYAN);
		button.setBorder(BorderFactory.createEtchedBorder());
		//button.setEnabled(false) makes the button unclickable
		//can also add ImageIcon and do allignment n all
		
		BufferedImage emage= ImageIO.read(new File("butterfly.jpg"));
		Image image=emage.getScaledInstance(200,200,Image.SCALE_DEFAULT);
		ImageIcon i=new ImageIcon(image);
		label=new JLabel();
		label.setIcon(i);
		label.setBounds(250,350,200,200);
		label.setVisible(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,600);
		this.add(button);
		this.add(label);
		this.setVisible(true);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button) {
				button.setEnabled(false);
				label.setVisible(true);
			}}}

//can use lambda expression for shortcut.. it is advanced concept
//instead of using implements ActionListener