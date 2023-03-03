package internBebo;

public class swapfirstandlast 
{
	public static void main(String[] args) {
		
	
	int num=829;
	
	String str=Integer.toString(num);
	char ch[]=str.toCharArray();
	
	char t=ch[0];
	ch[0]=ch[str.length()-1];
	ch[str.length()-1]=t;
	for(int i=0;i<str.length();i++) 
	{
		System.out.print(ch[i]);
	}
}
}
