package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
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
		// Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Yuvarani S");
		//find Dropdown elements
		WebElement industryDropdown = driver.findElement(By.name("industryEnumId"));
		Select industrySelect = new Select(industryDropdown);
		industrySelect.selectByVisibleText("Computer Software");

		WebElement ownershipDropdown= driver.findElement(By.name("ownershipEnumId"));
		Select ownershipSelect = new Select(ownershipDropdown);
		ownershipSelect.selectByVisibleText("S-Corporation");
		//select source id
		WebElement sourceDropdown = driver.findElement(By.name("dataSourceId"));
		Select sourceSelect = new Select(sourceDropdown);
		sourceSelect.selectByValue("LEAD_EMPLOYEE");

		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

		//select marketing campaignid
		WebElement marketingCampaignDropdown = driver.findElement(By.name("marketingCampaignId"));
		Select marketingCampaignSelect = new Select(marketingCampaignDropdown);
		marketingCampaignSelect.selectByIndex(1);
		//select state/province
		WebElement stateProvinceDropdown1 = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select stateProvinceSelect = new Select(stateProvinceDropdown1);
		stateProvinceSelect.selectByValue("TX");
		//click the create account button
		driver.findElement(By.className("smallSubmit")).click();
		//verify account name
		String accountName = driver.findElement(By.id("accountName")).getText();
		System.out.println("Account Name: " + accountName);
		//close the window
		driver.close();
	}
}