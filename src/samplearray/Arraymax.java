/**
 * 
 */
package samplearray;

/**
 * @author Administrator
 *
 */
public class Arraymax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array= {5,3,8,1,7,2};
		int max=array[0];
		
		for(int i =1;i<array.length;i++){
			
			if(max<array[i]) {
				max=array[i];
				 
				
			}
//			System.out.println(max);
		}	System.out.println(max);

	}

}
