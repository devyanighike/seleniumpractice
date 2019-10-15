package practice_examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testingPurpose2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		//performs refresh of the browser
				js.executeScript("history.go(0)");
		//creates an alert
		js.executeScript("alert('hello Java Code Geeks');");
		
		//for clicking an element on webpage where element is ele
		//js.executeScript("arguments[0].click();",ele );
	  }
		
		
	}
	