package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpReg_TestNG extends TestNGMaster
{
	@Test(dataProvider="data")
	public void Org_Empreg(String f,String l, String Eid)
	{
		expval=f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(Eid);
		driver.findElement(By.id("btnSave")).click();
		
		actval=driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText();
		
		Assert.assertEquals(actval, expval,"Employee Registration Failed");
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] x=new Object[4][3];
		
		x[0][0]="Venki";
		x[0][1]="CH";
		x[0][2]="CVH3298";
		
		x[1][0]="Anji";
		x[1][1]="A";
		x[1][2]="AJH3298";
		
		x[2][0]="Krishna";
		x[2][1]="CH";
		x[2][2]="KCH3298";
		
		x[3][0]="Venki";
		x[3][1]="CH";
		x[3][2]="CHV3298";
		
		return x;
	}
}
