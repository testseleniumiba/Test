package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ProfilePage {

    //конструктор класса, занимающийся инициализацией полей класса
    public WebDriver driver;
    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    //определение локатора меню профиля
    @FindBy(xpath = "/html/body/div[1]/header/div[7]/details/summary/img")
    private WebElement userMenu;

    //определение локатора имени пользователя
    @FindBy(xpath = "/html/body/div[4]/main/div[2]/div/div[1]/div/div[2]/div[2]/h1/span[2]")
    private WebElement userNameSurname;

    //определение локатора кнопки выхода из аккаунтa
    @FindBy(xpath = "/html/body/div[1]/header/div[7]/details/details-menu/form/button")
    private WebElement logoutBtn;

    //определение локатора кнопки для перехода на страницу профиля
    @FindBy(xpath = "/html/body/div[1]/header/div[7]/details/details-menu/a[1]")
    private WebElement yourProfile;


    //метод для получения имени пользователя из меню пользователя
    public String getUserName() {
        String userName = userNameSurname.getText();
        return userName; }

    //метод для нажатия кнопки меню пользователя
    public void entryMenu() {
        userMenu.click();}

    //метод для нажатия кнопки для перехода на страницу профиля
    public void yourProfile() {
        yourProfile.click();}

    //метод для нажатия кнопки выхода из аккаунта
    public void userLogout() {
        logoutBtn.click(); }
    }