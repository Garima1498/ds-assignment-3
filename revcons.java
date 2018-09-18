import java.util.Scanner;
class RemoveRep
{
	public static final int index(String s) 
	{
	    for (int a = s.length()-1; a > 0; a--) 
	    {
	        if(s.charAt(a) == s.charAt(a-1))
	        {
	            return a;
	        }
	        else
	        {
	            break;
	        }
	    }
	    return -1;
	}
	static public String remove(String str)
	{
	    int i = str.length()-1;
	    int index = index(str);
	    if(str.equals("") || str.length() == 1)
	        return str;
	    else if(index != -1)
	        return remove(str.substring(0,index));
	    else
	        return remove(str.substring(0,i)) + str.charAt(i);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		String r = remove(s);
		System.out.println("Final output string is "+ r);		
	}
}