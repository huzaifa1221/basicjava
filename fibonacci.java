import java.util.*;
class fibonacci 
{
	public static void main( String args[])
	{
		Scanner in = new Scanner (System.in);
		int a=0;
		int b=1;
		System.out.println("enter length of series");
		int n = in.nextInt();
		int arr []= new int[n];
		arr[a] = 0;
	        arr[b] = 1;
                int c , i;
             for (i=2 ; i<n ; i++)
	     {
		     c=arr[a]+arr[b];
		     arr[i]=c;
		     a=b;
		     b=i;
	     }
	     for (i=0 ; i<n ; i++)
	     {
		     System.out.print(arr[i]+" ");
	     }
	}
}














		
                               








		
