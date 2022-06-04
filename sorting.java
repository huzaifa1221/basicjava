
class sorting
{
	public static void main (String args [])
	{
		int i;
		char ch;
		String wrd = "huzaifaisgood";
		wrd = wrd.toUpperCase();
		String sortwrd= "";
	  int len = wrd.length();
	       	for (i=65 ; i<=90 ; i++)
		{
			ch = (char)i;
			for (i=0 ; i<len ; i++)
			{
				if(ch == wrd.charAt(i))
				{

		              sortwrd= sortwrd+ ch;
				}
			}
		}
		System.out.println( sortwrd );
	}
}
