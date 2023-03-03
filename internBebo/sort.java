package internBebo;

import java.util.Arrays;

public class sort
{
//	public static void main(String[] args)
//	{
//		int arr[] =new int[] {1,5,2,3,8,8,5};
////		int srr[]=new int[arr.length];
//		int min=1;
//		for(int i=0;i<arr.length;i++) 
//		{
//			if(min>i)
//			{
//				min=i;
//				System.out.println(min);
//			}
//		}
//
//	}	
//}
	
public static void main(String[] args) {
	int a [] =new int[] {1,5,2,3,8,8,5};
	int min=0;

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
}
}