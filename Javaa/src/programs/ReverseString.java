package programs;

import java.util.ArrayList;
import java.util.Iterator;

public class ReverseString {
	
	//define arraylist
	//ArrayList<Character> list = new ArrayList<Character>();
	
	public void tc1()
	{
		String arr="abc";
		String sum="";
		
		for(int i=arr.length()-1;i>=0;i--)
		{
		  sum=sum+arr.charAt(i);
		}
		
			System.out.print(sum);
	
	}
	public static void main(String[] args)
	{ReverseString o = new ReverseString();
		o.tc1();
	}
	

}
