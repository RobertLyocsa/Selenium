package ATP_Lyocsa.InteliJ.mavenProjectCMD.src.test.zadanie23;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class A {
    public static <WebDriver> void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver. chrome .driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000); // nechapem

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/contactForm.html");
        driver.findElement(By.className("feedback-input")).sendKeys("Peter");
        driver.findElement(By.cssSelector("[placeholder=\"Last Name\"]")).sendKeys("Mrkvička");
        driver.findElement(By.cssSelector("[placeholder=\"Email Address\"]")).sendKeys("email@email.com");
        driver.findElement(By.cssSelector("[placeholder=\"Comments\"]")).sendKeys("Testing in Sellenium");
        driver.findElement(By.cssSelector("[type=\"submit\"]")).click();


        WebElement expect = driver.findElement(By.cssSelector("h3"));
        System.out.println(expect.getText());

        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}