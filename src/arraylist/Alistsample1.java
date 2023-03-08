package arraylist;
import java.util.*;
public class Alistsample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> l=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in) ;
		System.out.println("limit");
		int n=sc.nextInt();
//		int j=i;
		System.out.println("elements");
		for(int i=0;i<n;i++) {
			l.add(sc.nextInt());
			
		}
		System.out.println(l);
		for(int i=0;i<n;i++) {
			for(int j1=1;j1<n-1;j1++) {
				
				if(l.get(i)+l.get(j1)==25) {
					System.out.println(l.get(i)+"and"+l.get(j1));
				}
				
			}
			
		
			
			
			
		}
	
	
	
	
	
	
	
	}
	
	
	

}
