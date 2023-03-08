package java8projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Customer> l1=new ArrayList<>();
       l1.add(new Customer(1,"Ani", "9961964851", "agk@gmail.com","TVM" ));
       l1.add(new Customer(2,"AnU", "9961964441", "aMk@gmail.com","YVM" ));
       l1.add(new Customer(3,"Ami", "9341964851", "ajk@gmail.com","TJM" ));
       l1.add(new Customer(4,"Appu", "9461964851", "ggk@gmail.com","LVM" ));
       l1.add(new Customer(5,"Ambi", "9661964851", "bgk@gmail.com","SVM" ));
       l1.add(new Customer(6,"ADi", "9451964851", "ag@gmail.com","TmM" ));
       System.out.println("enter no");
       Scanner s=new Scanner(System.in);
       int i=s.nextInt();
       List<Customer> l2=new ArrayList<>();
       List<Customer> emp=l1.stream().filter(t->t.getR_id()==i)
    		   .collect(Collectors.toList());
       System.out.println(emp);
       }
       
    
   	
	}


