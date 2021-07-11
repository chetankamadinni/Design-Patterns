package Iterator;

public class Demo {

	public static void main(String[] args) {
		NameRepository repo = new NameRepository();
		Iterator iterator = repo.getIterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());

	}

}
