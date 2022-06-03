package project1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Program2 {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 4, 1, 6, 2, 1, 8, 9 };
		/*Map<Integer, Integer> m1 = new HashMap();
		for (Integer o1 : arr) {
			if (m1.containsKey(o1)) {
				m1.put(o1, (m1.get(o1) + 1));
			} else {
				m1.put(o1, 1);
			}
		}
		Set<Integer> hs1 = m1.keySet();
		for (Integer o1 : hs1) {
			if (m1.get(o1) < 2) {
				System.out.println(o1 );
			}
		}

		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=0;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
			System.out.print(arr[i]+",");
			}
		}*/
		/*HashSet hs1=new HashSet();
		for(Integer o1:arr)
		{
			hs1.add(o1);
		}
		System.out.println(hs1);*/
		Calculator c1=new Calculator();
		ThreadA t1=new ThreadA(c1); 
		t1.start();
		ThreadA t2=new ThreadA(c1); 
		t2.start();
		
	}
		
		

}
