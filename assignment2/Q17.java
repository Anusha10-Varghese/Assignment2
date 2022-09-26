package assignment2;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		int oddsum=0,evensum=0,oddcount=0,evencount=0;
		while(n>0)
		{
			if(n%2==0)
			{
				evensum=evensum+n;
				evencount++;
			}
			else
			{
				oddcount++;
				oddsum=oddsum+n;
			}
			n--;
		}
		int eAvg,oAvg;
		eAvg=evensum/evencount;
		oAvg=oddsum/oddcount;
        System.out.println("Average Even consecutive number is "+eAvg );
        System.out.println("Average Odd consecutive number is "+oAvg );
	}
	

}
