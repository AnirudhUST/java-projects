package samplejava;

public class Pal {

	public static void main(String[] args) {
		
		String s[]= {"alice","bob","charlie","david","eva"};
		int m[][]= {{80,75,90},{85,70,95},{90,80,85},{75,85,90},{95,90,80}};
		int total[]=new int[5];
		int count=0;
		int sum=0;
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<3;j++) {
			
			      sum=sum+m[i][j];
			      }
			
			total[i]=sum;
					  
		}
			for(int i=0;i<total.length;i++)
			   {System.out.print(total[i]+"\t");}
		
		//Bubble sort
		int temp=0;
		   for(int i=0; i < s.length; i++){  
               for(int j=1; j < (s.length-i); j++){  
                        if(total[j-1] > total[j]){  
                               //swap elements  
                               temp = total[j-1];  
                               total[j-1] = total[j];  
                               total[j] = temp;  
                       }  
                            
               }  
       }  
		   for(int i=0;i<total.length;i++)
//			   {System.out.print("\n");
		         {System.out.print(total[i]+"\t");}
			
		
		   for(int i=0;i<s.length;i++){
			   
//			   if()
			   
		   }
		   
		   
		   
			
		}
			
		

	}


