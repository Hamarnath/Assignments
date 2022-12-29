package week1.day2.task;

public class Calculator {
	
	public int addthreenumbers(int a, int b, int c) {
		return a+b+c;
	}
	
	public int multiply(int i , int j) {		
		return i*j;		
	}
	
	public int divide() {
		int  a= 20;
		int  b= 5;
		return a/b;
	}
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		int add = cal.addthreenumbers(5, 8, 10);
		int multi = cal.multiply(3, 4);
		int div = cal.divide();
		System.out.println("Addition of three numbers: "+add);
		System.out.println("Multipication of two numbers: "+multi);
		System.out.println("Division of two numbers: "+div);
	}

}
