package ATP_Lyocsa.InteliJ.mavenProjectCMD.src.test.zadanie23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class B {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.msedge.driver","resources/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        //System.setProperty("webdriver.gecko.driver","resources/geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();
        //System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        driver.get("https://www.dovoznakupov.sk");
        Thread.sleep(3000);

        driver.close();
        driver.quit();
    }
}
