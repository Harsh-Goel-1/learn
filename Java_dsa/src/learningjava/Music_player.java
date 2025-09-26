package learningjava;

import java.io.*;
import javax.sound.sampled.*; //not compatible with mp3 only wav files.
import java.util.*;

public class Music_player {
	
	public static void main(String args[]) throws UnsupportedAudioFileException, IOException, LineUnavailableException   {
		
		File file=new File("music.wav");
		AudioInputStream stream= AudioSystem.getAudioInputStream(file);
		Clip clip= AudioSystem.getClip();
		clip.open(stream);
		String response;
		Scanner scanner = new Scanner(System.in);
		System.out.println("This is a music player\nP=play, S=stop, Q=quit, R=reset\nEnter your choice");
		do {
			response=scanner.next();
			response.toLowerCase();
			switch(response) {
			case"p":clip.start();
			break;
			case"r":clip.setMicrosecondPosition(0);
			break;
			case"s":clip.stop();
			break;
			case"q":clip.close();
			break;
			default:System.out.println("not valid response");
			}
			}while(!response.equals("q"));
		//here response=="q" wont work since q is not a variable
		System.out.println("You have exited the music player");
		scanner.close();
	}
}
