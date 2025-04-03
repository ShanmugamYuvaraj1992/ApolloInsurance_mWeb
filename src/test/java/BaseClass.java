import Utility.BrowserType;
import Utility.ConfigLoader;
import Utility.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class BaseClass {
    private WebDriver driver;
    private ConfigLoader configLoader;

    public BaseClass(BrowserType browserType) {
        configLoader = new ConfigLoader();
        driver = WebDriverFactory.createWebDriver(browserType);
    }

    public void launchUrl() {
        String url = configLoader.getProperty("mWebUrl");
        driver.get(url);
        driver.manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}