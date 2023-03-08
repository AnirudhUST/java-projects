package java8ustfood;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TestDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<FoodDetails> list1=new ArrayList<>() ;
		list1.add(new FoodDetails("veg meals",80 ));
		list1.add(new FoodDetails("fish curry meals",120 ));
		list1.add(new FoodDetails("chapati fish curry",110 ));
		list1.add(new FoodDetails("chapati c curry",120 ));
		list1.add(new FoodDetails("f rice",75 ));
		list1.add(new FoodDetails("c frice",120 ));
		
		System.out.println("Menu::"+list1);
	
		System.out.println("What You Want...");
		Scanner sc=new Scanner(System.in);
		String ch=sc.nextLine();
		
		
		ArrayList<FoodDetails> F1=(ArrayList<FoodDetails>) list1.stream().filter(t->t.getFname().equals(ch)).collect(Collectors.toList());
		System.out.println(F1+" is Selected");
		List<PersonDetails> list2=new ArrayList<>() ;
		System.out.println("Enter Your Details:");
		System.out.println("Uid:"+"and"+"Name:");
		
		list2.add(new PersonDetails(sc.nextInt(),sc.next(),F1)) ;
		
		System.out.println("Your order is place with Details"+list2);
		System.out.println("Do you want to update...y/n");
		System.out.println("1.remove 2.update 3.ADD ANOTHER ");
		int select=sc.nextInt();
		
		switch (select) {
		case 1: {
			   
			   System.out.println(F1+"is remove from your list");
			   F1.remove("veg meals");
			   System.out.println( F1);
			   break;
		}
		case 2: {
			   
			   System.out.println("What you want:"+list1);
			   F1.remove(ch);
			   String fo=sc.nextLine();
			   
			    F1=(ArrayList<FoodDetails>) list1.stream().filter(t->t.getFname().equals(fo)).collect(Collectors.toList());

			   System.out.println("Updated List:"+F1);
			   break;
		}
		case 3: {
//			System.out.println("Updated List:"+F1);
			   System.out.println("do you want add"+list1);
			   String ch1=sc.next();
			   List<FoodDetails> F2=list1.stream().filter(t->t.getFname().equals(ch1)).collect(Collectors.toList());
			   System.out.println("Updated List:"+ F2);
			   break;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + select);
		}
		
		
		
		

	}

	private static void removeAll(List<FoodDetails> f1) {
		// TODO Auto-generated method stub
		
	}

}
