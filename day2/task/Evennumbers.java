package week1.day2.task;

public class Evennumbers {
	
	private void printEven() {
		// TODO Auto-generated method stub
        for (int i=2; i<=20; i++)
        {
        	if (i%2==0)
        	{
        		System.out.print(i+" ");
        	}
        }
	}

	public static void main(String[] args) {
		
		Evennumbers evn=new Evennumbers();
		evn.printEven();
	}
}
