package combaba;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.remote.RemoteWebDriver;
import utils.BrowserFactory;

import java.net.MalformedURLException;

/**
 * Created by Acer on 30/03/2017.
 */
public class Hooks {
    private Scenario scenario;
    @Before
    public void setUp() throws MalformedURLException {
        BrowserFactory.openBrowser();
    }

    public RemoteWebDriver driver;
    //public static String appURL = "http://www.google.com";


    @After
    public void tearDown(Scenario scenario){
        this.scenario = scenario;
        if (scenario.isFailed()){
            BrowserFactory.takeScreenShot(scenario);
        }else {
            BrowserFactory.closeBrowser();

        }


    }
}
