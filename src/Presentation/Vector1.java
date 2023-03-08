package Presentation;

import java.util.Iterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v=new Vector<String>();
		v.add("apple");
		v.add("Mango");
		v.add("orange");
		v.add("pineapple");
		v.add("Grape");
//		for(int i=0;i<5;i++)
//	{System.out.println("Vector:"+v.get(i));
////	System.out.println();
//	}//iteration
		v.remove("orange");
		Iterator<String> i = v.iterator();
	      while (i.hasNext()) {
	         System.out.println(i.next());
	      }
	      
	
	
		

	}

}
