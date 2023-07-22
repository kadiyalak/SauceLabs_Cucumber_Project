package pageOjectsModel;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;
import java.util.List;
//import org.testng.annotations.DataProvider;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TestPage1 extends TestBasePage{
	public TestPage1(WebDriver driver) {
		super(driver);
	}
@FindBy(xpath="//input[@id='user-name']")
WebElement username;
@FindBy(xpath="//input[@id='password']")
WebElement password;
@FindBy(xpath="//input[@id='login-button']")
WebElement login;
@FindBy(xpath="//select[@class='product_sort_container']")
WebElement dropdown;
@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']")
WebElement product1;
@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")
WebElement product2;
@FindBy(xpath="//a[@class='shopping_cart_link']")
WebElement cartlink;
@FindBy(xpath="//button[@id='remove-sauce-labs-bike-light']")
WebElement remove;
@FindBy(xpath="//button[@id='checkout']")
WebElement checkout;
@FindBy(xpath="//input[@id='first-name']")
WebElement firstname;
@FindBy(xpath="//input[@id='last-name']")
WebElement lastname;
@FindBy(xpath="//input[@id='postal-code']")
WebElement zip;
@FindBy(xpath="//input[@id='continue']")
WebElement continue1;


@FindBy(xpath="//button[@id='finish']")
WebElement finish;
public void uname(String input) {username.sendKeys(input);}
public void pass(String pass1) {password.sendKeys(pass1);}
public void submit() {login.click();}public void select1() {Select month1=new Select(dropdown);

//month1.selectByVisibleText("Apr");
//use this if value attribute is present in option tag
//month1.selectByValue("6");
month1.selectByIndex(2);/*dropdown.click();*/}public void click1() {product1.click();}
public void click2() {product2.click();} public void click3(){cartlink.click();}public void click4() {remove.click();}
public void checkout1()
{
	checkout.click();
}
public void fname(String fname1) {firstname.sendKeys(fname1);}
public void lname(String lname1)
{lastname.sendKeys(lname1);}
public void postal(String post) {
	zip.sendKeys(post);
}
public void con()
{continue1.click();}

public void fin()
{
	finish.click();
}



















}