package week4.day2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCWindowHandling {
	public static void main(String[] args) {

		// load the url
		ChromeDriver driver = new ChromeDriver();

		// Load the IRCTC website
		driver.get("https://www.irctc.co.in/");

		// Maximize the window
		driver.manage().window().maximize();

		// Get the parent window address
		String parentAddress = driver.getWindowHandle();
		System.out.println("The Parent Address is: " + parentAddress);

		// Click on the Flights link
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();

		// Get all window addresses
		Set<String> allAddress = driver.getWindowHandles();
		System.out.println("All all address is: " + allAddress);

		// Store addresses into a list
		List<String> addressList = new ArrayList<>(allAddress);

		// Switch to child window (Flights)
		driver.switchTo().window(addressList.get(1));

		// Get child window title
		String childTitle = driver.getTitle();
		System.out.println("Child Window Title: " + childTitle);

		// Switch back to parent window
		driver.switchTo().window(addressList.get(0));

		// Close parent window only
		driver.close();

		// Optional: Switch back to child to continue
		driver.switchTo().window(addressList.get(1));
	}
}

