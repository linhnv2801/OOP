package sec.design_pattern.adapter;

public class MediaAdapter implements MediaPlayer {
	AdvancedMediaPlayer adPlayer;

	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("vlc")) {
			adPlayer = new VlcPlayer();
		} else if (audioType.equalsIgnoreCase("mp4")) {
			adPlayer = new Mp4Player();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if (audioType.equalsIgnoreCase("vlc")) {
			adPlayer.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			adPlayer.playMp4(fileName);
		}
	}

}
