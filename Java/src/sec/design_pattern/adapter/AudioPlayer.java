/**
 * 
 */
package sec.design_pattern.adapter;

import javax.print.attribute.standard.Media;

/**
 * @author sev_user
 * 
 */
public class AudioPlayer implements MediaPlayer {
	MediaAdapter mediaAdapter;

	/*
	 * (non-Javadoc)
	 * 
	 * @see sec.design_pattern.adapter.MediaPlayer#play(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file. Name : " + fileName);
		} else {
			if (audioType.equalsIgnoreCase("vlc")) {
				System.out.println("Playing vlc file. Name : " + fileName);
			} else {
				System.out.println("Invalid media. " + audioType
						+ " format not supported.");
			}
		}
	}

}
