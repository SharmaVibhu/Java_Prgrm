public class NullPointer {  
	  public static void main (String args[])
	  {  
		  String s=null;
		 
	   try{   
		
		 System.out.print(s.length());
	   }
	   catch(NullPointerException    e)
	   {
		  e.printStackTrace();
	   }
	}  
  
}