/**
 * 
 */
package sec.design_pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sev_user
 * 
 */
public class CriteriaMale implements Criteria {

	/*
	 * (non-Javadoc)
	 * 
	 * @see sec.design_pattern.filter.Criteria#meetCriteria(java.util.List)
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> malePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getGender().equalsIgnoreCase("male")) {
				malePersons.add(person);
			}
		}
		return malePersons;
	}

}
