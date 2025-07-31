package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {
	public static void main(String[] args) {

		// Setup Chrome in guest mode
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		// Launch Chrome browser
		ChromeDriver driver = new ChromeDriver(options);

		// Load URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize the browser
		driver.manage().window().maximize();

		// Enter Username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		// Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click Login
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click CRM/SFA link
		driver.findElement(By.partialLinkText("CRM")).click();

		// Click Leads link
		driver.findElement(By.linkText("Leads")).click();

		// Click Create Lead link
		driver.findElement(By.linkText("Create Lead")).click();

		// Enter Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		// Enter First Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");

		// Enter Last Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");

		// 1. Source Dropdown - Select Employee (using index)
		WebElement sourceDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceSelect = new Select(sourceDropdown);
		sourceSelect.selectByIndex(4); // Example index

		// 2. Marketing Campaign Dropdown - Select Automobile (using visible text)
		WebElement marketingDropdown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketingSelect = new Select(marketingDropdown);
		marketingSelect.selectByVisibleText("Automobile");

		// 3. Ownership Dropdown - Select Corporation (using value)
		WebElement ownershipDropdown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipSelect = new Select(ownershipDropdown);
		ownershipSelect.selectByValue("OWN_CCORPORATION");

		// 4. Industry Dropdown - Select Computer Software (example using visible text)
		WebElement industryDropdown = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industrySelect = new Select(industryDropdown);
		industrySelect.selectByVisibleText("Computer Software");

		// Click Create Lead button
		driver.findElement(By.name("submitButton")).click();

		// Verify the title of the page
		String title = driver.getTitle();
		System.out.println("Page Title: " + title);

		// Close the browser
		driver.close();
	}
}



