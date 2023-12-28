import StepObject.LoginSteps;
import Utils.BrowserActions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static DataObject.LoginData.*;


public class LogIn extends BrowserActions {

  @Test (priority = 1)

  public void loginWithCorrectData() throws InterruptedException {
    LoginSteps step1 = new LoginSteps(driver);

    String actualUrl = driver.getCurrentUrl();
    String expectedUrl = "https://www.linkedin.com/";
    Assert.assertEquals(expectedUrl, actualUrl);

    Thread.sleep(2000);

    step1.emailFieldAction(correctEmailData);
    step1.passwordFieldAction(correctPasswordData);
    step1.logInButtonAction();

    Thread.sleep(5000);
  }


  @Test (priority = 2)
  public void loginWithIncorrectData() throws InterruptedException {
    LoginSteps step1 = new LoginSteps(driver);

    String actualUrl = driver.getCurrentUrl();
    String expectedUrl = "https://www.linkedin.com/";
    Assert.assertEquals(expectedUrl, actualUrl);

    Thread.sleep(2000);

    step1.emailFieldAction(inccorectEmailData);
    step1.passwordFieldAction(inccorectPasswordData);
    step1.logInButtonAction();

    Thread.sleep(5000);}

  }



