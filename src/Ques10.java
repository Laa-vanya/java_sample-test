import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques10 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","G:\\selenium workspace\\Test6\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/offers/quirky");
		WebElement interv = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
	}
}
