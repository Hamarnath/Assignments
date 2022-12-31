package week1.day3.assignments;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Tes12Le79af65";
		text = text.replaceAll("[a-zA-z]", "");
		System.out.println("extracted String: "+text);
		int sum=0;
		char[] ch1=text.toCharArray();
		for (int i = 0; i < ch1.length; i++) {
			sum = sum + Character.getNumericValue(ch1[i]);
		}
		System.out.println("Sum Of Digits From String: "+sum);
	}

}
