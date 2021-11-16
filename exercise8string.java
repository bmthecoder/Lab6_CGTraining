
class StringDemo
{
	public static void main(String args[])
	{
		String str = "abdc";
		int len = str.length();
 		char[] cr = str.toCharArray();
		int flag=1;
		for(int i=0;i<len-1;i++)
		{
			if(cr[i]>cr[i+1])
			{
				flag=0;
				break;
			}
			
			
		}
		if(flag==1)
		{
			System.out.println("Positive String");
		}
		else{
			System.out.println("Not positive");
		}
		
	}

	
}