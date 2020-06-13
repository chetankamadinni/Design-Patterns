package Adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterDemo {
	public static void main(String[] args) {
		String sampleArray[] = {"Bob","Tom","Alex"};
		System.out.println(sampleArray);
		
		List<String> asList = Arrays.asList(sampleArray);
		System.out.println(asList);
	}
}
