import java.util.*;
//find no. of character, words, lines in a text
class E5String
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.println("Enter the paragraph");
		while(sc.hasNextLine())
		{
			sb.append(sc.nextLine()+"\n");
		}
		String str = new String(sb);
		System.out.println("Characters: "+str.length());
		String arr[] = str.split(" ");
		System.out.println("Words: "+arr.length);
		String arr2[] = str.split("\n");
		System.out.println("Lines: "+arr2.length);
		
	}	
}
