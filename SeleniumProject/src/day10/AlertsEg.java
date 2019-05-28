package day10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AlertsEg {

	public static void main(String[] args) throws InterruptedException
	{
//		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.ie.driver", "F:\\Cdownloads\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://primusbank.qedgetech.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
		
		Alert alt=driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		alt.accept();
//		alt.dismiss();
		
//		alt.sendKeys("Yes");
	}

}
