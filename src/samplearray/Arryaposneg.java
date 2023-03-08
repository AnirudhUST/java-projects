package samplearray;

public class Arryaposneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arrya[]={4,-4,6,8,-9,0,4,-7,56};
		int poscount=0,negcount=0;
		for(int i=0;i<arrya.length;i++) {
			
			if(arrya[i]>0) {
				poscount++;
			}
			else
				if(arrya[i]<0)	
			       negcount++;
		}
		System.out.println("positive count="+poscount+"\n"+"Negative Count ="+negcount);
	}
	
	

}
