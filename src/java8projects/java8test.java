package java8projects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class java8test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
		s = s.replaceAll("[-+.^?,!;]", "");
		List<String> sList = new ArrayList<String>(Arrays.asList(s.split(" ")));
		System.out.println(sList);
		System.out.println("SIZE="+sList.size());
		 List<String> val =sList.stream().map(n->n.toLowerCase()).distinct().collect(Collectors.toList());
		 System.out.println(val);
		 System.out.println("no of unique ="+val.size());
		 val.sort(null);
		 for(int i=0;i<val.size();i++){
			    System.out.println(val.get(i));
			} 
	}

}
