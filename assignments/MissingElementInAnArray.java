package week1.day3.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int j=1;
		for (int i = 0; i < arr.length; i++) {
			if (j!= arr[i])
			{
				System.out.println("Missing Element in Array: "+ j);
				break;
			}
			j++;
		}
	}

}
