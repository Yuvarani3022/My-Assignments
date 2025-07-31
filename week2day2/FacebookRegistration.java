package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		// Launch Chrome browser
		ChromeDriver driver = new ChromeDriver(options);
		//Navigate to Facebook registration page
		driver.get("https://www.facebook.com/");
		//Maximize the browser
		driver.manage().window().maximize();

//Click on "Create new account" button
driver.findElement(By.linkText("Create new account")).click();

//Enter first name
driver.findElement(By.name("firstname")).sendKeys("Yuvarani");

//Enter surname
driver.findElement(By.name("lastname")).sendKeys("Siva");

//Enter mobile number or email
driver.findElement(By.name("reg_email__")).sendKeys("1234567890");

//Enter new password
driver.findElement(By.name("reg_passwd__")).sendKeys("yuvibook123");

//Select date of birth
WebElement dayDropdown = driver.findElement(By.id("day"));
Select daySelect = new Select(dayDropdown);
daySelect.selectByValue("22");

WebElement monthDropdown = driver.findElement(By.id("month"));
Select monthSelect = new Select(monthDropdown);
monthSelect.selectByValue("12");

WebElement yearDropdown = driver.findElement(By.id("year"));
Select yearSelect = new Select(yearDropdown);
yearSelect.selectByValue("2003");

driver.findElement(By.id("sex")).click();

driver.close();
}
	}