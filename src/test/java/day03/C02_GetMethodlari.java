package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_GetMethodlari {
    /*
    -Amazon sayfasına gidiniz
    -Arama kutusunu locate ediniz
    -Arama kutusunun tagName'inin input olduğunu test ediniz
    -Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
    -Sayfayı kapatınız
     */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

     //  -Amazon sayfasına gidiniz
        driver.get("https://amazon.com");

     //  -Arama kutusunu locate ediniz
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

     //  -Arama kutusunun tagName'inin input olduğunu test ediniz
        String expectedTagName="input";
        String actualTagName=aramaKutusu.getTagName();
        if(actualTagName.equals(expectedTagName)){
            System.out.println("tagname testi PASSED "+actualTagName);
        } else System.out.println("tagname testi FAILED");

     // -Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
        String expectedAttiributeName="field-keywords";
        String actualAttiributeName=aramaKutusu.getAttribute("name");
        if(actualAttiributeName.equals(expectedAttiributeName)){
            System.out.println("attiribute test PASSED");
        } else System.out.println("attiribute testi FAILED");

     // -Sayfayı kapatınız
        driver.close();


    }
}
