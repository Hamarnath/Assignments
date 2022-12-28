package week1.day1.task;

public class Student {
	
	String studentName = "Hamarnath";
	int rollNo = 122;
	String collegeName = "VT";
	int markScored = 72;
	float cgpa = 7.2f;
	
	public void printDetails() {
		System.out.println("My Name is :" + studentName);
		System.out.println("My RollNumber is :"+ rollNo);
		System.out.println("I've studied at :"+ collegeName);
		System.out.println("My mark score is :"+ markScored + "%");
		System.out.println("The CGPA is :"+ cgpa);
		
	}

}
