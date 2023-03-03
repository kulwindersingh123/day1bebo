package day2;

import java.util.Scanner;

public class program2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cost");
		int cost=sc.nextInt();
		
		if(cost>1000) 
		{
			cost=cost-(10*1000)/100;
		}
		System.out.println("The discounted cost"+cost);
		

	}

}
