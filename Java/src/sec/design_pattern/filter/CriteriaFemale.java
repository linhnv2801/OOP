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
public class CriteriaFemale implements Criteria {

	/*
	 * (non-Javadoc)
	 * 
	 * @see sec.design_pattern.filter.Criteria#meetCriteria(java.util.List)
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> femalePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getGender().equalsIgnoreCase("female")) {
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}

}
