package SeleniumTest.SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GUITest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		
		String actualTitle = driver.getTitle();
		
		System.out.println("Actual Title is::" + actualTitle);
		
		if (actualTitle.equals("Google")) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		System.out.println("git test");
		driver.close();
		driver.quit();
		

	}

}
