package internBebo;

public class toggle {

	public static void main(String[] args) 
	{
		String str="my Name";
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++) {
		if(ch[i]>='a'&&ch[i]<='z') 
		{
			ch[i]=(char)((int)ch[i]-32);
			
		}
		else if(ch[i]>='A'&&ch[i]<='Z') 
		{
			ch[i]=(char)((int)ch[i]+32);
	
		}
		}
		for(int i=0;i<str.length();i++) 
		{
			System.out.print(ch[i]);
		}
	}

}
