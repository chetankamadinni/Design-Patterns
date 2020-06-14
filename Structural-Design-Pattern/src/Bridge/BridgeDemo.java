package Bridge;

public class BridgeDemo {
	public static void main(String[] args) {

		Movie movie = new Movie("Action", "2:35", "John wick", "2012");
		
		Formatter formatter = new PrintFormatter();
		Printer printer = new MoviePrinter(movie);
		String print = printer.print(formatter);
		System.out.println(print);
	}
}
