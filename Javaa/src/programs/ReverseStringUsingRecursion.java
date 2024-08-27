package programs;

import java.util.ArrayList;
import java.util.Iterator;

public class ReverseStringUsingRecursion {
	
	//define arraylist
	//ArrayList<Character> list = new ArrayList<Character>();
	String sum="";
	int last,prev;
	
	public String rev(String str)
	{
		last=str.length()-1;
		if(str.isEmpty())
		{
			sum=sum;
		}else {
			
			sum=sum +str.charAt(last);
			rev(str.substring(0, last));
		}
		return sum;
	}
	
	
	public static void main(String[] args)
	{ReverseStringUsingRecursion o = new ReverseStringUsingRecursion();
		String s=o.rev("123456789");
		System.out.println(s);
	}
	

}
