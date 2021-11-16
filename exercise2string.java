import java.util.StringTokenizer;
class StringDemo
{
	public static void main(String args[])
	{
		
		String str = "EARTH";
 		System.out.println(getImage(str));
		
	}

	static String getImage(String ss)
	{	
		StringBuffer sb  = new StringBuffer(ss);
		sb.reverse();
		String str2 = new String(sb);
		String str1 = ss.concat("|");
		 str1 = str1.concat(str2);
		return str1;
	}
}