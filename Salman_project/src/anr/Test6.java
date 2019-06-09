package anr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test6 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\salman\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(3000);
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		Thread.sleep(3000);
		WebElement e=driver.findElement(By.xpath("//*[@class='form-control']"));
		Select sec=new Select(e);
		sec.selectByIndex(2);
	}
}
