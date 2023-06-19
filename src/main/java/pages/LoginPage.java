package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	
	 public  void init() {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://techfios.com/test/101/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	 }
		public void SkyBlue() {
			
		}
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[1]")
		WebElement SKY_BLUE_BACKGROUND_ELEMENT;
		@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[2]")
		WebElement SKY_WHITE_BACKGROUND_ELEMENT;
	

	
	//INTRACTABLE METHODS
	public void clickOnSkyBlueBackground() throws InterruptedException {
		if (1==1) driver.findElement(By.xpath("//*[@id=\"extra\"]/button[1]")).click();
		try {
		Thread.sleep(3000);
	}catch (InterruptedException e) {
		e.printStackTrace();
	}
		
	}
	public void clickOnSkyWhiteBackground() {
		if( 2> 1) driver.findElement(By.xpath("//*[@id=\"extra\"]/button[2]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
		
		
	}
