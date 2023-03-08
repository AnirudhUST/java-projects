package samplearray;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner a=new Scanner(System.in);
		
		System.out.println("Enter No of elements:");
		
		int ch=a.nextInt();
		if (ch>0) {
		int arr[]=new int[ch];
		int arr1[]=new int[ch];
		System.out.println("enter elemnts:");
		for(int i=0;i<ch;i++) {
			
			arr[i]=a.nextInt();
		}
		int sum=0;
		for(int j=0;j<ch;j++) {
			
			sum=sum+arr[j];
			arr1[j]=sum;
//			System.out.println(sum);
			
			
		}
		System.out.println("Cumulative Array:");
		for(int i=0;i<ch;i++) {
		System.out.print(arr1[i]+" ");}}
		else
			System.out.println("invalid");}}

	


