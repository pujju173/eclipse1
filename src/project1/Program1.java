package project1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program1 {
	public static void main(String[] args) {
		/*String str="sangeeta";
		String[] arr=str.split("");
		str="";
		for(int i=arr.length-1;i>=0;i--)
		{
			str=str+arr[i];
		}
		System.out.println(str);*/
		
		Map<String,Integer> m1=new HashMap();
		m1.put("apple",1);
		m1.put("boy",2);
		m1.put("cat",3);
		Set<String> hs1=m1.keySet();
		for(String o1:hs1)
		{
			System.out.println(o1+","
					+m1.get(o1));
		}
	}

}
