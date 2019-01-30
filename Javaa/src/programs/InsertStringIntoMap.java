package programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InsertStringIntoMap {
	
	//define Hashmap
	HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	
	public void tc1()
	{
		String arr="abc";
		
		char[] charArr = arr.toCharArray();
		for(int i=0;i<charArr.length;i++)
		{
		  map.put(charArr[i],i);
		}
		 map.put('r',1);
		 map.put('m',1);
		//print
		 
		 for(Map.Entry entry:map.entrySet())
		 {
			 System.out.print( entry.getKey());
			 
		 }
	}
	public static void main(String[] args)
	{InsertStringIntoMap o = new InsertStringIntoMap();
		o.tc1();
	}
	

}
