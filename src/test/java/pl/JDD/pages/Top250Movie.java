package pl.JDD.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Top250Movie {

    @FindBy(xpath = "//button[@data-testid='filter-menu-button']")
    private WebElement filterButton;

    @FindBy(xpath = "//span[contains(text(), 'Drama')]")
    private WebElement dramaButton;

    public WebDriver driver;

    public Top250Movie(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public SelectedMovies openSelectedMovies() {
        filterButton.click();
        dramaButton.click();
        return new SelectedMovies(driver);
    }


}
