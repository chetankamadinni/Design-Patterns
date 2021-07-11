package Strategy;

public class Demo {

	public static void main(String[] args) {
		Context context = new Context();
		AddOpeartion addOpeartion = new AddOpeartion();
		context.setStrategy(addOpeartion);
		int executeStartegy = context.executeStartegy(10, 5);
		System.out.println("10 + 5 : " + executeStartegy);
		
		SubtractOpeartion subtractOpeartion = new SubtractOpeartion();
		context.setStrategy(subtractOpeartion);
		int executeStartegy2 = context.executeStartegy(10, 5);
		System.out.println("10 - 5 : " + executeStartegy2);
		
		MultiplyOpeartion multiplyOpeartion = new MultiplyOpeartion();
		context.setStrategy(multiplyOpeartion);
		int executeStartegy3 = context.executeStartegy(10, 5);
		System.out.println("10 * 5 : "+executeStartegy3);

	}

}
