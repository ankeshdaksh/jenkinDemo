package combaba;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(className = "ico-register")
    WebElement iconRegister;

    public void checkTitle(){
        String title = driver.getTitle();
       Assert.assertEquals(title, "nopCommerce demo store");
    }

}
