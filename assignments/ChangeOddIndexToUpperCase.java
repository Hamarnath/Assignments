package week1.day3.assignments;

public class ChangeOddIndexToUpperCase {
	
	public static void main(String[] args) {
		
		String test = "changeme";
		char[] ch1= test.toCharArray();
		for (int i = 0; i < ch1.length; i++) {
			if (i%2==0)
			{
				continue;
			}
			else
			{
				ch1[i] = Character.toUpperCase(ch1[i]);				
			}
				
		}
//		System.out.println(ch1.toString());
		System.out.println(new String(ch1));
		
	}

}
