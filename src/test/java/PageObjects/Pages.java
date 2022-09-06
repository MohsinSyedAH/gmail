package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
  
public class Pages {
	
public WebDriver ldriver;

 public Pages(WebDriver rdriver) {
	 ldriver = rdriver;
	 PageFactory.initElements(rdriver, this);
}
public void lunchandnavigate(String url) {
	ldriver.get(url);
}

@FindBy(xpath ="//input [@type='email']" )
WebElement usernametxt ;

public void enterCredentialu(String username) {
	usernametxt.sendKeys(username);
}

@FindBy(xpath = "(//span[@jsname='V67aGc'])[2]")

WebElement clickNextbtn;

public void clickNext() throws Throwable {
	Thread.sleep(5000);
	clickNextbtn.click();
	Thread.sleep(5000);
}

@FindBy(xpath ="//input [@type='password']" )
WebElement passwordtxt ;

public void enterCredentialp(String password) {
	passwordtxt.sendKeys(password);
}

@FindBy(xpath = "(//div [@class='VfPpkd-RLmnJb'])[2]")
WebElement clickOnNexttxt;

public void clickOnNext() {
	clickOnNexttxt.click();
}

public void ondefualtpage() {
	String acttitle = ldriver.getTitle();
	SoftAssert softAssert = new SoftAssert();
	softAssert.assertTrue(acttitle.contains("Inbox"), "Inside Gmail Default/Home Page");
	softAssert.assertAll();
}

@FindBy(xpath = "(//div[@role='button'])[7]")
WebElement composebtn;

public void clickOnCompose() {
	composebtn.click();
}
@FindBy(xpath = "//input[@class=\"agP aFw\"]")
WebElement toemailtxt;

public void switchfocusonpopup() {
	toemailtxt.click();
}

@FindBy(xpath = "//input[@name='subjectbox']")
WebElement subjecttxt;

@FindBy(xpath = "//div[@class='Am Al editable LW-avf tS-tW']")
WebElement bodytxt;

public void fillupbodyandsubject(String subject, String body) {
	subjecttxt.sendKeys(subject);
	bodytxt.sendKeys(body);
}
}
