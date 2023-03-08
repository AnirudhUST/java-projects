package java8projects;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List <String> s=Arrays.asList("AGK","ABK","ACK","AGK","ABK");
//         int count=0;
//         s.stream().filter(t->t.equals(t)).
//         System.out.println(Square);
         Map<String,Long> count=s.stream().map(n->n.toLowerCase()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
         System.out.println(count);
	
	}
	

}
