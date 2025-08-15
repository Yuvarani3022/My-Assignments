package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class WindowHandlingAssign {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		// Login
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		// From Contact
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		String mainWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String win : allWindows) {
			if (!win.equals(mainWindow)) {
				driver.switchTo().window(win);
				driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
			}
		}
		driver.switchTo().window(mainWindow);
		// To Contact
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		allWindows = driver.getWindowHandles();
		for (String win : allWindows) {
			if (!win.equals(mainWindow)) {
				driver.switchTo().window(win);
				driver.findElement(By.xpath("(//a[@class='linktext'])[2]")).click();
			}
		}
		driver.switchTo().window(mainWindow);
		// Merge
		driver.findElement(By.className("buttonDangerous")).click();
		driver.switchTo().alert().accept();
		// Verify
		if (driver.getTitle().contains("View Contact")) {
			System.out.println("✅ Merge successful");
		} else {
			System.out.println("❌ Merge failed");
		}
		driver.quit();
	}
}