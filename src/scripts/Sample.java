package scripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Sample
{
@FindBy(name="email")
private WebElement untb;
@FindBy(name="password")
private WebElement pwdtb;
@FindBy(xpath="//button[text()='Log in']")
private WebElement subbtn;
	public Sample(WebDriver driver)
	{
		PageFactory.initElements(driver,this);	
	}
	public void username(String un)
	{
		untb.sendKeys(un);
	}
	public void password(String pw)
	{
		pwdtb.sendKeys(pw);
	}
	public void submit()
	{
		subbtn.submit();
	}
}
