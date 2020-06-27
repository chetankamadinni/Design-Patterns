package Proxy;

public class TwitterService implements Twitter {

	@Override
	public String getTweet(String name) {
		return "Hello World from " + name;
	}

	@Override
	public void post(String message) {
		System.out.println("Posting your tweet to your timeline :" + message);

	}

}
