package facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb_login 
{
	public void m1()
	{
		System.out.println("Hello java");
	}

	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32 74new\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.Facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.name("firstname")).sendKeys("Nvedita");
		driver.findElement(By.name("lastname")).sendKeys("Gorde");
		driver.findElement(By.name("reg_email__")).sendKeys("9168021666");
		driver.findElement(By.name("reg_passwd__")).sendKeys("7781@nivi");
		driver.findElement(By.id("day")).sendKeys("8");
		WebElement Radio_btn1=driver.findElement(By.xpath("//label[text()='Female']"));
		Radio_btn1.click();
		boolean Radio_btn1_display= Radio_btn1.isDisplayed();
		boolean Radio_btn1_select=Radio_btn1.isSelected();
		boolean Radio_btn1_enable=Radio_btn1.isEnabled();
		System.out.println("Is Female radio button displayed: "+Radio_btn1_display);
		System.out.println("Is Female radio button selected: "+Radio_btn1_select);
		System.out.println("Is Female radio button enable: "+Radio_btn1_enable);

		WebElement Radio_btn= driver.findElement(By.xpath("//label[text()='Male']"));
		Radio_btn.click();
		boolean Radio_btn_display =Radio_btn.isDisplayed();
		boolean Radio_btn_selected =Radio_btn.isSelected();
		boolean Radio_btn_enable=Radio_btn.isEnabled();
		System.out.println("Is Male radio button displayed: "+Radio_btn_display);
		System.out.println("Is Male radio button selected: "+Radio_btn_selected);
		System.out.println("Is Male radio button enable: "+Radio_btn_enable);


	}

}
