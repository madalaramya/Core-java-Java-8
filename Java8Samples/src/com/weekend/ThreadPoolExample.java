package com.weekend;

import java.text.CompactNumberFormat;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadPoolExample {
	public static void main(String[] args) {

		ConcurrentHashMap<Integer,String> hm=new ConcurrentHashMap<>();
		hm.put(1, "Ramya");
		hm.put(2, "Harshi");
		hm.put(3, "Rakesh");
		hm.put(4, "Ravali");
		
		Iterator<Integer>iterator=hm.keySet().iterator();
		while(iterator.hasNext())
		{
			hm.put(5,"Shilpa");
			 Integer key = iterator.next();
	 System.out.println(hm.get(key));
			 
		}
	System.out.println(hm.entrySet());
	
	
	}

}
