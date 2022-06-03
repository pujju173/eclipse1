package project1;

public class Calculator {
	public static Calculator calci;
	static int count=0;
	synchronized public  Calculator getCalculator()
	{
		if(count==0)
		{
			calci=new Calculator();
			
			count++;
			
		}
		return calci;
	}
	public void method()
	{
	try {
		Thread t1=Thread.currentThread();
		String name=t1.getName();
		for(int i=0;i<=5;i++)
		{
			System.out.println("i="+i+","+name);
		}
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	

}
