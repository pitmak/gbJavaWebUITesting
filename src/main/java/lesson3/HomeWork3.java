package lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.Date;

public class HomeWork3 {
    public static void main(String[] args) throws InterruptedException {
        String mailBoxName = Arrays.stream(new Date().toString().split(" ")).limit(3).reduce((a, b) -> a + b).get();
        System.out.println(mailBoxName);
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//        driver.get("https://temp-mail.org/ru/");
//        String mailWindowHandle = driver.getWindowHandle();
//        WebElement webElement = driver.findElement(By.id("mail"));
//        String myNewMail = "";
//        while (!(myNewMail = webElement.getAttribute("value")).contains("@")) {
//            Thread.sleep(500);
//        }
        //String mailWindowHandle = driver.getWindowHandle();
//        WebElement webElement = driver.findElement(By.id("mail"));
//        String myNewMail = "";
//        while (!(myNewMail = webElement.getAttribute("value")).contains("@")) {
//            Thread.sleep(500);
//        }

//                driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://solo.nabiraem.ru/invite/115900");
        String soloWindowHandle = driver.getWindowHandle();

        driver.findElement(By.xpath("//button[@role='login']")).click();
  //      Thread.sleep(500);
        driver.findElement(By.xpath("//a[@href=\"#authbox-register\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"authbox-register\"]/descendant::input[@name=\"email\"]")).sendKeys(mailBoxName+"@mailinator.com");
        Thread.sleep(500);
        driver.findElement(By.xpath("//a[@id=\"sendcode\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//button[text()=\"Ok\"]")).click();
/*
        driver.switchTo().window(mailWindowHandle);
        driver.findElement(By.xpath("//span[text()=\"ЭргоСОЛО\"]")).click();*/
//        <input type="email" autocomplete="off" value="" class="form-control " id="form-email-email" name="email" placeholder="">
        //*[@id="form-email-email"]
//        "https://q.1001.ru/auth?api_client=5"
//                "https://solo.nabiraem.ru/invite/115900"   "https://solo.nabiraem.ru/"
    }
}
