package devyani;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.spicejet.com");
        driver.manage().window().maximize();
        System.out.print(driver.getTitle());
      
        //driver.findElement(By.linkText("Hotels")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
driver.findElement(By.xpath("(//a[@value='CJB'])[2]")).click();
        boolean state= driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected();
        if (state==false)
        {
        	driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
        }
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("hrefIncAdt")).click();
        System.out.println(driver.findElement(By.id("divAdult")));
        int i;
        for (i=1;i<3;i++)
        {
        	driver.findElement(By.id("hrefIncAdt")).click();
        	
        }
    	driver.findElement(By.id("hrefIncInf")).click();
    	Thread.sleep(4000);
        driver.findElement(By.id("btnclosepaxoption")).click();
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
       //driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1'] //a[@value='IXB']")).click();
                /*driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
       System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")));
       //driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//ui[@value='IXB']")).click();
       System.out.println(driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//ui[@value='IXB']")));*/
        }

}
