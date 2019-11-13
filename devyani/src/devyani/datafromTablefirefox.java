package devyani;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class datafromTablefirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.9.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.cricbuzz.com/cricket-series/2900/icc-mens-t20-world-cup-qualifier-2019/points-table");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		WebElement table=driver.findElement(By.xpath("//table[@class='table cb-srs-pnts']"));
//List<WebElement> teamname=table.findElements(By.xpath("//tbody//tr//td"));
List<WebElement> teamcl=table.findElements(By.xpath("//table//tbody//tr[6]//td/a"));

//System.out.print(teamname.get(0).getText());
System.out.print(teamcl.get(0).getText());
int i;
for(i=0;i<8;i++)
{
	//System.out.print(teamname.get(i).getText() + "\t");
}
	
	}

}
