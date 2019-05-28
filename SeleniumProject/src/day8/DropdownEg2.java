package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/mercuryregister.php?osCsid=52dd0b142f5262297104f049b49471b2");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.name("country"));
		
		Select s=new Select(drop);
		
		List<WebElement> dlist=s.getOptions();
		
		System.out.println(dlist.size());
		for (int i = 0; i < dlist.size() ; i++) 
		{
			s.selectByIndex(i);
			String name=dlist.get(i).getText();
			System.out.println(name);
		}
	}

}
