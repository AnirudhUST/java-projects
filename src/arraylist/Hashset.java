package arraylist;
import java.io.*;
import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Integer> a=new HashSet<Integer>();
		HashSet <Integer> b=new HashSet<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("limit");
		
		int i=sc.nextInt();
		int n=i;
		int j=i;
		System.out.println("h1=");
		while(i>0) {
			
			a.add(sc.nextInt());
			i--;
			
		}
		System.out.println("h2=");
		while(j>0) {
			
			b.add(sc.nextInt());
			j--;
			
		}
//		a.retainAll(b);
//		System.out.println("common="+a);
		
		Iterator i1=a.iterator();
		for(Integer l:a) {
			
			if(b.contains(l)) {
				System.out.println(l);
			}
		}

			
		}

		
		
		 
		
	}


 