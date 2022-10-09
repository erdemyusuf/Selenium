package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");


        System.out.println(driver.getWindowHandle()); // CDwindow-D6022DB060DD782131CEEE2958AF9B47 her sorguda degişir
        // farklı pencereler arasında gezinebilmek için getWindowHandle() methodunu kullanırız ?? acıklamayı dinle kayıttan
        //getWindowHandle()---> Icinde olunan sayfa ve/veya tab’larin handle degerlerini getirir

    }
}