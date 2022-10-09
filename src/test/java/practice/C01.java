package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://youtube.com");
        driver.getTitle();
        driver.getCurrentUrl();
        driver.getWindowHandle();
        driver.getPageSource();



    }
}
