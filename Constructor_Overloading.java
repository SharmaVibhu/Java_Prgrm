 import java.io.*; 

class Constructor 
{ 
	Constructor(String name) 
	{ 
		System.out.println("Constructor with one " + 
					"argument - String : " + name); 
	} 

	Constructor(String name, int age) 
	{ 

		System.out.println("Constructor with two arguments : " + 
				" String and Integer : " + name + " "+ age); 

	} 

	Constructor(long id) 
	{ 
		System.out.println("Constructor with one argument : " + "Long : " + id); 
	} 
} 

class Constructor_Overloading
{ 
	public static void main(String[] args) 
	{ 
		
		Constructor con1 = new Constructor("Shikhar"); 

		Constructor con2 = new Constructor("Dharmesh", 26); 

		Constructor con3 = new Constructor(325614567); 
	} 
} 
