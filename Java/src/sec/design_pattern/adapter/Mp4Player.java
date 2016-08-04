/**
 * 
 */
package sec.design_pattern.adapter;

/**
 * @author sev_user
 * 
 */
public class Mp4Player implements AdvancedMediaPlayer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * sec.design_pattern.adapter.AdvancedMediaPlayer#playVlc(java.lang.String)
	 */
	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * sec.design_pattern.adapter.AdvancedMediaPlayer#playMp4(java.lang.String)
	 */
	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Playing mp4 file. Name : " + fileName);
	}

}
