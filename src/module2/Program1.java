package module2;

public class Program1 {
	public static void main(String[] args) {
		int space=3;
		int rows=4;
		int cond1=1;
		int mid=1;
		
		for(int i=0;i<=rows;i++)
		{
		
			
			for(int j=i+1;j<=cond1;j++)
			{
				System.out.print(" ");
			
				if(j>mid)
				{
					System.out.print(i--);
				}
				else
				{
					System.out.print(i);
				}
			}
			cond1=cond1+2;
			space--;
			mid=cond1/2;
			
			
			System.out.println();
		}
		
	
	}

}
