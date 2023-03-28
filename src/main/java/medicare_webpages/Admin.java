package medicare_webpages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Admin {
	
	WebDriver driver ;

    @BeforeMethod
    public void setup() {
    	System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://localhost:8080/medicare/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
    }
    

    @Test
    public void AdminTest() throws InterruptedException  {
    	WebElement login_button = driver.findElement(By.xpath("//a[. = 'Login']"));
		login_button.click();
		
		
		WebElement username = driver.findElement(By.cssSelector("#username"));
		username.sendKeys("vk@gmail.com");
		
		
		
		WebElement password = driver.findElement(By.cssSelector("#password"));
		password.sendKeys("admin");
		
		
		
		WebElement login= driver.findElement(By.xpath(" //input[2]"));
		login.click();
		
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='manageProduct']/a")));
			

		WebElement manage_product= driver.findElement(By.xpath("//*[@id='manageProduct']/a"));
		manage_product.click();
		//add new product deatails
		
		WebElement product_name= driver.findElement(By.xpath("//input[@placeholder = 'Product Name']"));
		product_name.sendKeys("cough syrup");
		
		WebElement brand_name= driver.findElement(By.cssSelector(" #brand"));
		brand_name.sendKeys("chestron");
		
		WebElement description = driver.findElement(By.xpath("//textarea[@placeholder = 'Enter your description here!']"));
		description.sendKeys("for kids");
		
		WebElement unit_price = driver.findElement(By.xpath("//*[@id='unitPrice']"));
		unit_price.sendKeys("50");
		
		WebElement quantity = driver.findElement(By.xpath("//*[@id=\"quantity\"]"));
	    quantity.sendKeys("30");
	    
	    //upload a file
	    
	    WebElement FileUpload = driver.findElement(By.xpath("//*[@id='file']"));
	    FileUpload.sendKeys("C:\\Users\\indus\\OneDrive\\Desktop\\medi.jpeg");
	    
	    

        WebElement droplist = driver.findElement(By.xpath("//*[@id='categoryId']"));

        List<WebElement> Options = droplist.findElements(By.xpath("//*[@id='categoryId']/option[3]"));
       
        
        WebElement save_button = driver.findElement(By.name("submit"));
        save_button.click();
        
		driver.close();
		
        

}
}
