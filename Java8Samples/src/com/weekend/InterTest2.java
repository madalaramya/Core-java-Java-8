package com.weekend;

public interface InterTest2 {
	
	void m1();
	
	
	
   default void m2()
  {
	 System.out.println("in m2 in intertest2"); 
  }
   default void m3()
   {
 	 System.out.println("in m2 in intertest2"); 
   }

}
