package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostsSetps {
    @Given("user should be logged in and must present on his wall")
    public void userShouldBeLoggedInAndMustPresentOnHisWall() {
        System.out.println("userShouldBeLoggedInAndMustPresentOnHisWall");
    }

    @When("user type the message in message box")
    public void userTypeTheMessageInMessageBox() {
        System.out.println("userTypeTheMessageInMessageBox");
    }



    @Then("message should be get posted")
    public void messageShouldBeGetPosted() {
        System.out.println("messageShouldBeGetPosted");
    }

    @When("User supply the youtube link to the test box")
    public void userSupplyTheYoutubeLinkToTheTestBox() {
        System.out.println("userSupplyTheYoutubeLinkToTheTestBox");
    }



    @Then("video should be get posted on wall")
    public void videoShouldBeGetPostedOnWall() {
        System.out.println("videoShouldBeGetPostedOnWall");
    }

    @And("video should have proper thumbnails")
    public void videoShouldHaveProperThumbnails() {
        System.out.println("videoShouldHaveProperThumbnails");
    }

    @And("click on post Message Button")
    public void clickOnPostMessageButton() {
        System.out.println("clickOnPostMessageButton");
    }

    @And("click on post button")
    public void clickOnPostButton() {
        System.out.println("clickOnPostButton");
    }
}
