package learningjava;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
//need these imports even after javax.swing.* for some reason

public class GUI2_JLabel {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            //need this for icon in title baar mac gui issue
            BufferedImage bufferedImage = ImageIO.read(new File("image.jpeg"));
            Image emage = bufferedImage.getScaledInstance(400, 400, Image.SCALE_DEFAULT);
            //,get`ScaledInstance returns Image type so cannot directly use it in ImageIcon image=...
            ImageIcon image=new ImageIcon(emage);
            JLabel label = new JLabel();
            label.setText("you have skill issue child");
            label.setIcon(image);
            label.setHorizontalTextPosition(JLabel.CENTER);
            label.setVerticalTextPosition(JLabel.CENTER);
            //changing the allignment of text wrt icon
            label.setForeground(new Color(0xFFFFFF));
            //for font color
            label.setFont(new Font("MV Boli",Font.ITALIC,15));
            label.setIconTextGap(-50);//useless here since it doesnt overwrite textposition commands
            label.setBackground(new Color(20,10,70));
            label.setOpaque(true);
            //makes the background color visible
            Border border=BorderFactory.createLineBorder(Color.green,4);
            label.setBorder(border);
            label.setVerticalAlignment(JLabel.CENTER);//whole label alignment
            label.setHorizontalAlignment(JLabel.CENTER);//whole label alignmnent
            
            /*We can also limit the amount of space label occupies in the frame
             *label.setBounds(0,0,200,200); 0,0 is position wrt top left 200,200 is size
             *need frame.setLayout(null) before frame.add(label) for .setBounds to work
             *since borderlayout is used in JFrame by default*/
            
            JFrame.setDefaultLookAndFeelDecorated(true);
            //gave space for icon in title bar
            JFrame frame = new JFrame();
            ImageIcon image2=new ImageIcon("butterfly.jpg");
    		frame.setIconImage(image2.getImage());
    		frame.getContentPane().setBackground(new Color(22,34,81));
    		//doesnt overwrite the label.setBackground
            frame.setSize(1000,700);
            frame.setTitle("Test");
            //frame.setLayout(null);
            frame.add(label);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();//this mofo right here puts all alignment commands, frame.setSize n all to waste
            frame.setVisible(true);
            //if "frame.add(label);" was here after visible then labels wont show up
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
