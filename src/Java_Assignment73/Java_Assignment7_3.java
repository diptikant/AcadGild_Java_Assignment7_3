package Java_Assignment73;
/*
 * Write a program in java to show how the capacity is changing in StringBuffer or in StringBuilder if we append the string.
 */


public class Java_Assignment7_3 
{

	public static void main(String[] args) 
	{
		
		System.out.println("StringBuffer Capacity Details:");
		StringBuffer sb=new StringBuffer();  //initializing the StringBuffer class
		System.out.println("Default: "+sb.capacity());//default 16  
		sb.append("Hello");  
		System.out.println("After appending within 16 characters: "+sb.capacity());//now 16  
		sb.append("java is my favourite language");  
		System.out.println("After appending more than 16 characters: "+sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		sb.ensureCapacity(10);//now no change  
		System.out.println("After trying to reduce capacity to 10, No change in capacity: "+sb.capacity());//now 34  
		sb.ensureCapacity(50);//now (34*2)+2  
		System.out.println("After trying to increase capacity to 50,capacity changed to now (34*2)+2: "+sb.capacity());//now 70
		
		
		StringBuilder sbl = new StringBuilder(); //initializing the StringBuilder class
		System.out.println("\nStringBuilder  Capacity Details:"); 
		System.out.println("Default: "+sbl.capacity());
		sbl.append("Hello");  
		System.out.println("After appending within 16 characters: "+sbl.capacity());//now 16  
		sbl.append("java is my favourite language"); 
		System.out.println("After appending more than 16 characters: "+sbl.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
		sbl.ensureCapacity(10);//now no change  
		System.out.println("After trying to reduce capacity to 10, No change in capacity: "+sbl.capacity());//now 34  
		sbl.ensureCapacity(50);//now (34*2)+2  
		System.out.println("After trying to increase capacity to 50,capacity changed to now (34*2)+2: "+sbl.capacity());//now 70  
		

	}

}
