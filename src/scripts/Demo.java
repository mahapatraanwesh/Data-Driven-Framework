package scripts;
import org.openqa.selenium.chrome.ChromeDriver;
import generics.Auto_Constant;
import generics.Excel;
public class Demo implements Auto_Constant
{
	static
	{
		System.setProperty(key,value);
	}
public static void main(String[] args)
{
	String un=Excel.demo(excelpath,"Sheet1",0,0);
	String pwd=Excel.demo(excelpath,"Sheet1",1,0);
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
	Sample s=new Sample(driver);
	s.username(un);
	s.password(pwd);
	s.submit();
}
}