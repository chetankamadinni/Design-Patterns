package Iterator;

public class NameRepository implements Collection {

	public String[] names = { "Chetan", "Jeevan", "Harish", "Sumit" };

	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator {

		private int index = 0;

		@Override
		public boolean hasNext() {
			return index < names.length;
		}

		@Override
		public Object next() {
			if (this.hasNext())
				return names[index++];
			return null;
		}

	}

}
