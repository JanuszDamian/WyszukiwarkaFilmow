package pl.JDD.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(id = "imdbHeader-navDrawerOpen")
    private WebElement menuButton;

    @FindBy(xpath = "//span[text()='Top 250 Movies']")
    private WebElement top250MoviesButton;

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public Top250Movie openTop250Movie() {
        menuButton.click();
        top250MoviesButton.click();
        return new Top250Movie(driver);
    }
}
