package learningjava;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class GUI1 {
	
	public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		/* need this UIManager.setLookAndFeel for gui in mac,
		 * made icon space in title bar in combination with JFrame.setDefaultLookAndFeel(true);*/
		JFrame.setDefaultLookAndFeelDecorated(true);
		//for icon space
		JFrame frame=new JFrame(); //creates a new frame
		frame.setSize(420,420);
		frame.setTitle("you good bro?");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//".DO_NOTHING_ON_CLOSE" is "notty hora hai"
		frame.setResizable(false);
		ImageIcon image=new ImageIcon("butterfly.jpg"); //creates ImageIcon
		frame.setIconImage(image.getImage()); //sets icon of frame
		frame.getContentPane().setBackground(Color.green);
		frame.getContentPane().setBackground(new Color(22,34,81));
		//RGB values red,green,blue
		frame.getContentPane().setBackground(new Color(0x123456));
		//hexadecimal values 0x then 6 digits/letters
		//example- 0x000000 is black 0xFFFFFF is white
		
		/* Can also create a constructor for this and create
		 * its sub classes like.. public class GUI extend JFrame
		 * (ignore the yellow warning you get) and then put
		 * whole code in constructor then use edit to replace "frame." to "this."
		 * then call it in Main file using "new GUI;",
		 * no need to create object gui if you don't plan on editing the it
		 */
	}
	
}
