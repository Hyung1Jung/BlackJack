package blackJack;

import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;

public class Mp3 extends JFrame { 

	public Mp3() {
	      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      this.setTitle("Test Sound Clipp");
	      this.setSize(300, 200);
	      this.setVisible(true);

	      try {
	         // Open an audio input stream.
	         URL url = this.getClass().getClassLoader().getResource("C:\\Users\\user\\Desktop\\Maybe.wav");
	         AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
	         // Get a sound clip resource.
	         Clip clip = AudioSystem.getClip();
	         // Open audio clip and load samples from the audio input stream.
	         clip.open(audioIn);
	         clip.start();
	      } catch (UnsupportedAudioFileException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      } catch (LineUnavailableException e) {
	         e.printStackTrace();
	      }
	   }
}