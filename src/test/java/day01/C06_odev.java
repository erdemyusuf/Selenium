package day01;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_odev {
    public static void main(String[] args) throws InterruptedException {

/*

Yeni bir package olusturalim : day01
Yeni bir class olusturalim : C03_GetMethods
Amazon sayfasina gidelim. https://www.amazon.com/
Sayfa basligini(title) yazdirin
Sayfa basliginin “Amazon” icerdigini test edin
Sayfa adresini(url) yazdirin
Sayfa url’inin “amazon” icerdigini test edin.
Sayfa handle degerini yazdirin
Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
Sayfayi kapatin.
 */
// odev1 : ----------------------------------------------------------------------------------------------------------
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver elma=new ChromeDriver();
        elma.manage().window().maximize();
        //  Yeni bir package olusturalim : day01
        //   Yeni bir class olusturalim : C03_GetMethods
        //  Amazon sayfasina gidelim. https://www.amazon.com/
        elma.get("https://www.amazon.com");
        //   Sayfa basligini(title) yazdirin
        System.out.println("elma.getTitle() = " + elma.getTitle());
        //  Sayfa basliginin “Amazon” icerdigini test edin
        elma.getTitle().contains("Amazon");
        //  Sayfa adresini(url) yazdirin
        System.out.println("elma.getCurrentUrl() = " + elma.getCurrentUrl());
        //  Sayfa url’inin “amazon” icerdigini test edin.
        elma.getCurrentUrl().contains("amazon");
        //          Sayfa handle degerini yazdirin
        System.out.println("elma.getWindowHandle() = " + elma.getWindowHandle());
        //  Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        System.out.println("elma.getPageSource().contains(\"Gateway\") = " + elma.getPageSource().contains("Gateway"));
        //   Sayfayi kapatin.
        elma.close();
// odev 2 : -------------------------------------------------------------------------------------------------------------------------
        //   Yeni bir Class olusturalim.C05_NavigationMethods
        // Youtube ana sayfasina gidelim . https://www.youtube.com/
        WebDriver karpuz=new ChromeDriver();
        karpuz.manage().window().maximize();
        karpuz.navigate().to("https://www.youtube.com");
        //  Amazon soyfasina gidelim. https://www.amazon.com/
        karpuz.get("https://www.amazon.com");
        //  Tekrar YouTube’sayfasina donelim
        karpuz.navigate().back();
        // Yeniden Amazon sayfasina gidelim
        karpuz.navigate().forward();
        Thread.sleep(5000);
        // Sayfayi Refresh(yenile) yapalim
        karpuz.navigate().refresh();
        Thread.sleep(5000);
        // Sayfayi kapatalim / Tum sayfalari kapatalim
        karpuz.quit();



    }
}
