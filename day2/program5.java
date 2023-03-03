package day2;

import java.util.Scanner;

public class program5 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int total =100;
		System.out.println("enter marks in subject1:");
		int sub1=sc.nextInt();
		System.out.println("enter marks in subject2:");
		int sub2=sc.nextInt();
		System.out.println("enter marks in subject3:");
		int sub3=sc.nextInt();
		
		int res_sub1=(sub1*100)/total;
		int res_sub2=(sub2*100)/total;
		int res_sub3=(sub3*100)/total;

		
		System.out.println(res_sub1+"\n"+res_sub2+"\n"+res_sub3+"\n");
		int avr=(res_sub1+res_sub2+res_sub3)/3;
		
         System.out.println(avr);
         if(res_sub1>33&&res_sub2>33&&res_sub3>33&&avr>40)
         {
        	System.out.println("You passed in exam"); 
         } 
         else{
        	 System.out.println("You failed in exam");
        	 
         }

	}

}
