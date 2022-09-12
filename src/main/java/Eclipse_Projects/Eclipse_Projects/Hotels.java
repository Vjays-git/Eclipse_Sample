package Eclipse_Projects.Eclipse_Projects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotels {
	public static WebDriver driver;
	
	public static void Initiate() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void Initiateapp() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class = 'chNavIcon appendBottom2 chSprite chHotels']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@data-cy = 'hotelCityLabel']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[@class = 'locusLabel appendBottom5'][contains(text(), 'Goa')]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[contains(text(),'CHECK-IN')]")).click();
		driver.findElement(By.xpath("//div[@aria-label = 'Sun Sep 11 2022']")).click();
		driver.findElement(By.xpath("//div[@aria-label = 'Wed Sep 14 2022']")).click();
		driver.findElement(By.xpath("//ul/li[@data-cy='adults-4']")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div/div[1]/div[4]/div[1]/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"hsw_search_button\"]")).click();
		
//		Boolean flag = false;
//		
//		while (!flag) {
//			if(driver.findElements(By.xpath("//div[@class = 'DayPicker-Day'][contains(@aria-label,'Sun Sep 11 2022')]")).size()>0) {
//				driver.findElement(By.xpath("//div[@class = 'DayPicker-Day'][contains(@aria-label,'Sun Sep 11 2022')]")).click();
//				flag = true;
//				Thread.sleep(3000);
//			}
//			else {
//				driver.findElement(By.xpath("//span[@aria-label = 'Next Month']")).click();
//			}
//		
//		
//		}
		
	}
	
	public static void main(String args[]) throws InterruptedException {
		Initiate();
		Initiateapp();
	}

}
