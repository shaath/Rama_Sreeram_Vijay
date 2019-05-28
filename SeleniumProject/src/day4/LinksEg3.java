package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg3 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//a[@href='home.aspx']")).click();
		
//		WebElement block=driver.findElement(By.xpath("//td[@style='height: 19px']"));
//		
//		List<WebElement> links=block.findElements(By.tagName("a"));
//		System.out.println(links.size());
//		
//		for (int i = 0; i < links.size(); i++)
//		{
//			String lName=links.get(i).getText();
//			System.out.println(lName);
//			if (lName.equalsIgnoreCase("Home")) 
//			{
//				links.get(i).click();
//				break;
//			}
//		}
		driver.findElement(By.xpath("//td[@style='height: 19px']")).findElement(By.linkText("Home")).click();
	}

}
