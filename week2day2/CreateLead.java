package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		// Launch Chrome browser
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps");
		//Maximize the browser
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager"); 
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click(); // navigate to create the lead form page
		driver.findElement(By.linkText( "Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Yuvarani");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Siva");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("software Engineer");
		driver.findElement(By.name("submitButton")).click(); //click submit button

		String title = driver.getTitle();
		System.out.println("Page Title:" + title);

		driver.close(); // close the window
	}

}
