package learningjava;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GUI1_constructor_form extends JFrame { 
	
	GUI1_constructor_form(){
    this.setTitle("hoho title goes here"); 
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setSize(420,420);
    this.setVisible(true); 
    ImageIcon image = new ImageIcon("image.jpeg"); 
    this.setIconImage(image.getImage());
    this.getContentPane().setBackground(new Color(0x123456));
	}
}
