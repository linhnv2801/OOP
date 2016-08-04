/**
 * 
 */
package sec.design_pattern.iterator;

/**
 * @author sev_user
 * 
 */
public class IteratorPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameRespository nameRespository = new NameRespository();

		for (Iterator iter = nameRespository.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}
	}

}
