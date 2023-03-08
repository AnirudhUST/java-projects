package arraylist;
import java.util.LinkedList;
public class Likedlist {
	  public static void main(String[] args) {
	    LinkedList<String> languages = new LinkedList<>();

	    // add elements in LinkedList
	    languages.add("Java");
	    languages.add("Python");
	    languages.add("Kotlin");
	    languages.add("JavaScript");
	    
//	    languages.add("andikuttan");
	    System.out.println("LinkedList: " + languages);

	   int mid=languages.size()/2;
//	    String str = languages.remove(mid);
//	    System.out.println("Removed Element: " + str);
	   	
	    int mid1=(languages.size()-1)/2;
	    
	    
	    System.out.println("Updated LinkedList: " + languages);
	    if(languages.size()%2!=0)
	    	System.out.println("mid element:"+languages.get(mid1));
	    else
//	    	mid=mid1-1;
	    { System.out.println("mid element:"+languages.get(mid1+1)+" "+languages.get(mid1));
	  }}

	}
