package sound;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Sound {
	private File location;
	private Clip clip;
	public Sound(String location) {
		this.location = new File(location);
	}
	public void play() {
		try {
	         AudioInputStream audioIn = AudioSystem.getAudioInputStream(location); // currently only supports .wav formats
	         clip = AudioSystem.getClip();
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
