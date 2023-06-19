package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class StepDefinition {
	LoginPage loginPage;
	WebDriver driver;

	@Before
	public void beforeRun() {
		initDriver();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

	}

	private void initDriver() {
		// TODO Auto-generated method stub
	}

	@Given("Set skyblue background button exists")
	public void set_skyblue_background_button_exists() {
		System.out.println(" >>set sky background button exists");
	
		}
	

	@When("I click on the button")
	public void i_click_on_the_button() {
		driver.findElement(By.xpath("//*[@id=\"extra\"]/button[1]")).click();
		System.out.println(">>I click on the button");
		
	}

	@Then("The background colour will change to skyblue")
	public void the_background_colour_will_change_to_skyblue() {
		System.out.println(">>The background colour will change to skyblue");
		

	}

	@Given("Set white background button exists")
	public void set_white_background_button_exists() {
	
		System.out.println(">>Set white background button exists");
		
		}

	

	@When("click on the button")
	public void click_on_the_button() {
	driver.findElement(By.xpath("//*[@id=\"extra\"]/button[2]")).click();	
	    System.out.println(">>click on the button");
	   
	}

	@Then("The background colour will change to white")
	public void the_background_colour_will_change_to_white() {
		System.out.println(">>The background colour will change to white");
		
	}

	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
