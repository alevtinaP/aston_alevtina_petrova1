import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MainTest {

    private WebDriver driver;
    private PageHomeMTS pageHomeMTS;
    private PagePopupService pagePopupService;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        pageHomeMTS = new PageHomeMTS(driver);
        pagePopupService = new PagePopupService(driver);

        driver.get("https://www.mts.by/");
        driver.manage().window().maximize();

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.elementToBeClickable(pageHomeMTS.getAcceptButton()));

            pageHomeMTS.clickControl(pageHomeMTS.acceptButton);
        } catch (Exception e) {
            System.out.println("Failed to click the accept button: " + e.getMessage());
        }

        Actions actions = new Actions(driver);
        actions.moveToElement(pageHomeMTS.acceptButton).perform();

    }


    @Test
    public void testBlockName() {
        String expectedText = "Онлайн пополнение без комиссии";
        String actualText = pageHomeMTS.getHeaderText();
        assertEquals(expectedText, actualText);
    }


    @Test
    public void testIconVisa() {
        assertTrue(pageHomeMTS.isElementPresent(pageHomeMTS.visaImage), "No Visa");
    }

    @Test
    public void testIconAll() {

        //для упрощения все иконки платежных систем в одном тесте
        assertTrue(pageHomeMTS.isElementPresent(pageHomeMTS.mastercardImage), "No mastercardImage");
        assertTrue(pageHomeMTS.isElementPresent(pageHomeMTS.mastercardSecureImage), "No mastercardSecureImage");
        assertTrue(pageHomeMTS.isElementPresent(pageHomeMTS.belImage), "No belImage");
        assertTrue(pageHomeMTS.isElementPresent(pageHomeMTS.visaImageVer), "No visaImageVer");

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

        pageHomeMTS.fillField(pageHomeMTS.phoneField, "297777777");
        pageHomeMTS.fillField(pageHomeMTS.sumField, "22");
        pageHomeMTS.fillField(pageHomeMTS.mailField, "mail@mail.ru");

        pageHomeMTS.clickControl(pageHomeMTS.nextButton);


        String initialUrl = driver.getCurrentUrl();
        pageHomeMTS.clickControl(pageHomeMTS.detailsLink);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe(initialUrl)));

        String newUrl = driver.getCurrentUrl();
        assertTrue(!newUrl.equals(initialUrl), "The page URL should change");
    }


    //16HW

    @Test
    public void testPlaceholdersService() {
        String expectedText = "Номер телефона";
        assertEquals(expectedText, pageHomeMTS.getContainsText(pageHomeMTS.phonePlaceholder), "The placeholder should contain the text 'phonePlaceholder'");

        String expectedTextSum = "Сумма";
        assertEquals(expectedTextSum, pageHomeMTS.getContainsText(pageHomeMTS.sumPlaceholder), "The placeholder should contain the text 'sumPlaceholder'");

        String expectedTextMail = "E-mail для отправки чека";
        assertEquals(expectedTextMail, pageHomeMTS.getContainsText(pageHomeMTS.mailPlaceholder), "The placeholder should contain the text 'expectedTextMail'");

    }


    @Test
    public void testPlaceholdersHomeInet() {
        pageHomeMTS.clickControl(pageHomeMTS.dropdownArrow);
        pageHomeMTS.clickControl(pageHomeMTS.dropdownHomeInet);


        String expectedText = "Номер абонента";
        assertEquals(expectedText, pageHomeMTS.getContainsText(pageHomeMTS.phoneAbonent), "The placeholder should contain the text 'phoneAbonent'");

        String expectedTextSum = "Сумма";
        assertEquals(expectedTextSum, pageHomeMTS.getContainsText(pageHomeMTS.sumPlaceholder), "The placeholder should contain the text 'sumPlaceholder'");

        String expectedTextMail = "E-mail для отправки чека";
        assertEquals(expectedTextMail, pageHomeMTS.getContainsText(pageHomeMTS.mailPlaceholder), "The placeholder should contain the text 'expectedTextMail'");
    }


    @Test
    public void testPlaceholdersInstallment() {


        pageHomeMTS.clickControl(pageHomeMTS.dropdownArrow);
        pageHomeMTS.clickControl(pageHomeMTS.dropdownInstallment);


        String expectedText = "Номер счета на 44";
        assertEquals(expectedText, pageHomeMTS.getContainsText(pageHomeMTS.accNumber), "The placeholder should contain the text 'accNumber'");

        String expectedTextSum = "Сумма";
        assertEquals(expectedTextSum, pageHomeMTS.getContainsText(pageHomeMTS.sumPlaceholder), "The placeholder should contain the text 'sumPlaceholder'");

        String expectedTextMail = "E-mail для отправки чека";
        assertEquals(expectedTextMail, pageHomeMTS.getContainsText(pageHomeMTS.mailPlaceholder), "The placeholder should contain the text 'expectedTextMail'");
    }


    @Test
    public void testPlaceholdersDebt() {


        pageHomeMTS.clickControl(pageHomeMTS.dropdownArrow);
        pageHomeMTS.clickControl(pageHomeMTS.dropdownDebt);


        String expectedText = "Номер счета на 2073";
        assertEquals(expectedText, pageHomeMTS.getContainsText(pageHomeMTS.accNumberDebt), "The placeholder should contain the text 'dropdownDebt'");

        String expectedTextSum = "Сумма";
        assertEquals(expectedTextSum, pageHomeMTS.getContainsText(pageHomeMTS.sumPlaceholder), "The placeholder should contain the text 'sumPlaceholder'");

        String expectedTextMail = "E-mail для отправки чека";
        assertEquals(expectedTextMail, pageHomeMTS.getContainsText(pageHomeMTS.mailPlaceholder), "The placeholder should contain the text 'expectedTextMail'");
    }


    @Test
    public void testServiceSumm() {

        pageHomeMTS.fillField(pageHomeMTS.phoneField, "297777777");
        pageHomeMTS.fillField(pageHomeMTS.sumField, "22");
        pageHomeMTS.fillField(pageHomeMTS.mailField, "mail@mail.ru");
        pageHomeMTS.clickControl(pageHomeMTS.nextButton);

        //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@data-tagging-id='G-7C99PNNT06']")));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("bepaid-iframe")));


        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'BYN')]")));



        String expectedText = "22.00 BYN";
        assertEquals(expectedText, pageHomeMTS.getTextFromElement(pagePopupService.SumHeaderPopupCSS), "The placeholder should contain the text 'expectedText'");


        pageHomeMTS.fillField(pagePopupService.CartNumberField, "4111 1111 1111 1111");
        pageHomeMTS.fillField(pagePopupService.yymmField, "1125");
        pageHomeMTS.fillField(pagePopupService.csvField, "222");

        pageHomeMTS.fillField(pagePopupService.nameField, "name mame");


        String expectedTextButton = "Оплатить 22.00 BYN";
        assertEquals(expectedTextButton, pageHomeMTS.getTextFromElement(pagePopupService.ButtonPayXpath), "The placeholder should contain the text 'expectedText'");

    }


    @Test
    public void testServicePhone() {

        String phoneExpected = "Оплата: Услуги связи Номер:375297777777";

        pageHomeMTS.fillField(pageHomeMTS.phoneField, "297777777");
        pageHomeMTS.fillField(pageHomeMTS.sumField, "22");
        pageHomeMTS.fillField(pageHomeMTS.mailField, "mail@mail.ru");

        pageHomeMTS.clickControl(pageHomeMTS.nextButton);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("bepaid-iframe")));

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'BYN')]")));

        assertEquals(phoneExpected, pageHomeMTS.getTextFromElement(pagePopupService.lablePhoneNumber), "The placeholder should contain the text 'phoneExpected'");

    }


    @Test
    public void testCardField() {

        String phoneExpected = "Оплата: Услуги связи Номер:375297777777";

        pageHomeMTS.fillField(pageHomeMTS.phoneField, "297777777");
        pageHomeMTS.fillField(pageHomeMTS.sumField, "22");
        pageHomeMTS.fillField(pageHomeMTS.mailField, "mail@mail.ru");

        pageHomeMTS.clickControl(pageHomeMTS.nextButton);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("bepaid-iframe")));

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'BYN')]")));

        String textExpected = "Номер карты";

        assertEquals(phoneExpected, pageHomeMTS.getTextFromElement(pagePopupService.lablePhoneNumber), "The placeholder should contain the text 'textExpected'");

    }


    @Test
    public void testCardsIcon() {

        String phoneExpected = "Оплата: Услуги связи Номер:375297777777";

        pageHomeMTS.fillField(pageHomeMTS.phoneField, "297777777");
        pageHomeMTS.fillField(pageHomeMTS.sumField, "22");
        pageHomeMTS.fillField(pageHomeMTS.mailField, "mail@mail.ru");

        pageHomeMTS.clickControl(pageHomeMTS.nextButton);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("bepaid-iframe")));

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'BYN')]")));


        assertTrue(pageHomeMTS.isElementPresent(pagePopupService.iconVisaFrame), "No iconVisaFrame");
        assertTrue(pageHomeMTS.isElementPresent(pagePopupService.iconMasterFrame), "No iconMasterFrame");
        assertTrue(pageHomeMTS.isElementPresent(pagePopupService.iconBelFrame), "No iconBelFrame");
        assertTrue(pageHomeMTS.isElementPresent(pagePopupService.iconMaestroFrame), "No iconMaestroFrame");

    }


    @AfterEach
    public void tearDown() {
        driver.quit();
    }

}


