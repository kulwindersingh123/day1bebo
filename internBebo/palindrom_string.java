package internBebo;

public class palindrom_string {

	public static void main(String[] args)
	{
      String str="ey0";
      char ch[]=str.toCharArray();
      String ntr="";
      for(int i=str.length()-1;i>=0;i--) 
      {
    	 
    	 ntr=ntr+ch[i];
    	 
    	  
      }
      System.out.print(ntr+"\n");
      if(str.equals(ntr)) 
      {
    	  System.out.print("its a palindrom string");
      }
      else {
    	  System.out.print("not a palindrom string");
      }

	}

}
