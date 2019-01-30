package programs;

import java.util.ArrayList;
import java.util.Iterator;

public class InsertStringIntoList {
	
	//define arraylist
	ArrayList<Character> list = new ArrayList<Character>();
	
	public void tc1()
	{
		String arr="abc";
		
		char[] charArr = arr.toCharArray();
		for(int i=0;i<charArr.length;i++)
		{
		  list.add(charArr[i]);
		}
		list.add('r');
		list.add('m');
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next());}
	
	}
	public static void main(String[] args)
	{InsertStringIntoList o = new InsertStringIntoList();
		o.tc1();
	}
	

}
