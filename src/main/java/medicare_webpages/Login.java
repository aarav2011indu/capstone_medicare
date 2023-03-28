package medicare_webpages;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Login {
	

	@Test
	public  void logintest () throws InterruptedException {
	// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/medicare/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		
		WebElement sign_up_button = driver.findElement(By.xpath("//*[@id=\"signup\"]/a"));
		sign_up_button.click();
		
		//==============enter details for signup======================================
		
		WebElement first_name = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		first_name.sendKeys("A");
		
		
		WebElement last_name = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		last_name.sendKeys("B");
		
		Random rand = new Random();
		int rand_int1 = rand.nextInt(100);
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("abc"+rand_int1+"@gmail.com");
		

		WebElement contact_no= driver.findElement(By.xpath("//*[@id=\"contactNumber\"]"));
		contact_no.sendKeys("12345");
		
		WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("123");
		
		WebElement re_confirm_password= driver.findElement(By.xpath("//*[@id=\"confirmPassword\"]"));
		re_confirm_password.sendKeys("123");
		
		WebElement Next_billing_button= driver.findElement(By.xpath("//*[@id=\"registerForm\"]/div[8]/div/button"));
		Next_billing_button.click();
		
		WebElement Address_line_one= driver.findElement(By.xpath("//*[@id=\"addressLineOne\"]"));
		Address_line_one.sendKeys("aa");
		
		WebElement Address_line_two= driver.findElement(By.xpath("//*[@id=\"addressLineTwo\"]"));
		Address_line_two.sendKeys("bb");
		
		WebElement city = driver.findElement(By.cssSelector("#city"));
		city.sendKeys("cc");
		
		WebElement postal_address = driver.findElement(By.xpath("//*[@id=\"postalCode\"]"));
		postal_address.sendKeys("110001");
		
		WebElement state = driver.findElement(By.xpath("//*[@id=\"state\"]"));
		state.sendKeys("del");
		
		WebElement country = driver.findElement(By.xpath("//*[@id=\"country\"]"));
		country.sendKeys("Ind");
		
		WebElement next_confirm = driver.findElement(By.xpath("//*[@id=\"billingForm\"]/div[7]/div/button[2]"));
		next_confirm.click();
		
		Thread.sleep(3000);
		
		WebElement confirm = new WebDriverWait(driver, 10)
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href,'submit')]")));
		

		confirm.click();
		Thread.sleep(3000);
		
		WebElement actualTitle = new WebDriverWait(driver, 10)
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//h1[contains(text(),'Welcome!')]")));
		
		
		 String expectedTitle = "Welcome!";
	       actualTitle = driver.findElement(By.xpath("//h1[contains(text(),'Welcome!')]"));
	        String welcomepage = actualTitle.getText();
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", actualTitle);
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='0px solid red'", actualTitle);

	        if (welcomepage.equals(expectedTitle)) {
	            System.out.println("signup is sucessful");
	        } else {
	            System.out.println("signup is not sucessful");
	        }
		
		
		

		
		
		//=====================login =======================================
	    
		
		WebElement login_button = driver.findElement(By.xpath("//a[contains(@href,'login')]"));
		login_button.click();
		
		WebElement username = new WebDriverWait(driver, 10)
		        .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#username")));
		
		
		username = driver.findElement(By.cssSelector("#username"));
		username.sendKeys("kn@gmail.com");
		
		
		
		WebElement pwd = driver.findElement(By.cssSelector("#password"));
		pwd.sendKeys("12345");
		
		
		
		
		WebElement login= driver.findElement(By.xpath(" //input[2]"));
		login.click();
		
		
		driver.close();
	}

}


