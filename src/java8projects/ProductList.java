package java8projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Products> s1=new ArrayList<Products>();
		Products a=new Products(1, "agk", 10000);
		s1.add(a);
		s1.add(new Products(2,"ack",12000));
		s1.add(new Products(3,"ask",8000));
		s1.add(new Products(4,"adk",9000));
		s1.add(new Products(5,"alk",10000));
	  List<String> productPricE =s1.stream().filter(p -> p.getPrice() >= 10000) .map(p->p.getName()).collect(Collectors.toList()); 
	  
	  System.out.println(productPricE);
	  s1.stream().filter(p -> p.getPrice() >= 10000).forEach(P->System.out.println(P.getName()+" "+P.getPrice()));
	}

}
