package example5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class web2 {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\supriya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  WebDriver d1;
	  d1=new ChromeDriver();
	  d1.get("https://phptravels.com/demo/");
  }

}
