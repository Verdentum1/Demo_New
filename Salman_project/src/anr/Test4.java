package anr;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\salman\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("http://www.gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='identifier']")).sendKeys("sudhakar241241");
		driver.findElement(By.xpath("//*[@name='identifier']")).clear();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@name='identifier']")).sendKeys("sudhakar241241");
		WebElement e= driver.findElement(By.xpath("//*[text()='Next']"));
		e.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("9030553575");
		Thread.sleep(3000);
		WebElement e2=driver.findElement(By.xpath("//*[text()='Next']"));
		e2.click();
		Thread.sleep(3000);
		List<WebElement> e1=driver.findElements(By.xpath("(//table)[4]/tbody/tr"));
		System.out.println(e1.size());
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//table)[4]/tbody/tr[7]")).click();
		Thread.sleep(5000);
		
		

	}

}
