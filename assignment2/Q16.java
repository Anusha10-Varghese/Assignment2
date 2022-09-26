package assignment2;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner str=new Scanner(System.in);
		System.out.print("Input a number:");
		int n=str.nextInt();
		double result=0.0;
		while(n>0)
		{
			result=result+(double)1/n;
			n--;
		}
		System.out.print("Harmonic series is: "+result);

	}
	

}
