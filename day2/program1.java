package day2;
import java.util.Scanner;

public class program1 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the length");
		int length= sc.nextInt();
		System.out.println("enter the breadth");
		int breadth = sc.nextInt();
		if(length==breadth) 
		{
			System.out.println("Its a square");
		}
		else 
		{
			System.out.println("Its not a square");
		}
		
		

	}

}
