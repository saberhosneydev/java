package dev.saberhosney;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "./drivers/patched.exe");
        ChromeOptions options = new ChromeOptions();

        // Fixing 255 Error crashes
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        // Options to trick bot detection
        // Removing webdriver property
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.setExperimentalOption("useAutomationExtension", null);

        // Changing the user agent / browser fingerprint
        options.addArguments("window-size=1920,1080");
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36");

        // Other
        options.addArguments("disable-infobars");
        ChromeDriver driver = new ChromeDriver(options);
        driver.executeScript("Object.defineProperty(navigator, 'webdriver', {get: () => undefined})");
        driver.get("https://dodi-repacks.site/index.php/all-repacks-a-z/");

        System.out.println(driver.getTitle());
//        driver.close();
    }
}