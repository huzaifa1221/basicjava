class swapping2
{
	public static void main(String args[])
	{
		int c =0;
		int d =0;
		String str="";
         str = "huzaifa";
	str = str.toUpperCase();
	char ch1 = str.charAt(0);
	char ch2= str.charAt(str.length()-1);
	if ( ch1=='A' || ch1== 'E' || ch1== 'I' || ch1=='O' || ch1=='U')
	{
		c =1;
	}
	if ( ch2=='A' ||  ch2=='E' || ch2== 'I' || ch2=='O' || ch2=='U')
	{
		d=1;
	}
	if (c==d)
	{
		System.out.println(" THE WORD STARTS AND ENDS WITH VOWEL");
	}
	else
	{
	System.out.println(" THE WORD does not STARTS AND ENDS WITH VOWEL");
	}
	}
}
