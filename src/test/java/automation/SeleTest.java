package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleTest {

	@Test
	public void demo1() {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.close();
	}

	@Test
	public void demo2() {
		System.out.println("demo2");

	}

}
