package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAndAlerts {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		// Switch to the frame
		driver.switchTo().frame("iframeResult");
		// Click the button to trigger prompt alert
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		// Handle alert
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("TestLeaf");
		alert.accept(); // or alert.dismiss();
		// Verify the displayed text
		String resultText = driver.findElement(By.id("demo")).getText();
		if (resultText.contains("TestLeaf")) {
			System.out.println("✅ Test Passed: Text is displayed correctly.");
		} else {
			System.out.println("❌ Test Failed: Text mismatch.");
		}
		driver.close();
	}
}

