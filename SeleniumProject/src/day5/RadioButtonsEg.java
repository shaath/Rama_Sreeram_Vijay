package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsEg {

	public static void main(String[] args) 
	{
//		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell/Desktop/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		
		List<WebElement> radios=block.findElements(By.tagName("input"));
		System.out.println(radios.size());
		
		for (int i = 0; i < radios.size(); i++)
		{
			String rName=radios.get(i).getAttribute("value");
			System.out.println(rName);
			
			if (rName.equalsIgnoreCase("Milk"))
			{
				radios.get(i).click();
			}
			else if (rName.equalsIgnoreCase("beer"))
			{
				radios.get(i).click();
			}
		}

	}

}
