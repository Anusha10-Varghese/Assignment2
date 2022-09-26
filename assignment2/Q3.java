package assignment2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year=s.nextInt();
		if(((year%4==0) && (year%100!=0)) || (year%400==0))
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Common Year");
		}

	}

}
