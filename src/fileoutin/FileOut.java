  
package fileoutin;
import java.io.FileInputStream;
public class FileOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{    
	            FileInputStream fin=new FileInputStream("D:\\New.txt");    
	            int i=fin.read();  
	            System.out.print((char)i);    
	  
	            fin.close();    
	          }catch(Exception e){System.out.println(e);}

	}

}
