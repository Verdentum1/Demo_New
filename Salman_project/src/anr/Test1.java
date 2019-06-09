package anr;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;

public class Test1 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\salman\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("http://www.gmail.com");
		Thread.sleep(3000);
		String x=driver.getTitle();
		//System.out.println(x);
		// String y= driver.getPageSource();
		//System.out.println(y);
		//String z=driver.getCurrentUrl();
		//System.out.println(z);
		//if(z.contains("https"))
		{
			System.out.println("Secure site");
			
		}
		//else
		{
			System.out.println("not secure");
		}
		File f1=new File ("D:\\salman\\Book1.xls");
		Workbook wb=Workbook.getWorkbook(f1);
		Sheet sh=wb.getSheet(2);
		String uid=sh.getCell(0,0).getContents();
		driver.findElement(By.xpath("//*[@name='identifier']")).sendKeys(uid);
		Thread.sleep(10000);
		WebElement e= driver.findElement(By.xpath("//*[text()='Next']"));
		e.click();
		Thread.sleep(3000);
		String pwd=sh.getCell(1,0).getContents();
		System.out.println(pwd);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(pwd);
		Thread.sleep(3000);
		WebElement e2=driver.findElement(By.xpath("//*[text()='Next']"));
		e2.click();

		
		//driver.quit();

	}

}
