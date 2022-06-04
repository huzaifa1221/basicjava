import java.util.*;
class swapping
{
	public static void main (String args [])
	{
		int i;
		char ch;
		String wrd = "huzaifaisgood";
		String swapwrd= "";
	  int len = wrd.length();
	       	for (i=1 ; i<len-1 ; i++)
		{
			ch = wrd.charAt(i);
	swapwrd = swapwrd+ch;
		}
	System.out.println(wrd.charAt(len-1)+swapwrd+wrd.charAt(0));
	}
}

