package Observer;

public class Demo {

	public static void main(String[] args) {
		User user1 = new User("user1");
		User user2 = new User("user2");
		
		Data data = new Data();
		data.registerObserver(user1);
		data.registerObserver(user2);
		
		data.dataChanged("Here is a notification");
		data.unregisterObserver(user1);
		data.dataChanged("Here is a new notification");

	}

}
