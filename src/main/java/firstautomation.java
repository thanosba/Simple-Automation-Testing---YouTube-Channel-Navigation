import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class firstautomation {
    @Test
    public void test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/IdeaProjects/firstautomationapp/src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.youtube.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("search")).sendKeys("Post Malone - rockstar ft. 21 Savage");
        driver.findElement(By.id("search-icon-legacy")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("logo-icon-container")).click();
        Thread.sleep(7000);
        driver.get("http://www.youtube.com/watch?v=UceaB4D0jpo");
        driver.findElement(By.id("search")).sendKeys("Simple Automation - Thanks for watching !!! :) :)");
        //driver.findElement(By.id("search")).sendKeys(Keys.DELETE);
        Thread.sleep(33000);
        driver.close();
        driver.quit();
    }
}

