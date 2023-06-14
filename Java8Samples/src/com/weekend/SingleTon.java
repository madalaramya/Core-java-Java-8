package com.weekend;

public class SingleTon{
private static SingleTon stn;
int a=10;
	private SingleTon() 
	{
		
	}
	public static SingleTon getInstance()
	{
		if(stn==null)
		{ 
			stn=new SingleTon();
					
		}
		return stn;
	}

public static void main(String[] args) {
	
	System.out.println(SingleTon.getInstance());
	
	
	

	
	
}

}
