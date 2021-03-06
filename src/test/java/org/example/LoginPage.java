package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {

    //конструктор класса, занимающийся инициализацией полей класса
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    //определение локатора кнопки входа
    @FindBy(xpath = "/html/body/div[3]/main/div/div[4]/form/input[14]")
    private WebElement loginBtn;

    //определение локатора поля ввода логина
    @FindBy(xpath = "//*[@id=\"login_field\"]")
    private WebElement loginField;

    //определение локатора поля ввода пароля
    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement passwdField;


    //метод для ввода логина
    public void inputLogin(String login) {
        loginField.sendKeys(login); }

    //метод для ввода пароля
    public void inputPasswd(String passwd) {
        passwdField.sendKeys(passwd); }

    //метод для осуществления нажатия кнопки входа в аккаунт
    public void clickLoginBtn() {
        loginBtn.click(); }

}