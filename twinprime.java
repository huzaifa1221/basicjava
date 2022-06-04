import java.util.*;
class twinprime 
{
	public static void main(String args [])
	{
		int s,e,i,j,k;
		int c ,d ;

		Scanner in = new Scanner (System.in);
		System.out.println("enter a limit");
		 s = in.nextInt();
		 e = in.nextInt();
		for (i=s ; i<=e ; i++)
		{
			c=0;
                        d=0;
			k=i+2;
			for (j=1 ; j<=i ;j++)
			{
				if (i%j==0  )
				{
					c++;
				}
			}
			for (j=1 ; j<=k ;j++)
			{
				if(k%j==0)
				{
					d++;
				}
			}
		if (c==2 && d==2)
		{
	       		System.out.println(i + " " + k);
		}
		}
	}
}

		
