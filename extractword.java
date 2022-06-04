 class extractword
{
	public static void main(String args[])
	{
		String str= "huzaifa is a good boy";
                str = str + " ";
		int i ;
		String word = " ";
		char ch;
		for (i=0 ; i<str.length(); i ++)
		{
			ch=str.charAt(i);
			if (ch!= ' ')
			{
				word=word+ch;
			}
			else if (ch==' ')
			{
				System.out.println(word);
				word =" ";
			}
		}
	}
}
