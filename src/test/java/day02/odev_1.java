package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class odev_1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        1.Yeni bir class olusturalim (Homework)
        2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) "facebook"
        oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        3.Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i
        yazdirin.
        4.https://www.walmart.com/ sayfasina gidin.
        5. Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
        6. Tekrar "facebook" sayfasina donun
        7. Sayfayi yenileyin
        8. Sayfayi tam sayfa (maximize) yapin
        9.Browser'i kapatin
    */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        String titleKelime = "facebook";
        if (driver.getTitle().contains(titleKelime)) {
            System.out.println("Facebook Title testi PASSED");
        }else {
            System.out.println("Facebook Title testi FAILED : " + driver.getTitle());
        }
        String urlKelime = "facebook";
        if (driver.getCurrentUrl().contains(urlKelime)) {
            System.out.println("Facebook Current URL testi PASSED");
        } else {
            System.out.println("Facebook Current URL tesi FAILED : " + driver.getCurrentUrl());
        }
        driver.navigate().to("https://walmart.com");
        String titleKelime2= "Walmart.com";
        if (driver.getTitle().contains(titleKelime2)) {
            System.out.println("Walmart Title testi PASSED");
        } else {
            System.out.println("Walmart Title testi FAILED : " + driver.getTitle());
        }
        Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.close();
        /*
        Facebook Title testi FAILED : Facebook - Giriş Yap veya Kaydol
        Facebook Current URL testi PASSED
        Walmart Title testi PASSED
         */
    }
}