package week1.day3.assignments;

import java.util.Arrays;

public class ReverseEvenWords {
	
	public String reverseString(String str2) {
		// TODO Auto-generated method stub
		String revstr = "";
		 char[] ch1=str2.toCharArray();
		    for (int i=ch1.length-1; i>=0; i--)
		    {
		    	revstr=revstr+ch1[i];
		    }
		    return revstr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "I am a software tester";
		String[] arr1=test.split(" ");
		String arr3="";
		//String[] arr2= new String[arr1.length];
		ReverseEvenWords obj= new ReverseEvenWords();
		for (int i = 0; i < arr1.length; i++) {
			if (i%2==0) {
				//arr2[i]=arr1[i] + " ";
				arr3=arr3 + arr1[i] + " ";
			}
			else
			{
				//arr2[i]=obj.reverseString(arr1[i]) + " ";
				arr3= arr3 + obj.reverseString(arr1[i]) + " ";
			}
			
		}
	//	System.out.println(Arrays.toString(arr2));
		System.out.println(arr3);

	}

}
