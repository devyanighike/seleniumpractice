package devyani;

import java.awt.Robot;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Weblinks_webpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.santabanta.com");
		// System.out.print(driver.getPageSource());
		driver.manage().window().maximize();
		//Robot rb=new Robot();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		List<WebElement> weblinks = driver.findElements(By.tagName("a"));
		List<WebElement> iFrames = driver.findElements(By.tagName("iframe"));
		int size = weblinks.size();
		int size1 = iFrames.size();
		System.out.print(size + "\n");
		System.out.print(size1);
		driver.switchTo().frame("aswift_1");
		//creating javascript alert
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('my name is devyani');");
		driver.switchTo().alert().accept();
		Actions ac = new Actions(driver);
		//diff ways of scrolling down--
		ac.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		//ac.sendKeys(Keys.PAGE_DOWN).build().perform();
	}
}