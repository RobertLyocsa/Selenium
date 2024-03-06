package ATP_Lyocsa.InteliJ.mavenProjectCMD.src.test.zadanie23;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);

        driver.manage().window().maximize();
        driver.get("https://www.dovoznakupov.sk/");
        driver.findElement(By.id("agy-accept")).click();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.findElements(By.linkText("Alkohol")).get(1).click();
        driver.findElement(By.linkText("Šampanské")).click();
        driver.findElements(By.linkText("Pivo")).get(1).click();
        driver.findElements(By.linkText("Víno")).get(1).click();
        driver.findElement(By.linkText("Nealkoholické nápoje")).click();
        driver.findElements(By.linkText("Pochutiny")).get(1).click();

        Thread.sleep(2000);
        driver.close();
        driver.quit();

    }
}