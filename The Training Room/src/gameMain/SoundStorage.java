package gameMain;

import wolfEngine.sound.Sound;

public interface SoundStorage {
	public static final String baseThemeLocation = ".\\The Training Room\\src\\SoundLocation\\";
	// All of the variables in here must follow the above format ^

	// ALL SOUND FILES MUST BE IN THE .WAV FORMAT!
	Sound wolfHowl = new Sound(baseThemeLocation + "wolfHowl.wav");
}
