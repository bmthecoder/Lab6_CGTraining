class StringDemo
{
	public static void main(String args[])
	{
		int num = 12345;
		int sum = 0;
		String str = String.valueOf(num);
		
		for(int i=0;i<str.length;i++)
		{
			char ch = str.charAt(i);
			
			int n = Integer.parseInt(String.valueOf(ch));    //char to int
			System.out.println("Each Integer ..."+n);
			
			sum = sum+n;	
			
		}
		System.out.println("sum of all Integers"+sum);	
	}
}

	