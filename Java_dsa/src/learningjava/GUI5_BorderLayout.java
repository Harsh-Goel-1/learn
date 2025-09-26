package learningjava;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class GUI5_BorderLayout {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		//Border layout places components in 5 major areas- NORTH SOUTH EAST WEST CENTER
		//All extra space is placed in center area
		
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		JFrame frame= new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new BorderLayout(10,10));
		//(10,10) is the 10 pixels of gap between the (height,width) of margin
		
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		JPanel panel4=new JPanel();
		JPanel panel5=new JPanel();
		
		panel1.setBackground(Color.RED);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.yellow);
		panel4.setBackground(Color.magenta);
		panel5.setBackground(Color.blue);
		
		panel1.setPreferredSize(new Dimension(40,40));
		//panel2.setSize(100,100); doesnt work obv
		panel2.setPreferredSize(new Dimension(40,40));
		panel3.setPreferredSize(new Dimension(40,40));
		panel4.setPreferredSize(new Dimension(40,40));
		panel5.setPreferredSize(new Dimension(40,40));
		/*since we are putting panel4 in south,
		 *there is no point in defining the width actally,
		 *only height is meaningful*/
		
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.WEST);
		frame.add(panel3,BorderLayout.EAST);
		frame.add(panel4,BorderLayout.SOUTH);
		frame.add(panel5,BorderLayout.CENTER);
		frame.setVisible(true);
	}

}
