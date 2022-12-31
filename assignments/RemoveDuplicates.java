package week1.day3.assignments;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
	
		String text = "We learn java basics as part of java sessions in java week1";
		String[] arr1=text.split(" ");
		//int count =0;
		for (int i = 0; i < arr1.length; i++) {
			
			for (int j = i+1; j < arr1.length; j++) {
				
				if (arr1[i].equals(arr1[j]))
				{
					arr1[j]="";
				}
			}
		}
		
		text = Arrays.toString(arr1);
		
		System.out.println(text);
	}

}
