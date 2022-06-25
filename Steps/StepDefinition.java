package Steps;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	public ChromeDriver driver;
	
	@Given ("Open the Chrome browser")
	public void openbroswer() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();	
	}
	
	@Given("Load the application url {string}")
	public void url(String url) {
	driver.get(url);		
	}
	
	@Given ("Enter the username as {string}")
	public void username(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);		
	}
	
	@Given("Enter the password as {string}")
	public void pwd(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	
	@When("Click on login button")
	public void verifylogin() {
		driver.findElement(By.className("decorativeSubmit")).click();		
	}
	
	@Then ("Homepage should be displayed")
	public void homepage() {
		Boolean dis=driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if(dis==true) {System.out.println("Success");}
		else
		{System.out.println("Failed");
		}
	}
		
	@But ("Error Message should be displayed")
	public void fail() {
		System.out.println("Failed");
			}
		
	
}
