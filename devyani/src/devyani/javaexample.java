package devyani;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class javaexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Chrome driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
//driver.get("https://www.yahoo.co.in");
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
WebElement ele=driver.findElement(By.xpath("//span[@classname ='span.1QZ6fC _3Lgyp8']"));

Actions ac=new Actions(driver);
ac.moveToElement(ele);


//driver.manage().window().wait(2000);
driver.findElement(By.linkText("Finance")).click();
driver.findElement(By.xpath("//a[@id='uh-signedin']")).click();
driver.findElement(By.id("persistent")).isSelected();
System.out.print(driver.findElement(By.id("persistent")).isSelected());

boolean status = driver.findElement(By.id("persistent")).isSelected();
if (status==true)
{
	driver.findElement(By.id("persistent")).click();

}
}
}