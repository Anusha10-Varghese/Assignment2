package assignment2;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input data: ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=2;i<=n;i++)
		{
			int count=0;
				for(int j=1;j<=i;j++)
				{
					if(i%j==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					System.out.print(i+ " ");
				}
				
			}
		
		

	}

}
