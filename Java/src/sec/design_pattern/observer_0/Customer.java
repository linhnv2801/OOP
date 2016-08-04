/**
 * 
 */
package sec.design_pattern.observer_0;

/**
 * @author sev_user
 * 
 */
public class Customer implements Observer {
	private String name;
	private int age;

	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Observer#update(java.lang.String)
	 */
	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		System.out.println(name + " " + age);
	}

}
