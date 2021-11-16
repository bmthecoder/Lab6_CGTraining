class Modifynum
{
	public static void main(String args[])
	{
		int number = 45862;
		System.out.println(modifyNumber(number));
		
	}

	static int modifyNumber(int num)
	{
		String str = String.valueOf(num);     //int to string
		StringBuffer sb = new StringBuffer(); 
		for(int i=0;i<str.length()-1;i++)
		{
			char ch = str.charAt(i);
			char ch1 = str.charAt(i+1);
			int n = Integer.parseInt(String.valueOf(ch));    //char to int
			int m = Integer.parseInt(String.valueOf(ch1));

			int diff = Math.abs(n-m);  //If not took abs value then get numberformat Exception	
			sb.append(diff);
			if(i==str.length()-2)
			{
				sb.append(str.charAt(i+1));
			}
		}
		String ss = sb.toString();	//converting StringBuffer into Stirng		
		int dif = Integer.parseInt(ss);	
		return dif;
		
	}
	
	
}