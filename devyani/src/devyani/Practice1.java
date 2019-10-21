package devyani;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.msn.com/en-in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//li[@role='presentation'][1]")).click();
        WebElement off= driver.findElement(By.className("office"));
        Actions ac1=new Actions(driver);
        ac1.moveToElement(off).perform();
        
        WebElement search= driver.findElement(By.xpath("//input[@type='search']"));
System.out.printf("values of class and tagname are" + search.getClass(),search.getTagName());
System.out.println(search.getSize());
        Actions ac= new Actions(driver);
        ac.keyDown(Keys.PAGE_DOWN);
        //ac.keyDown(Keys.SHIFT).sendKeys(search,"abc news").perform();
        driver.findElement(By.id("sb_form_go")).click();
        
	}

}
