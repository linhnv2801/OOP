/**
 * 
 */
package sec.design_pattern.proxy_pattern;

/**
 * @author sev_user
 * 
 */
public class RealImage implements Image {
	private String fileName;

	/**
	 * @param fileName
	 */
	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sec.design_pattern.proxy_pattern.Image#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Displaying " + fileName);
	}

	private void loadFromDisk(String fileName) {
		System.out.println("Loading " + fileName);
	}

}
