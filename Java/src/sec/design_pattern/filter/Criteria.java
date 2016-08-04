/**
 * 
 */
package sec.design_pattern.filter;

import java.util.List;

/**
 * @author sev_user
 *
 */
public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}
