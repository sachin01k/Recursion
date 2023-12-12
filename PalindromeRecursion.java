
public class PalindromeRecursion{

	static String pali(String str)
	{
		if(str.length() == 1)
			return ""+ str.charAt(0);

		return "" + str.charAt(str.length()-1) + pali(str.substring(0,str.length()-1));
	}

	public static void main(String[] args) {
		String str = "1231";
		str = str.toLowerCase();

		if(pali(str).equals(str))
			System.out.println(str + " is Palindrome.");
		else
			System.out.println(str + " is not Palindrome");
	}
}