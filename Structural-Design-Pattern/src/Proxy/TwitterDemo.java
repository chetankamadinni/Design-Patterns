package Proxy;

public class TwitterDemo {

	public static void main(String[] args) {
		Twitter twitter = (Twitter) TwitterProxy.newInstance(new TwitterService());
		System.out.println(twitter.getTweet("test"));
		twitter.post("Hi!!!");

	}

}
