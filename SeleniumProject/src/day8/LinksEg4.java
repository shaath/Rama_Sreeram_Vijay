package day8;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg4 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("//html/body/table/tbody/tr[5]/td/table/tbody/tr/td[1]/table/tbody/tr[3]/td/table[2]/tbody/tr[2]"));
		
		List<WebElement> links=block.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++)
		{
			String lName=links.get(i).getText();
			System.out.println(lName);
			if (!lName.equalsIgnoreCase("Site Map"))
			{
				links.get(i).click();
				System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
				
				File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("F:\\Rama_Ram_Vijay_Recordings\\Workspace\\SeleniumProject\\src\\screenshots\\"+lName+".png"));

				
				driver.navigate().back();
				Thread.sleep(5000);
				block=driver.findElement(By.xpath("//html/body/table/tbody/tr[5]/td/table/tbody/tr/td[1]/table/tbody/tr[3]/td/table[2]/tbody/tr[2]"));
				links=block.findElements(By.tagName("a"));
			}
			
		}

	}

}
