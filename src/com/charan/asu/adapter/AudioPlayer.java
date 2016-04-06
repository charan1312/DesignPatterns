package com.charan.asu.adapter;

public class AudioPlayer implements MediaPlayer{

	MediaAdapter audioadapter;
	@Override
	public void play(String audioType, String filename) {
		// TODO Auto-generated method stub
		if(audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing MP3 File. FileName:" + filename);
		} else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			audioadapter = new MediaAdapter(audioType);
			audioadapter.play(audioType, filename);
		} else {
			System.out.println("Invalid File Format");
		}
	}

}
