package scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import generics.Auto_Constant;
import generics.Excel;
public class Invalidlogin implements Auto_Constant 
{
	static
	{
		System.setProperty(key,value);
	}
	public static void main(String[] args) 
	{
		String un=Excel.demo(excelpath,"Sheet1",2,0);
		String pwd=Excel.demo(excelpath,"Sheet1",1,0);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
		driver.findElement(By.name("email")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		String t=driver.getTitle();
		System.out.println(t);
		String u=driver.getCurrentUrl();
		System.out.println(u);
		if(t.equals("Login"))
		{
			System.out.println("Pass-Homepage displayed");
		}
		else
		{
			System.out.println("Fail-Homepage not displayed");
		}
	}
}
