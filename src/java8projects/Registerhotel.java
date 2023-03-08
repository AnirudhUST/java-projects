/**
 * 
 */
package java8projects;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;
/**
 * @author Administrator
 *
 */
public class Registerhotel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Hotelnames> names=new ArrayList<>();
		names.add(new Hotelnames(100,"sarasu",700));
		names.add(new Hotelnames(101,"sukunan oyo",300));
		names.add(new Hotelnames(102,"holiday",600));
		names.add(new Hotelnames(104,"oyokazhakku",200));
		names.add(new Hotelnames(103,"oyokochi",800));
		Scanner sc=new Scanner(System.in);
		System.out.println("ente min and max value");
		double min=sc.nextDouble();
		double max=sc.nextDouble();
		List<Hotelnames> hlist=names.stream().filter(t->min< t.getPrice() || t.getPrice() > max)
	    		   .collect(Collectors.toList());
		System.out.println(hlist);//print hotel list
		System.out.println("select the user id from previous list:");
		int lid=sc.nextInt();
		List<Hotelnames> newlist=hlist.stream().filter(t->t.getId()==lid)
	    		   .collect(Collectors.toList());
		System.out.println(newlist+"is selected");
		
		
		System.out.println("PLZZ REGISTER ");
		System.out.println("Name=&&phone no");
		List<listelement> nab=new ArrayList<>();
		nab.add(new listelement(sc.next(), sc.next(),newlist));
		
		
//		String cname=sc.next();
//		System.out.println("phone no.");
//		String phno=sc.next();
		System.out.println("registration is successful"+nab);
		

	}

}
