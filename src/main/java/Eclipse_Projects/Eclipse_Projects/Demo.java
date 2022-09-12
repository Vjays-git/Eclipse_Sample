package Eclipse_Projects.Eclipse_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static WebDriver driver;
	
	public static void Initiate() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static void Initiateapp() {
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class = 'chNavIcon appendBottom2 chSprite chHotels']")).click();
		driver.findElement(By.xpath("//span[@class = 'chNavIcon appendBottom2 chSprite chHomestays']")).click();
		driver.findElement(By.xpath("//li[@class = 'removeItemMargin menu_Holidays']")).click();
		driver.findElement(By.xpath("//li[@class = 'menu_Trains']")).click();
		driver.findElement(By.xpath("//li[@class = 'menu_Buses']")).click();
		driver.findElement(By.xpath("//li[@class = 'menu_Cabs']")).click();
		driver.findElement(By.xpath("//li[@class = 'menu_Forex']")).click();
		driver.findElement(By.xpath("//li[@class = 'menu_Activities']")).click();
		String s = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")).getText();
		System.out.println(s);
		
	}
	
	public static void main(String[] args) {
		
		Initiate();
		Initiateapp();
	}

}
