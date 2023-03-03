package day2;

import java.util.Scanner;

public class program3 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary:");
		int salary=sc.nextInt();
		System.out.println("Enter the experiance:");
		int exp=sc.nextInt();
		if(exp>5) 
		{
			salary=salary+(5*salary)/100;
		}
        System.out.println("bonused salary is: \n"+salary);
	}

}
