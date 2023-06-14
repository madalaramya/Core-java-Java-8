package com.weekend;

public class PrintTwo extends Thread {
	public static  int a=10;
	public int b=20;
	@Override
	public synchronized void  run() {
		
		for(int i=0;i<=10;i++)
		{
			int n=i*2;
			/*
			 * try { sleep(2000); } catch (InterruptedException e) { // TODO Auto-generated
			 * catch block e.printStackTrace(); }
			 */
			
			System.out.println("2nd table value"+n +"name"+Thread.currentThread().getPriority());
			
		}
		for(int i=0;i<=10;i++)
		{
			int n1=i*3;
			
			System.out.println("3rd table value" +n1+ "    thre name"+ Thread.currentThread().getPriority());

		}
	}
	public static boolean IsEven()
	{
	
	int k=a;	
	
		return false;
		
	}
	public static void main(String[] args) {
		
		
		
		
		
//		PrintTwo pw1=new PrintTwo();
//		PrintTwo pw2=new PrintTwo();
//		
//		
//		
//		pw1.setPriority(4);
//		pw2.setPriority(3);
//		
//		pw2.start();
//		pw1.start();
//		System.out.println();
	}
	

}
