package assignment2;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0;
		System.out.print("Enter a number: ");
		Scanner num=new Scanner(System.in);
		int n=num.nextInt();
		int temp=n;
		while(n>0)
		{
			int rev=n%10;
			n=n/10;
			s=s*10+rev;
		}
		if(temp==s)
		{
			System.out.println("The number is a palidrome");
		}
		else
		{
			System.out.println("The number is not a palidrome");
		}

	}

}
