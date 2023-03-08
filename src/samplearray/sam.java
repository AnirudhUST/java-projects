package samplearray;

public class sam {

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
	
	
	    int pos[]=new int[poscount];
	    int neg[]=new int[negcount];
//	    int j=0;
	    
       for(int i=0;i<arrya.length;i++) {
    	   for(int j=0;j<poscount;j++) {
		    	if(arrya[i]>0) {
//		    		for(int j=0;j<poscount;j++)
				   pos[j]=arrya[i];
				  
			}
			else
				for(int j1=0;j1<negcount;j1++)
				{if(arrya[i]<0)	
					
				{
					
					neg[j1]=arrya[i];
		    	   }
		} }

       for(int j=0;j<poscount;j++)
       {System.out.println("positive:"+pos[j]);}
       for(int j=0;j<negcount;j++)
       { 
    	   System.out.println("negative"+neg[j]);}

	}

}}
