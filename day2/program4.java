package day2;

import java.util.Scanner;

public class program4 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the attendance in classes:");
		int att=sc.nextInt();
		System.out.println("Enter the number of classes held:");
		int  num_class=sc.nextInt();
		
		int per=(att*100)/num_class;
		System.out.println("percentage is:"+per);
		
		if(per>75) 
		{
			System.out.println("You can enter in exam");
			
		}
		else
		{
			System.out.println("You can not enter in exam");
			
		}
		

	}

}
