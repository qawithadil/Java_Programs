package selPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/drivers/chromedriver.exe");
		/*
		 * Chrome Driver initialization
		 */
		WebDriver driver = new ChromeDriver();
		// RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		/*
		 * Get the title of the page
		 */
		String pageTitle = driver.getTitle();
		System.out.println("Page Title =" + pageTitle);
		/*
		 * Get the current opened URL
		 */
		System.out.println("Current URI=" + driver.getCurrentUrl());
		driver.close();

	}

}
