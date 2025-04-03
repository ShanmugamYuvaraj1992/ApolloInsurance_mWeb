import Utility.BrowserType;
import org.testng.annotations.Test;

public class EndToEndTest extends BaseClass{
    public EndToEndTest() {
        super(BrowserType.SAFARI);
    }

    @Test
    public void testEndToEnd() {
        // Launch the URL
        launchUrl();

        quitDriver();
    }
}
