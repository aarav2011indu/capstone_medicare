package stepdefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import medicare_webpages.Admin;
import medicare_webpages.Check_out;
import medicare_webpages.Login;



public class stepdef {
	
	public WebDriver driver;
	public Login lp; 
    public Check_out chk;
    public Admin adm;
    
    
@Given("the user is on the login page")
public void the_user_is_on_the_login_page() {
	System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://localhost:8080/medicare/");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
    // Write code here that turns the phrase above into concrete actions
    
}

@When("the user enters valid login credentials and clicks the login button")
public void the_user_enters_valid_login_credentials_and_clicks_the_login_button() {
    // Write code here that turns the phrase above into concrete actions
	WebElement login_button = driver.findElement(By.xpath("//a[contains(@href,'login')]"));
	login_button.click();
	
	WebElement username = new WebDriverWait(driver, 10)
	        .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#username")));
	
	
	username = driver.findElement(By.cssSelector("#username"));
	username.sendKeys("kn@gmail.com");
	
	
	
	WebElement pwd = driver.findElement(By.cssSelector("#password"));
	pwd.sendKeys("12345");
	
}
@Then("the user should be logged in and redirected to the homepage")
public void the_user_should_be_logged_in_and_redirected_to_the_homepage() {
    // Write code here that turns the phrase above into concrete actions
	WebElement login= driver.findElement(By.xpath(" //input[2]"));
	login.click();
}

@Given("the user is on the homepage")
public void the_user_is_on_the_homepage() {
    // Write code here that turns the phrase above into concrete actions
   
}

@When("the user searches for a product and selects a product to view")
public void the_user_searches_for_a_product_and_selects_a_product_to_view() {
    // Write code here that turns the phrase above into concrete actions
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,250)", "");
	WebElement view_product= driver.findElement(By.xpath("(//a[contains(@href,'/medicare/show/1/product')])[1]"));
	view_product.click();
}

@Then("the user should be redirected to the product details page")
public void the_user_should_be_redirected_to_the_product_details_page() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Given("the user is on the product details page")
public void the_user_is_on_the_product_details_page() {
    // Write code here that turns the phrase above into concrete actions
  
}

@When("the user selects the quantity and adds the product to the cart")
public void the_user_selects_the_quantity_and_adds_the_product_to_the_cart() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("the product should be added to the cart and the user should be redirected to the cart page")
public void the_product_should_be_added_to_the_cart_and_the_user_should_be_redirected_to_the_cart_page() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Given("the user is on the cart page")
public void the_user_is_on_the_cart_page() {
    // Write code here that turns the phrase above into concrete actions
	WebElement cart_item= driver.findElement(By.partialLinkText("Add to Cart"));
	cart_item.click();
}

@When("the user clicks the checkout button")
public void the_user_clicks_the_checkout_button() {
    // Write code here that turns the phrase above into concrete actions
	WebElement check_out= driver.findElement(By.xpath("//a[. = 'Checkout ']"));
	check_out.click();
	
}

@Then("the user should be redirected to the checkout page")
public void the_user_should_be_redirected_to_the_checkout_page() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Given("I am logged in as an admin user")
public void i_am_logged_in_as_an_admin_user() {
    // Write code here that turns the phrase above into concrete actions
	WebElement login_button = driver.findElement(By.xpath("//a[. = 'Login']"));
	login_button.click();
	
	
	WebElement username = driver.findElement(By.cssSelector("#username"));
	username.sendKeys("vk@gmail.com");
	
	
	
	WebElement password = driver.findElement(By.cssSelector("#password"));
	password.sendKeys("admin");
	
	
	
	WebElement login= driver.findElement(By.xpath(" //input[2]"));
	login.click();
	
}

@When("I click on manage product buttons")
public void i_click_on_manage_product_buttons() {
    // Write code here that turns the phrase above into concrete actions
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='manageProduct']/a")));
		

	WebElement manage_product= driver.findElement(By.xpath("//*[@id='manageProduct']/a"));
	manage_product.click();
}

@When("I Fill the deatails")
public void i_fill_the_deatails() {
    // Write code here that turns the phrase above into concrete actions
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
    
    

}

@When("I enter the category name as {string}")
public void i_enter_the_category_name_as(String string) {
    // Write code here that turns the phrase above into concrete actions
   
}

@When("I enter a description for the category as {string}")
public void i_enter_a_description_for_the_category_as(String string) {
    // Write code here that turns the phrase above into concrete actions

    WebElement droplist = driver.findElement(By.xpath("//*[@id='categoryId']"));

    List<WebElement> Options = droplist.findElements(By.xpath("//*[@id='categoryId']/option[3]"));
   
}

@When("I upload an image for the category")
public void i_upload_an_image_for_the_category() {
    // Write code here that turns the phrase above into concrete actions
	  WebElement FileUpload = driver.findElement(By.xpath("//*[@id='file']"));
	    FileUpload.sendKeys("C:\\Users\\indus\\OneDrive\\Desktop\\medi.jpeg");
}

@When("I click on the {string} button")
public void i_click_on_the_button(String string) {
    // Write code here that turns the phrase above into concrete actions
	  WebElement save_button = driver.findElement(By.name("submit"));
      save_button.click();
}

@Then("the new category should be visible on the website")
public void the_new_category_should_be_visible_on_the_website() {
    // Write code here that turns the phrase above into concrete actions
    
}
}