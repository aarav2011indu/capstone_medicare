package medicare_webpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Check_out {
	WebDriver driver ;

    @BeforeMethod
    public void setup() {
    	System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://localhost:8080/medicare/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
    }
    

    @Test
    
    public void viewProductTest() throws InterruptedException  {
        // Enter a search term and click on the search button
   
    	
		WebElement login_button = driver.findElement(By.xpath("//a[. = 'Login']"));
		login_button.click();
		
		
		
		
		WebElement username = driver.findElement(By.cssSelector("#username"));
		username.sendKeys("kn@gmail.com");
		
		
		WebElement password = driver.findElement(By.cssSelector("#password"));
		password.sendKeys("12345");
		
		
		
		
		WebElement login= driver.findElement(By.xpath("//input[2]"));
		login.click();
		
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		WebElement view_product= driver.findElement(By.xpath("(//a[contains(@href,'/medicare/show/1/product')])[1]"));
		view_product.click();
		
		Thread.sleep(1000);
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("((//a[contains(@href, '/medicare/show/1/product')])[1]"))).click();
		

		WebElement cart_item= driver.findElement(By.partialLinkText("Add to Cart"));
		cart_item.click();
		
		Thread.sleep(3000);
		
		WebElement check_out= driver.findElement(By.xpath("//a[. = 'Checkout ']"));
		check_out.click();
		
		
		//address details
		
		WebElement Address_line_one= driver.findElement(By.cssSelector("#addressLineOne"));
		Address_line_one.sendKeys("aa");
		
		
		WebElement Address_line_two= driver.findElement(By.cssSelector("#addressLineTwo"));
		Address_line_two.sendKeys("bb");
		

		WebElement city= driver.findElement(By.cssSelector("#city"));
		city.sendKeys("cc");
		
		WebElement postal_code= driver.findElement(By.cssSelector("#postalCode"));
		postal_code.sendKeys("1234");


		WebElement state= driver.findElement(By.cssSelector("#state"));
		state.sendKeys("bng");

		WebElement country= driver.findElement(By.cssSelector("#country"));
		country.sendKeys("ind");
		
		
		WebElement save_address= driver.findElement(By.cssSelector(" [name='_eventId_saveAddress']"));
		save_address.click();
		
	   //card details
		
		
    
		WebElement card_number= driver.findElement(By.cssSelector("#cardNumber"));
		card_number.sendKeys("1234567");
		
		WebElement expiry_month= driver.findElement(By.cssSelector("#expityMonth"));
		
		expiry_month.sendKeys("11");
		
		WebElement expiry_year= driver.findElement(By.cssSelector("#expityYear"));
		
		expiry_year.sendKeys("2025");
		
		WebElement cv_code= driver.findElement(By.cssSelector("#cvCode"));
		
		cv_code.sendKeys("123");
		
		WebElement payment_button= driver.findElement(By.xpath("//a[. = 'Pay']"));
		
		payment_button.sendKeys("123");
		
		
		
		

		// TODO Auto-generated method stub
	    	driver.close();
		
	}
}