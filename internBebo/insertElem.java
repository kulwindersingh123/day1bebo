package internBebo;



public class insertElem 
{
	public static void main(String[] args)
	{
		int len = 7;
		
		int arr[]= new int[len+1];
		
		for(int i=0;i<arr.length-1;i++) {
			arr[i] = 8;
		}
		int el = 3;
		arr[arr.length-1] = el;
		
	
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]);
			
		}
		
		
		
//		int arr[]= new int[] {1,2,3,4,4,5};
//		int srr[]=new int[arr.length+1];
//		int ele=4;
//		for(int i=0;i<arr.length;i++)
//		{
//		srr[i]=arr[i];	
//		}
//		srr[srr.length-1]=ele;
//		for(int i=0;i<srr.length;i++)
//		{
//		System.out.println(srr[i]);
//		}
		
		
		
		
		
		
	}

}
