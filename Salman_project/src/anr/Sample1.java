package anr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\salman\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='REGISTER']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstName")).sendKeys("salman");
		Thread.sleep(3000);
		driver.findElement(By.name("lastName")).sendKeys("sk");
		Thread.sleep(3000);
		driver.findElement(By.name("phone")).sendKeys("9030553575");
		Thread.sleep(3000);
		driver.findElement(By.name("userName")).sendKeys("salman");
		driver.findElement(By.name("address1")).sendKeys("Hyd");
		driver.findElement(By.name("city")).sendKeys("Telangana");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.name("postalCode")).sendKeys("522101");
		driver.findElement(By.name("country")).sendKeys("INDIA ");
		driver.findElement(By.name("email")).sendKeys("salman");
		driver.findElement(By.name("password")).sendKeys("salman");
		driver.findElement(By.name("confirmPassword")).sendKeys("salman");
		driver.findElement(By.name("register")).click();
  
	}

}
