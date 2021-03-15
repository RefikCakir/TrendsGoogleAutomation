package com.trendsGoogle.stepDefinitions;


import com.trendsGoogle.pages.ComparePage;
import com.trendsGoogle.pages.ExplorePage;
import com.trendsGoogle.pages.HomePage;
import com.trendsGoogle.utils.Browser;
import com.trendsGoogle.utils.ConfigurationReader;
import com.trendsGoogle.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class GoogleTrend_StepDefinitions {
    Browser browser = new Browser() ;


public HomePage homePage = new HomePage() ;
public ExplorePage explorePage = new ExplorePage();
public ComparePage comparePage = new ComparePage() ;

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user enter {string} in input box")
    public void user_enter_in_input_box(String string) {
        homePage.enterInput(string);
    }
    @Then("user navigates to {string} page")
    public void user_navigates_to_page(String string) {
     explorePage.PageName();
     Assert.assertTrue( Driver.getDriver().getTitle().contains(string));
    }

    @Then("user enter {string} to the +Compare field")
    public void user_enter_to_the_compare_field(String string) {
        explorePage.compareSearchBox(string);
    }

    @Then("user should be on compare page")
    public void user_should_be_on_compare_page() {
        comparePage.getComparePageName();
        Assert.assertTrue( comparePage.toString().contains("Compare"));
    }

    @Then("user select filters")
    public void user_select_filters() throws InterruptedException {
        comparePage.selectLocation("New York");
       Thread.sleep(3);
       comparePage.selectTime();
    }

    @Then("user select compare breakdown by metro")
    public void user_select_compare_breakdown_by_metro() { }

    @Then("user verify percentual ratio")
    public void user_verify_percentual_ratio() {
        comparePage.getPercentual() ;
    }
}
