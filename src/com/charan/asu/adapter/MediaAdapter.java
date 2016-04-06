package com.charan.asu.adapter;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String audioType) {
		// TODO Auto-generated constructor stub
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer = new Vlcplayer();
		} else if(audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer = new Mp4Player();
		}
	}
	
	public void play(String audioType, String filename) {
		// TODO Auto-generated method stub
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer.playVlc(filename);
		} else if(audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer.playmp4(filename);
		}
	}

}
