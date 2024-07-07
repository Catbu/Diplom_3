package page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By loginButton = By.xpath(".//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']");
    private final By emailInput = By.xpath(".//input[@name='name']");
    private final By passwordInput = By.xpath(".//input[@name='Пароль']");

    @Step("Нажмите кнопку входа")
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    @Step("Введите адрес электронной почты")
    public void inputEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    @Step("Введите пароль")
    public void inputPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }
}
