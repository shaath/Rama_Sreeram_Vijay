package methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrgHRMLib
{
	public WebDriver driver;
	public String expval,actval;
	
	public FileInputStream fi;
	public Properties pr;
	//Launch
	public String Org_Launch(String url) throws IOException
	{
		expval="LOGIN";
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		fi=new FileInputStream("F:\\Rama_Ram_Vijay_Recordings\\Workspace\\SeleniumProject\\src\\properties\\OrgHRM_OR.properties");
		pr=new Properties();
		pr.load(fi);
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		actval=driver.findElement(By.xpath(pr.getProperty("Login"))).getAttribute("value");
		if (expval.equalsIgnoreCase(actval))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	
	//Login
	public String Org_Login(String u,String p) throws InterruptedException
	{
		expval="welcome";
		driver.findElement(By.xpath(pr.getProperty("UserName"))).sendKeys(u);
		driver.findElement(By.xpath(pr.getProperty("Password"))).sendKeys(p);
		driver.findElement(By.xpath(pr.getProperty("Login"))).click();
		Thread.sleep(5000);
		actval=driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		if (expval.equalsIgnoreCase(actval))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	
	//Logout
	public String Org_Logout()
	{
		expval="LOGIN";
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		actval=driver.findElement(By.xpath("//input[@value='LOGIN']")).getAttribute("value");
		if (expval.equalsIgnoreCase(actval))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	
	//Close
	public void Org_Close()
	{
		driver.close();
	}
	
	//Employee Reg
	public String Org_EmpReg(String FN, String LN, String Eid)
	{
		expval=FN+" "+LN;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(FN);
		driver.findElement(By.id("lastName")).sendKeys(LN);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(Eid);
		driver.findElement(By.id("btnSave")).click();
		
		actval=driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText();
		if (expval.equalsIgnoreCase(actval))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	
	//UserReg
	
	public String Org_UserReg(String EName,String Uname, String pswd,String Cpswd) throws InterruptedException
	{
		expval=Uname;
		boolean flag=false;
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		
		driver.findElement(By.id("btnAdd")).click();
		
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(EName);
		driver.findElement(By.id("systemUser_userName")).sendKeys(Uname);
		driver.findElement(By.id("systemUser_password")).sendKeys(pswd);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(Cpswd);
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(3000);
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		
		for (int i = 0; i < rows.size(); i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			actval=cols.get(1).getText();
			if (expval.equalsIgnoreCase(actval))
			{
				flag=true;
				break;
			}
		}
		if (flag==true)
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}

	
}
