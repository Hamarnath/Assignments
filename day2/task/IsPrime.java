package week1.day2.task;

import java.util.Scanner;

public class IsPrime {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int prime=sc.nextInt();
		sc.close();
		int count=0;
		String div= "1";
		for (int i =2; i<prime; i++)
		{
		  if (prime%i==0)
		  {
			  count=count+1;
			  div = div + "," + i;
		  }
		}
		if (count==0)
		{
			System.out.println("Given value is Prime number");
		}
		else
		{
			System.out.println("Given value is divisible by "+ div + " not a Prime number");
		}
		//sc.close();
	}

}
