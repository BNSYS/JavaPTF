package ru.stqa.pft.abwebtests;

        import java.util.concurrent.TimeUnit;
        import org.testng.annotations.*;
        import static org.testng.Assert.*;
        import org.openqa.selenium.*;
        import org.openqa.selenium.firefox.FirefoxDriver;

public class GroopCreationTests {
  //private WebDriver driver;
  FirefoxDriver driver;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    login("admin", "secret");
  }

  private void login(String userName, String userPassword) {
    driver.get("http://192.168.100.5/addressbook/");
    driver.findElement(By.name("user")).clear();
    driver.findElement(By.name("user")).sendKeys(userName);
    driver.findElement(By.name("pass")).clear();
    driver.findElement(By.name("pass")).sendKeys(userPassword);
    driver.findElement(By.xpath("//body//input[3]")).click();
  }

  @Test
  public void newGroupCreation() throws Exception {

    gotoGroupPage();
    createNewGroup();
    formFillGroup(new GroupData("Mytest1", "bla", "blabla"));
    submitNewGroup();
    returnToGroupPage();
  }

  private void returnToGroupPage() {
    driver.findElement(By.linkText("group page")).click();
  }

  private void submitNewGroup() {
    driver.findElement(By.name("submit")).click();
  }

  private void createNewGroup() {
    driver.findElement(By.name("new")).click();
  }

  private void gotoGroupPage() {
    driver.findElement(By.linkText("groups")).click();
  }

  private void formFillGroup(GroupData groupData) {
    driver.findElement(By.name("group_name")).clear();
    driver.findElement(By.name("group_name")).sendKeys(groupData.getGroupName());
    driver.findElement(By.name("group_header")).clear();
    driver.findElement(By.name("group_header")).sendKeys(groupData.getGroupHeader());
    driver.findElement(By.name("group_footer")).clear();
    driver.findElement(By.name("group_footer")).sendKeys(groupData.getGroupFooter());
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
