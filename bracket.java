import java.util.*;

class Brac1
{
	private static Scanner sc = new Scanner(System.in);
	private static String open = "({[<";
	private static String close = ")}]>";
	
	public static boolean checkbrackets(String str , int begin, int end)
	{
		
		if (begin > end) 
			return true;
		if (end == 1 || close.contains(Character.toString(str.charAt(0)))) 
			return false;
		String bracket = Character.toString(str.charAt(begin)); 
		
		if (open.contains(bracket)) 
		{  
			int check = open.indexOf(bracket); 
			String bracket_close = Character.toString(close.charAt(check)); 
			if (!str.contains(bracket_close)) 
				return false;
		}
		
		if (close.contains(bracket)) {
			int t = begin-1;
			int check = close.indexOf(bracket);
			String bracket_str = Character.toString(str.charAt(t));
			String bracket_open = Character.toString(open.charAt(check));
			
			while (!open.contains(bracket_str)) 
			{ 
				t--;
				bracket_str = Character.toString(str.charAt(t));
			}
			
			if (!bracket_str.equals(bracket_open)) 
				return false;
			else
				return true;
		} 
		
		return checkbrackets(str,++begin,end);
	}
	public static void main(String[] args) {
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		System.out.println("Is string is balanced : " + checkbrackets(s,0,s.length()));
	}
	
}