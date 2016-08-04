/**
 * 
 */
package sec.design_pattern.proxy_pattern;

/**
 * @author sev_user
 * 
 */
public class ProxyImage implements Image {
	private RealImage realImage;
	private String fileName;

	/**
	 * @param fileName
	 */
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sec.design_pattern.proxy_pattern.Image#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		if (realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}

}
