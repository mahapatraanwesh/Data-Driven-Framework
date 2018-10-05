package scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import generics.Auto_Constant;
import generics.Excel;
public class Loginsearch implements Auto_Constant 
{
	static
	{
		System.setProperty(key,value);
	}
	public static void main(String[] args) throws InterruptedException 
	{
		String un=Excel.demo(excelpath,"Sheet1",0,0);
		String pwd=Excel.demo(excelpath,"Sheet1",1,0);
		String search=Excel.demo(excelpath,"Sheet1",3,0);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
		driver.findElement(By.name("email")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys(search);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconUser sprites-user']"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.=' Logout ']")).click();
		String t=driver.getTitle();
		System.out.println(t);
		String u=driver.getCurrentUrl();
		System.out.println(u);
		if(t.equals("Football Shoes - Buy Football Studs Online for Men & Women in India"))
		{
			System.out.println("Pass-Homepage displayed");
		}
		else
		{
			System.out.println("Fail-Homepage not displayed");
		}
	}
}