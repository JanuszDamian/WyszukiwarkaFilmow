package pl.JDD.tests;

import org.testng.annotations.Test;
import pl.JDD.pages.HomePage;

public class SearchTest extends BaseTest{

    @Test
    public void searchMovieTest() {
        new HomePage(driver).openTop250Movie()
                .openSelectedMovies();

    }
}
