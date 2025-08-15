package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) throws InterruptedException {
		//launch the Browser
		ChromeDriver driver = new ChromeDriver();

		// Navigate to Amazon
		driver.get("https://www.amazon.in");   
		driver.manage().window().maximize();
		// Search for phones
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("phones");
		searchBox.submit();
		List<WebElement> phonePrices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Integer> prices = new ArrayList<>();
		for (WebElement price : phonePrices) {
			prices.add(Integer.parseInt(price.getText().replace(",", "")));
		}
		// Sort phone prices
		Collections.sort(prices);
		// Find the lowest price
		int lowestPrice = prices.get(0);
		System.out.println("The lowest phone price is: " + lowestPrice);
		// Close the browser
		driver.quit();
	}

	private static java.time.Duration DurationofSeconds(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}

