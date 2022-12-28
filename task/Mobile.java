package week1.day1.task;

public class Mobile {
	
	
	public void makeCall() {
		String mobileModel;
		float mobileWeight;
		System.out.println("Call started");
	}
	
	public void sendMsg() {
		boolean isFullCharged;
		int mobileCost;
        System.out.println("SMS sent successfully");

	}
	
	public static void main(String[] args) {
		Mobile obj = new Mobile();
		System.out.println("This is my mobile");
		obj.sendMsg();
		obj.makeCall();
	}

}
