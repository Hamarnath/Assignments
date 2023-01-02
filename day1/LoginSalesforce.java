package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSalesforce {

	public static void main(String[] args) {
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://login.salesforce.com/");
		driver1.manage().window().maximize();
		driver1.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver1.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver1.findElement(By.id("Login")).click();
		String title = driver1.getTitle();
		System.out.println(title);

	}

}
