class anagram 
{
	public static void main (String args [])
	{
		String w1= "brush";
		String w2= "shrub";
         int i,j;
         int c=0;
         char ch; 
	for (i=0;i<w1.length();i++)
	{
		ch=w1.charAt(i);
		for (j=0;j<w2.length();j++)
	         {
			if(ch==w2.charAt(j))
			{
				c++;
			
		        }
			
		}
	}
	if (c==w1.length())
	{
		System.out.println("anagram word");
	}
	else if (c!= (w1.length()))
	{
		System.out.println("not anagram");
	}
	}
}
				
