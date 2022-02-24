package stepDefintion;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homeloans {

	@Given("^Validate the browser$")
	public void validate_the_browser() throws Throwable {
		System.out.println("Background given conditions");
	}

	@When("^Browser is triggered$")
	public void browser_is_triggered() throws Throwable {
		System.out.println("Background When");
	}

	@Then("^check if browser is started$")
	public void check_if_browser_is_started() throws Throwable {
		System.out.println("Background Then");
	}


	@Given("^user is on Nab Website$")
	public void user_is_on_nab_website()  {
		System.out.println("Given printed - User is on nab landing");
	}

	@And("^user tab on  home loan section")
	public void user_tab_on_home_loan_sections() throws Throwable {
		System.out.println("user tapped on home loan element");
	}

	@When("^user tap on loan book an appointment section$")
	public void user_tap_on_loan_book_an_appointment_section() {
		System.out.println("Then - new page opened");
	}

	@And("^user tap on continue$")
	public void user_tap_on_continue() {
		System.out.println("And statement - continue tapped");
	}

	@And("^user tap on newHomeLoans$")
	public void user_tap_on_newHomeLoans() {
		System.out.println("And statement - newHomeLoans tapped");
	}

	@And("^user tap on next$")
	public void user_tap_on_next() {
		System.out.println("And statement - next tapped");
	}
	@And("^user tap on buynewpty$")
	public void user_tap_on_buynewpty() {
		System.out.println("And statement - buy new property tapped");
	}
	@And("^user tap on Next$")
	public void user_tap_on_Next() {
		System.out.println("And statement - next tapped");
	}
	@And("^user tap on No$")
	public void user_tap_on_No() {
		System.out.println("And statement - next tapped");
	}    
	@When("^user fill the form$")
	public void user_fill_the_form(String firstname, String lastname, String state, String phonenumber,String email) {
		System.out.println("form fill up ");
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(state);
		System.out.println(phonenumber);
		System.out.println(email);
	} 
	@Then("^User validate the outcomes")
	public void User_validate_the_outcomes() {

		System.out.println("info validated ");

	}
	@And ("^User tap on submit")
	public void User_tap_on_submit() {

		System.out.println("Submit button tapped ");

	}
}




