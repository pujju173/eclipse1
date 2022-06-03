package project1;

public class Machine {
	private static Machine machine=null;
	String str;
	private Machine()
	{
		str="extra";
	}

	synchronized public static Machine getInstance()
	{
		if(machine==null)
		{
		machine=new Machine();
		}
		return machine;
	}

}
