package week1.day2.task;


public class Fibonacci {
	
	
	public static void main(String[] args) {
	
	int input =11;
	int a=0, b=1, c;
	System.out.println("Fibonacci Series:");
	System.out.print(a+","+b);
	
	for (int i=0; i<input;i++)
	{
		c=a+b;
		System.out.print(","+c);
		a=b;
		b=c;
	}
	
  }

}
