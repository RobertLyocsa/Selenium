package Selenium.src;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe"); //nevie najst chromedriver.exe ..... nechapem, nerozumiem
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.cssSelector("<a href=\"/checkboxes\">Checkboxes</a>")).sendKeys("Zadanie");

        //check

        //uncheck

        Thread.sleep(3000);

        driver.close();
        driver.quit();
    }
}