package com.weekend;

import java.util.TreeSet;

public class FloorOops  {
	
	public static void main(String[] args) {
		TreeSet<String>ts=new TreeSet();
	    ts.add("acd");
	    ts.add("aaa");
	    ts.add("bas");
	    ts.add("cac");
	    ts.add("acd");
	    System.out.println(ts.floor("abc")+ts.ceiling("aca")+ts.higher("aab"));//aaa 11 12//aaacacacd
	                                                                                       // aaaacdacd
    
    	
    	
    	
    	
	
	}

	
	
	
}
