package week1.day3.assignments;

public class FindIntersection {

	public static void main(String[] args) {

		int[] arrFirst={3,2,11,4,6,7};
		int[] arrSecond={1,2,8,4,9,7};
		for (int i = 0; i < arrFirst.length; i++) {

			for (int j = 0; j < arrSecond.length; j++) {

				if (arrFirst[i]==arrSecond[j])
				{
					System.out.println("Matched element: "+ arrFirst[i]);
				}

			}

		}
	}
}
