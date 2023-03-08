package java8projects;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filtercity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s1=Arrays.asList("tvm","thoppumpady","onakkoor","thankjavoor","kottayam");
		List<String> city=s1.stream().filter(t->t.startsWith("t")).collect(Collectors.toList());
		System.out.println(city);
		
		

	}

}
