import org.junit.Test;
import org.openqa.selenium.By;


public class Login_Primusbank extends JunitMaster
{
	@Test
	public void login()
	{
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
	}

}
