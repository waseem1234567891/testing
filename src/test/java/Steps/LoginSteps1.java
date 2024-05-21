package Steps;





import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import java.util.List;


public classt LoginSteps1 {
    @Given("User is on login page of the Application")
    public void user_is_on_login_page_of_the_application() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on login page of the Application");
    }
    @When("user login with following user name and password")
    public void user_login_with_following_user_name_and_password(DataTable dataTable) {

        List<List<String>> lists = dataTable.asLists();
        for (List<String> mylist:lists)
        {
            for (String s:mylist)
            {
                System.out.println(s);
            }
        }

    }
    @Then("user will login with correct user name and password")
    public void user_will_login_with_correct_user_name_and_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user will login with correct user name and password");
    }
    }

