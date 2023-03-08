package java8projects;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method
	
		List<Integer> s1=Arrays.asList(3,6,5,8);
		List<Integer> Square=s1.stream().filter(t->t%2==0).map( t->t*t).collect(Collectors.toList());
		
		System.out.println(Square);

	}

}
