package arraylist;
import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>();
//		list.add("AGK");
//		list.add("ABK");
//		list.add("AJK");
//		list.add("AK");
//		list.add("AKG");
//		System.out.println(list);
//		String list1=list.get(0);
//		System.out.println(list1);
//		he
		int i=sc.nextInt();
		
		while(i>0) {
			
			list.add(sc.next());
			i--;
			
		}
		System.out.println(list.get(1));
	
	list.sort(null);
	System.out.println(list);
	Iterator i1=list.iterator();
	i=0;
	while(i1.hasNext()) {
		System.out.println(i1.next());
		
	}
	}	
	

}