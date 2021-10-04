import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class demoAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://oas.lpu.in/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys("jatin.watts1");
		//driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys("jatin@007");
		driver.findElement(By.name("username")).sendKeys("11905543");
		driver.findElement(By.name("userPassword")).sendKeys("Watts@007");
		driver.findElement(By.xpath("//*[@id=\"nonjavascriptrow\"]/div/div/div[2]/div/div/div[3]/div/button")).click();
	}

}
