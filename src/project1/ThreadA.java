package project1;

public class ThreadA extends Thread{
	Calculator cr;
	public ThreadA(Calculator cr) {
		super();
		this.cr = cr;
	}
	public void run()
	{
		cr=cr.getCalculator();
		System.out.println(cr);
	}

}
