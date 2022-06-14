import java .util.*;
class factorial
{
	public static void main(String args [])
	{
		int i ;
		Scanner in = new Scanner (System.in);
		System.out.println("enter a number");
		int n = in.nextInt();
		                long fact =1;

		for (i=1; i<=n ; i++)
		{
                   fact =fact *i;
		}
	       System.out.println(fact);
	}
}

