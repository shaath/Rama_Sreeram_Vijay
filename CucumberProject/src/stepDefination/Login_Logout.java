package stepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Logout 
{
public static WebDriver driver;
@Given("^launch the browser and navigate to url$")
public void launch_the_browser_and_navigate_to_url() throws Throwable
{
    driver=new FirefoxDriver();
    driver.get("http://orangehrm.qedgetech.com");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
}

@When("^user enter username and password$")
public void user_enter_username_and_password() throws Throwable {
    
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
}

@When("^click on login$")
public void click_on_login() throws Throwable {
    
	driver.findElement(By.id("btnLogin")).click();
}

@Then("^redirected to admin page and should display welcome link$")
public void redirected_to_admin_page_and_should_display_welcome_link() throws Throwable {
    
	String expval="welcome";
	Thread.sleep(3000);
	String actval=driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
	Assert.assertEquals(expval, actval);
}

@When("^User clicks on welcome link$")
public void user_clicks_on_welcome_link() throws Throwable {
    
	driver.findElement(By.partialLinkText("Welcome")).click();
}

@When("^also clicks on logout$")
public void also_clicks_on_logout() throws Throwable {
	driver.findElement(By.linkText("Logout")).click();
}

@Then("^oraghrm login page displayed$")
public void oraghrm_login_page_displayed() throws Throwable {
    String expval="LOGIN";
    String actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
    Assert.assertEquals(expval, actval);
}

}
