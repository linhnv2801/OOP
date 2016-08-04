/**
 * 
 */
package sec.design_pattern.iterator;

/**
 * @author sev_user
 * 
 */
public class NameRespository implements Container {
	public String names[] = { "Robert", "John", "Julie", "Lora" };

	/*
	 * (non-Javadoc)
	 * 
	 * @see sec.design_pattern.iterator.Container#getIterator()
	 */
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new NameIterator();
	}

	private class NameIterator implements Iterator {
		int index;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if (index < names.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if (this.hasNext()) {
				return names[index++];
			}
			return null;
		}

	}
}
