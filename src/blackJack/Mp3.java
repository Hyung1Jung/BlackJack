
package blackJack;

import java.io.File;
import java.io.FileInputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;

public class Mp3 extends JFrame {

	private static Mp3 _instance;

	public static Mp3 getInstance() {
		if (_instance == null) {
			_instance = new Mp3();
		}
		return _instance;
	}

	Clip clip;
	AudioInputStream audioIn;
	String dedefaultSoundPath = "C:/Users/user/Desktop/sample.wav";

	public Mp3() {
		
	
	try{
		File soundFile = new File(dedefaultSoundPath);
		audioIn = AudioSystem.getAudioInputStream(soundFile);
	}catch(Exception ex){
		System.out.println("Error : "+ ex.getMessage());
	}
	
	public AudioInputStream getAudioInputStream(){
		return this.audioIn;
	}
	
	try{	
		clip = AudioSystem.getClip();
		clip.open(getInstance().getAudioInputStream());
		clip.stop();
		}catch(Exception ex){
			System.out.println("Error : "+ ex.getMessage());
		}
	
	
	}
	private AudioInputStream getAudioInputStream() {
		// TODO Auto-generated method stub
		return null;
	}
	public void startGame(){
		clip.loop(Clip.LOOP_CONTINUOUSLY);
		clip.start();	
	}
	public void gameReset(){
		if(this.clip.isRunning()){
			this.clip.stop();
		}
	}
}
