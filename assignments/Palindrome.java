package week1.day3.assignments;

public class Palindrome {
	
	public static void main(String[] args) {
		String input="madam";
		String reverse="";
		int len=input.length();
		for (int i=len-1; i>=0; i--) 
		{ 
			reverse = reverse+input.charAt(i);
		}
        if (input.equals(reverse))
        {
        	System.out.println("Given String '" + input+"'  is a palindrome");
        }
        else
        {
        	System.out.println("Given String '" + input+"' is not a palindrome");
        }
	}

}
