package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	public WebDriver driver;
	public Pages page;
	
	
	
	@Given("Launch browser and Navigate to {string} gmail login page")
	public void launch_browser_and_navigate_to_gmail_login_page(String url) {
	  //  System.setProperty("webdriver.chrome.driver","C:\\Users\\MH\\Desktop\\ICONS\\IncubyteTest\\gmail\\Driver\\chromedriver.exe");
	  //  driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","F:\\aaaSoftwareTesting\\Setupfiles\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    page = new Pages(driver);
	    driver.manage().window().maximize();
	   // driver.manage().deleteAllCookies();
	    page.lunchandnavigate(url);
	}

	@When("User Enter Valid email {string} and click on next")
	public void user_enter_valid_email_and_click_on_next(String username) throws Throwable {
		page.enterCredentialu(username);
		page.clickNext();
		System.out.println("check");
	}

	@When("User Enter Valid password {string} and click on next")
	public void user_enter_valid_password_and_click_on_next(String password) {
		page.enterCredentialp(password);
		page.clickOnNext();
	}

	@When("Default gmail homepage display after login")
	public void default_gmail_homepage_display_after_login() {
		page.ondefualtpage();
	}

	@And("User click on Compose button on Default gmail homepage")
	public void user_click_on_compose_button_on_default_gmail_homepage() {
	    page.clickOnCompose();
	}

	@And("Window popup for Compose email")
	public void window_popup_for_compose_email() {
	    page.switchfocusonpopup();
	}

	@Then("user Enter {string} in subject text area and Enter {string} in body textarea")
	public void user_enter_in_subject_text_area_and_enter_in_body_textarea(String subject, String body) {
		page.fillupbodyandsubject(subject,body);
	}

}
