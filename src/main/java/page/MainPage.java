package page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public static By fillingTab = By.cssSelector(".tab_tab__1SPyG:nth-child(3)");
    public static By sauceTab = By.cssSelector(".tab_tab__1SPyG:nth-child(2)");
    public static By bunTab = By.cssSelector(".tab_tab__1SPyG:nth-child(1)");
    public static By orderButton = By.xpath(".//button[text()='Оформить заказ']");

    private final By kabinetButton = By.xpath(".//a[@href='/account']");
    private final By loginButton = By.xpath(".//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg']");

    @Step("Нажмите кнопку заполнения")
    public void clickCabinetButton() {
        driver.findElement(kabinetButton).click();
    }

    @Step("Нажмите кнопку входа")
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    @Step("Кнопка ожидания заказа кликабельна")
    public static void waitOrderButtonClickable(WebDriver driver) {
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(orderButton));
    }

    @Step("Нажмите кнопку вкладки")
    public void clickTabButton(String name) {
        By tabButton = By.xpath(".//span[text()='" + name + "']");
        driver.findElement(tabButton).click();
    }
}