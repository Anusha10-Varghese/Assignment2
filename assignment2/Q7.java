package assignment2;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
		System.out.print("Input data: ");
		int num=s.nextInt();
		for(int i=1;i<num;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}

	}

}
