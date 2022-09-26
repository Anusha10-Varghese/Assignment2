package assignment2;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=153,sum=0;
     int temp=n;
     while(n>0)
     {
    	 int rev=n%10;
    	 n=n/10;
    	 sum=sum+(rev*rev*rev);
     }
     if(temp==sum)
     {
    	 System.out.println(sum+" is a Armstrong number" );
     }
     else 
     {
    	 System.out.println(sum+" is not a Armstrong number");
     }
	}

}
