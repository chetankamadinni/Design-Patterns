package Template;

public class Demo {

	public static void main(String[] args) {
		GameTemplate cricket = new Cricket();
		cricket.play();
		System.out.println("------------------------------");
		
		GameTemplate football = new Football();
		football.play();

	}

}
