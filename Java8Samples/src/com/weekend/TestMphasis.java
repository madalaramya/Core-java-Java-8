package com.weekend;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class TestMphasis {
	
	public static void main(String[] args) {
		
		String s1="Ramyeaiou";
		
		
		  for(int i=0;i<s1.length();i++) {
			  s1.charAt(i);
		  System.out.println(s1.charAt(i)); 
		  if(s1.charAt(i)=='a'||s1.charAt(i)=='e') 
		  {
		  System.out.println(s1.charAt(i)+"="+i); }
		  
		  }
		
		TestMphasis t1=new TestMphasis();
	
		
		
		
		
		
		
		
		
		
		
       List<Integer>li=Arrays.asList(17,99,78,67,101,4,9);
       List<Integer>li2= li.stream().sorted().collect(Collectors.toList());
       OptionalDouble li3=li.stream().mapToInt(Integer::intValue).average();

       OptionalInt li4=li.stream().mapToInt(Integer::intValue).min();
       Integer Li4=li.stream().reduce(0, Integer::sum);
       
       List<Integer>li5=Arrays.asList(2,3,9,15,11,4,8);
       List<Integer>li6=li5.stream().filter(x->x%2==0).map(x->x*2).collect(Collectors.toList());
        
       System.out.println("sdsssss"+li6);
       
       System.out.println(li3);
       System.out.println("hjjjjjjjjjjj"+li4);
       System.out.println(li2.get(li2.size()-1));
       System.out.println(li2.get(0));
       int temp=0;
       for (Integer integer : li) {
    	   
		if(temp==0)
		{
			temp=integer;
		}
		else if(temp>=integer)
		{
			temp=integer;
		}
	}
      //System.out.println(temp);  
	}
}

