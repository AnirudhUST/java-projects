package java8projects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Comp> ls=new ArrayList<Comp>();
		
		ls.add(new Comp(1, "abc", 50000));
		ls.add(new Comp(2, "aec", 51000));
		ls.add(new Comp(3, "arc", 70000));
		ls.add(new Comp(4, "atc", 150000));
		ls.add(new Comp(5, "auc", 40000));
		ls.add(new Comp(6, "aic", 120000));
 
//		System.out.println(ls);
//		for(int i=0;i<ls.size();i++) {
//			System.out.println(ls.get(i));
//		}
	
		
//		List<Double,String> lsd=ls.stream().filter(t->t.getSalary() >=50000 && t.getSalary()<=100000).map(t->t.getSalary()+(0.1*t.getSalary())).collect(Collectors.toList()); 
//		
		
		
		
		
		
//		lsd=ls.stream().filter(W->W.salary >=100000).map(W->W.getSalary()+(0.05*W.getSalary())).collect(Collectors.toList());
//		System.out.println(lsd);
//		for(int i=0;i<lsd.size();i++) {
//			System.out.println(lsd.get(i));
//		}
	
	List<Comp> emp=ls.stream()
			       .filter(e->e.getSalary()<200000)
			       .sorted(Comparator.comparing(Comp::getSalary)
			       .reversed())
			       .peek(e->{
			    	   double salary=e.getSalary();
			    	   if(salary>100000) {e.setSalary(salary*1.05);
			       }
			    	   else if(salary>50000) {
			    		   e.setSalary(salary*1.1);  
			    	   }
			       
			       }).collect(Collectors.toList());
	
	
//	for(int i=0;i<emp.size();i++) {
//		System.out.println(emp.get(i));
//	}
	
	
	System.out.println(emp);
	}

}
