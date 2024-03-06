package Selenium.src;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AAndB {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe"); //nevie najst chromedriver.exe ..... nechapem, nerozumiem

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.linkText("Checkboxes")).click();
        driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)")).click();

        try {
            // Add this line within a try-catch block
            Thread.sleep(3000); // Sleep for 1 second
        } catch (InterruptedException e) {
            // Handle the exception (e.g., log it or print a message)
            e.printStackTrace();
        }

        driver.close();
        driver.quit();
    }
}