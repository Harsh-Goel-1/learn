package learningjava;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI3_JPanel {

	public static void main(String[] args) throws IOException {
		
		BufferedImage buff=ImageIO.read(new File("butterfly.jpg"));
		Image image=buff.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon icon=new ImageIcon(image);
		
		JLabel label=new JLabel();
		label.setText("hey bitch!");
		label.setIcon(icon);
		label.setVerticalAlignment(JLabel.BOTTOM);
		label.setHorizontalAlignment(JLabel.RIGHT);
		label.setIconTextGap(-70);
		
		JPanel redpanel=new JPanel();
		redpanel.setBackground(Color.RED);
		redpanel.setBounds(0, 0, 250, 250);
		redpanel.setLayout(new BorderLayout());
		
		//panels use flowlayout manager, we used borderlayout by default in frame
		//flowlayout doesnt execute alignment commands on labels soo yeah
		//flowlayout manager puts labels on top center,if filled then next line
		
		//can use label.setBounds by using redpanel.setLayout(null);
		//the x and y co-ordinates are wrt to the red panel if we do redpanel.add(label);
		
		JPanel bluepanel=new JPanel();
		bluepanel.setBackground(Color.BLUE);
		bluepanel.setBounds(250, 0, 250, 250);
		
		JPanel greenpanel=new JPanel();
		greenpanel.setBackground(Color.GREEN);
		greenpanel.setBounds(0, 250, 250, 250);
		
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(500,500);
		redpanel.add(label);
		//dont do frame.add(label)
		frame.add(redpanel);
		frame.add(bluepanel);
		frame.add(greenpanel);		
		frame.setVisible(true);
	}

}
