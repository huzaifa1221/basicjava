import java.util.*;
class pallindrome 
{
	public static void main (String args [])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a number ");
		int n = sc.nextInt();
		int num =n;
		int rem ;
		int sum =0;
		while(n>0)
		{
                  rem = n%10;
		  sum = sum * 10 +rem ;
		  n = n/10;
		}
		if (num == sum )
		{
		                System.out.println("number is a pallindrome ");
		}
		if (num!= sum )
		{
			                                System.out.println("number is not a pallindrome ");
                      }
	}
}




