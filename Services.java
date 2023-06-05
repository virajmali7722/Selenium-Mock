package FinalMock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Services {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		driver.findElement(By.xpath("(//div[@class='row app-navigator'])[1]")).click();
		Thread.sleep(1000);
		
		Actions a = new Actions(driver);
		
		WebElement sys = driver.findElement(By.xpath("//span[text()=' SALES']"));
		a.moveToElement(sys).perform();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()=' Services'])[1]")).click();
		
		driver.findElement(By.id("Services_listView_basicAction_LBL_ADD_RECORD")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("Services_editView_fieldName_servicename")).sendKeys("EasyServices");
		
		driver.findElement(By.id("s2id_autogen1")).click();
		driver.findElement(By.xpath("//div[text()='Days']")).click();
		
		driver.findElement(By.id("Services_editView_fieldName_qty_per_unit")).sendKeys("100");
		
		driver.findElement(By.id("Services_editView_fieldName_website")).sendKeys("www.services.com");
		
		driver.findElement(By.id("s2id_autogen3")).click();
		driver.findElement(By.xpath("//div[text()='Support']")).click();
		
		driver.findElement(By.id("s2id_autogen5")).click();
		driver.findElement(By.xpath("//div[text()='Support Group']")).click();
		
		driver.findElement(By.id("Services_editView_fieldName_sales_start_date")).click();
		driver.findElement(By.xpath("(//td[text()='1'])[1]")).click();
		driver.findElement(By.xpath("(//td[@class='fieldValue'])[1]")).click();
		
		driver.findElement(By.id("Services_editView_fieldName_sales_end_date")).click();
		driver.findElement(By.xpath("(//td[text()='2'])[1]")).click();
		driver.findElement(By.xpath("(//td[@class='fieldValue'])[1]")).click();
		
		driver.findElement(By.id("Services_editView_fieldName_start_date")).click();
		driver.findElement(By.xpath("(//td[text()='3'])[1]")).click();
		driver.findElement(By.xpath("(//td[@class='fieldValue'])[1]")).click();
		
		driver.findElement(By.id("Services_editView_fieldName_expiry_date")).click();
		driver.findElement(By.xpath("(//td[text()='4'])[1]")).click();
		driver.findElement(By.xpath("(//td[@class='fieldValue'])[1]")).click();
		
		driver.findElement(By.id("Services-editview-fieldname-unit_price")).sendKeys("500000");
		
		driver.findElement(By.id("Services_editView_fieldName_commissionrate")).sendKeys("33.33");
		
		driver.findElement(By.id("tax1_check")).click();
		
		driver.findElement(By.id("tax2_check")).click();
		
		driver.findElement(By.id("tax3_check")).click();
		
		driver.findElement(By.id("Services_editView_fieldName_purchase_cost")).sendKeys("1000000");
		
		driver.findElement(By.id("Services_editView_fieldName_description")).sendKeys("ThankYou!!!!!");
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='fa fa-user']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Sign Out")).click();
		
	}		

}
