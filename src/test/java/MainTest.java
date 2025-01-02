import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MainTest {

    private WebDriver driver;
    private PageHomeMTS pageHomeMTS;


    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        pageHomeMTS = new PageHomeMTS(driver);

        driver.get("https://www.mts.by/");
        driver.manage().window().maximize();

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.elementToBeClickable(pageHomeMTS.getAcceptButton()));
            pageHomeMTS.clickControl(pageHomeMTS.acceptButton);
        } catch (Exception e) {
            System.out.println("Failed to click the accept button: " + e.getMessage());
        }
    }


    @Test
    public void testBlockName() {
        String expectedText = "Онлайн пополнение без комиссии";
        String actualText = pageHomeMTS.getHeaderText();
        assertEquals(expectedText, actualText);
    }


    @Test
    public void testIconVisa() {
        assertTrue(pageHomeMTS.isVisaImagePresentForAll(pageHomeMTS.visaImage), "No Visa");
    }

    @Test
    public void testIconAll() {

        //для упрощения все в одном тесте
        assertTrue(pageHomeMTS.isVisaImagePresentForAll(pageHomeMTS.mastercardImage), "No mastercardImage");
        assertTrue(pageHomeMTS.isVisaImagePresentForAll(pageHomeMTS.mastercardSecureImage), "No mastercardSecureImage");
        assertTrue(pageHomeMTS.isVisaImagePresentForAll(pageHomeMTS.belImage), "No belImage");
        assertTrue(pageHomeMTS.isVisaImagePresentForAll(pageHomeMTS.visaImageVer), "No visaImageVer");

    }


    @Test
    public void testDetailsLink() {
        String initialUrl = driver.getCurrentUrl();
        pageHomeMTS.clickControl(pageHomeMTS.detailsLink);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe(initialUrl)));

        String newUrl = driver.getCurrentUrl();
        assertTrue(!newUrl.equals(initialUrl), "The page URL should change");
    }


    @Test
    public void testNextButton() {

        pageHomeMTS.writeField(pageHomeMTS.phoneField, "297777777");
        pageHomeMTS.writeField(pageHomeMTS.sumField, "22");
        pageHomeMTS.writeField(pageHomeMTS.mailField, "slj@sdsd.ru");

        pageHomeMTS.clickControl(pageHomeMTS.nextButton);


        String initialUrl = driver.getCurrentUrl();
        pageHomeMTS.clickControl(pageHomeMTS.detailsLink);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe(initialUrl)));

        String newUrl = driver.getCurrentUrl();
        assertTrue(!newUrl.equals(initialUrl), "The page URL should change");
    }


    @AfterEach
    public void tearDown() {
        driver.quit();
    }

}