package practice_examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testingPurpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//form[@class='XFYOY']//div")).click();
		//driver.findElement(By.id("forgot-password-link")).click();
		//System.out.println(driver.findElements(By.className("sqdOP.L3NKy")).size());
		WebElement email= driver.findElement(By.xpath("//input[@name='emailOrPhone']"));
		email.sendKeys("devyanighike@yahoo.co.in");
		WebElement fname= driver.findElement(By.cssSelector("input[aria-label='Full Name']"));
		System.out.println(fname.getLocation());
		fname.sendKeys("devyani");
		WebElement uname= driver.findElement(By.cssSelector("input[aria-label='Username']"));
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.PAGE_DOWN).build().perform();
		ac.sendKeys(fname, Keys.chord(Keys.CONTROL,"a")).perform();
		ac.sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();
		ac.sendKeys(uname,Keys.chord(Keys.CONTROL,"v")).perform();
		
	WebElement pwd=driver.findElement(By.xpath("//input[@type='password']"));
	//WebDriverWait w=new WebdriverWait(driver,200)
			//w.Until(ExpectedConditions.)
		pwd.sendKeys("abc@123");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		/*System.out.println(wm.getText());
		System.out.println(wm.hashCode());
		wm.click();
		

		//Actions ac = new Actions(driver);
		//ac.moveToElement(wm);*/
	}

}
