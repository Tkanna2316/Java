package testNg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg {
	   @Test
	    public void VerifyTitle(){
	    WebDriver driver = new FirefoxDriver();
	    driver.get("http://www.ebay.com/");
	    String pageTitle = driver.getTitle();
	    Assert.assertEquals(pageTitle,"Ebay");
	    driver.close();

	    }

}
