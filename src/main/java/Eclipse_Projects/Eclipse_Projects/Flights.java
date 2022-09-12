package Eclipse_Projects.Eclipse_Projects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {

	public static WebDriver driver;
	
	public static void Initiate() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void Initiateapp() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//input[@id = 'fromCity']")).click();
		driver.findElement(By.xpath("//p[@class = 'font14 appendBottom5 blackText']")).click();
		driver.findElement(By.xpath("//li[@id = 'react-autowhatever-1-section-0-item-2']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
		
		Boolean flag = false;
		
		while (!flag) {
			if(driver.findElements(By.xpath("//div[@class = 'DayPicker-Day'][contains(@aria-label,'Oct 31 2022')]")).size()>0) {
				driver.findElement(By.xpath("//div[@class = 'DayPicker-Day'][contains(@aria-label,'Oct 31 2022')]")).click();
				flag = true;
				Thread.sleep(3000);
			}
			else {
				driver.findElement(By.xpath("//span[@aria-label = 'Next Month']")).click();
			}
		
		
		}

		driver.findElement(By.xpath("//div[@data-cy='flightTraveller']")).click();
	    driver.findElement(By.xpath("//ul/li[@data-cy='adults-2']")).click();
	    driver.findElement(By.xpath("//ul/li[starts-with(.,'Business')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[2]/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")).click();
		driver.findElement(By.xpath("//*[@id=\"bookbutton-RKEY:86873ba3-e691-4862-aeb0-8203321d4c55:47_0\"]")).click();
	}
	
	public static void main(String[] args) throws InterruptedException {
		Initiate();
		Initiateapp();
	}
}
