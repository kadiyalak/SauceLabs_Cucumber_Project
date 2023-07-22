package stepDefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;import pageOjectsModel.*;import org.apache.logging.log4j.LogManager;import java.util.List;
import java.time.Duration;
import java.util.HashMap;import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;import io.cucumber.java.Scenario;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.ResourceBundle;
public class TestSteps {
	WebDriver driver;
	TestPage1 tp1;
	Logger logger;ResourceBundle rb;String br;List<HashMap<String,String>> datamap;
	
	
	@Before
	public void setUp() {
		logger= LogManager.getLogger(this.getClass());
		rb=ResourceBundle.getBundle("config");
		br=rb.getString("browser");
	}
	@After
	public void tearDown(Scenario scenario) {
		
		System.out.println("Scenariro status:"+scenario.getStatus());
	if(scenario.isFailed()) {byte[] Screenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES); 
	scenario.attach(Screenshot,"image/png",scenario.getName());}/*driver.quit();*/}
	@Given("User Launch Browser")
	public void user_launch_browser() {
		if(br.equals("chrome"))   {
			driver =new ChromeDriver();}
			 
			 else if(br.equals("edge"))
			 {
				 driver=new EdgeDriver();
			 }else 
			 {
				 
				 driver=new FirefoxDriver();
			 }
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

	@Given("Opens URL {string}")
	public void opens_url(String url) {
		driver.get(url);
	    driver.manage().window().maximize();
	}
	

	@When("User Enters user-name  as {string} and Password as {string}")
	public void user_enters_user_name_as_and_password_as(String input, String pass1) {
	    tp1=new TestPage1(driver);logger.info("providing login details");tp1.uname(input);tp1.pass(pass1);
	}

	@When("Click on Login button")
	public void click_on_login_button() {
	    tp1.submit();
	}
	@When("click on the alert")
	/*public void click_on_the_alert() {
	    Alert alert=driver.switchTo().alert();;alert.accept();	}*/
	@When("Click on  dropdown")
	public void click_on_dropdown() {
	   tp1.select1(); 
	}
	/*@When("select the Name\\(A to Z)")
	public void select_the_name_a_to_z() {
	    
	}*/

	/*@When("select the price\\(low to high)")
	public void select_the_price_low_to_high() {
	    
	}*/

	/*@When("select the sauce labs onesie")
	public void select_the_sauce_labs_onesie() {
	    tp1.click1();
	}*/

	@When("add to cart")
	public void add_to_cart() {
	    tp1.click1();	tp1.click2();}

	/*@When("select the sauce labs  bike light")
	public void select_the_sauce_labs_bike_light() {
	    
	}*/

	@When("click on the addcart symbol")
	public void click_on_the_addcart_symbol() {
	    tp1.click3();
	}

	@When("remove product from the cart")
	public void remove_product_from_the_cart() {
	   tp1.click4();
	}

	@When("check checkout functionality")
	public void check_checkout_functionality() {
	    tp1.checkout1();
	}
	@When("user Enters First-name as {string} and last-name as {string} and Zip\\/Postal Code as {string}")
	public void user_enters_first_name_as_and_last_name_as_and_zip_postal_code_as(String fname1 , String lname1, String post) {
	  tp1.fname(fname1) ; tp1.lname(lname1);tp1.postal(post);
	}

	@When("Click on continue")
	public void click_on_continue() {tp1.con();
	    
	}

	@When("Click on finish")
	public void click_on_finish() {tp1.fin();
	    
	}





}