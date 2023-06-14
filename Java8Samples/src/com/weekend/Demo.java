package com.weekend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Demo
	
	{
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("banana"); 
		list.add("apple"); 
		Iterator<String> itr = list.iterator();
		Collections.sort(list);
		while (itr.hasNext())
			
		{
			
			System.out.print(itr.next() + " ");
			}

	}
		
		}


