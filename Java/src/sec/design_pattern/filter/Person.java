/**
 * 
 */
package sec.design_pattern.filter;

/**
 * @author sev_user
 * 
 */
public class Person {
	private String name, gender, maritalStatus;

	/**
	 * @param name
	 * @param gender
	 * @param maritalStatus
	 */
	public Person(String name, String gender, String maritalStatus) {
		super();
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @return the marialStatus
	 */
	public String getMaritalStatus() {
		return maritalStatus;
	}

}
