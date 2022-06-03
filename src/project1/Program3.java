package project1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Program3 {
	public static void main(String[] args) {
		ArrayList<String> al1= new ArrayList();
		al1.add("apple");
		al1.add("pple");
		al1.add("axe");
		al1.add("boy");
		al1.add("so");
		ArrayList<String> al3=new ArrayList();
		for(String s1:al1)
		{
			if((s1.charAt(0))=='a')
			{
				al3.add(s1);
			}
		}
		System.out.println(al3);
		
		List<String> al2 =al1.stream().filter(p->p.startsWith("a")).map(p->p).collect(Collectors.toList());
		
	for(String s1:al2)
	{
		System.out.println(s1);
	}
	Machine m1=Machine.getInstance();
	System.out.println(m1);
	Machine m2=Machine.getInstance();
	System.out.println(m2);
		
		
			System.out.println(m2);
			Machine m=Machine.getInstance();
			System.out.println(m);
		
	}

}
