package anr;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\salman\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("http://www.verdentum.org");
		Thread.sleep(3000);
		driver.findElement(By.name("uname")).sendKeys("sudhakar@verdentum.org",Keys.TAB,"Verdentum@21",Keys.ENTER);
	}
}
