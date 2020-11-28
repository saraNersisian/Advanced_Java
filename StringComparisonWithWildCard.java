import java.util.Scanner;
public class StringComparisonWithWildCard
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner (System.in);
		System.out.print("enter string 1: ");
		String string1 =  kb.nextLine();
		System.out.print("enter string 2: ");
		String string2 =  kb.nextLine();
		//match(string1, string2);
		System.out.print(match(string1, string2) ? "They are equal." : "They are different.");

	}
	public static boolean match (String str1, String str2)
	{
		if (str1.equals(str2))
			return true;
		else if (str1.length()!= str2.length())
			return false;
		else
		{
			for(int i=0; i<str1.length(); i++)
			{
				if (str1.charAt(i)=='?' || str2.charAt(i)=='?')
					continue;
				if (str1.charAt(i)!= str2.charAt(i))
					return false;	
			}
		}
		return true;
	}

}
