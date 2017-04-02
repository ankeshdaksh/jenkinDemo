package combaba;

import org.openqa.selenium.support.PageFactory;
import utils.BrowserFactory;

/**
 * Created by Acer on 30/03/2017.
 */
public class BasePage extends BrowserFactory{
    public BasePage(){
        PageFactory.initElements(driver, this);
    }
}
