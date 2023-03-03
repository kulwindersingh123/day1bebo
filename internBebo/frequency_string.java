package internBebo;

public class frequency_string {

	public static void main(String[] args) 
	{
		int num=12344553;
		int c=1;
		int i;
		
		String str=Integer.toString(num);
		char ch[]=str.toCharArray();
		for( i=0;i<str.length()-1;i++) 
		{
			for(int j=i+1;j<str.length()-1;j++) 
			{
				if(ch[i]==ch[j]) 
				{
					c++;
				}
				
			}
			
			
			System.out.println("fre of"+ch[i]+"is "+c );
			
			
		}
		

	}

}
