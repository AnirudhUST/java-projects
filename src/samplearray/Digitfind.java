package samplearray;
import java.util.Scanner;

public class Digitfind {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int digit=s.nextInt();
		int n1=digit;
		int r,mod=0;
		int  flag1 =0,flag3 =0,flag2 =0;
		while(digit>0) {
			r=digit%10;
			digit=digit/10;
			if(r==3) {
				 flag1=1;
			}
			else
				if(r==6) {
					 flag2=1;
				}
				else
					if(r==9) {
					 flag3=1;
				}
//			{ int r1= digit%10;
//				if(r1==3||r1==6||r1==9) {
//					flag=1;
//				}
		
		}if(flag1==1&&flag2==1&&flag3==1) System.out.println("lucyno");
			else System.out.println("not");
			
			

	

}}
