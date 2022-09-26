package assignment2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number:");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num>0)
		{
			System.out.println("The number is positive");
		}
		else if(num<0)
		{
			System.out.println("The number is negative");
		}
		else
		{
			System.out.println("The number is zero");
		}
	}

}
