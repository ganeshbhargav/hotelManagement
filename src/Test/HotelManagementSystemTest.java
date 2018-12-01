package Test;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class HotelManagementSystemTest {
WebDriver driver;
@Before
public void openWikipediaEnglishPage() throws InterruptedException{
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
driver = new ChromeDriver();
driver.get("http://localhost:8080/anup123/");
Assert.assertEquals("Hotel Management Portal", driver.getTitle());
}
@Test
public void testEnglishLink() throws InterruptedException{
WebElement link = driver.findElement(By.id("js-link-box-en"));
link.click();
Assert.assertEquals("HMS login page", driver.getTitle());
WebElement searchBox = driver.findElement(By.id("username"));
searchBox.sendKeys("anup");
searchBox = driver.findElement(By.id("password"));
searchBox.sendKeys("anup");
searchBox = driver.findElement(By.id("submit"));
searchBox.click();
link = driver.findElement(By.id("EditRoom"));
link.click();
Thread.sleep(5000);
searchBox = driver.findElement(By.id("enteredRoomNumber"));
searchBox.sendKeys("202");
searchBox = driver.findElement(By.id("enteredRoomType"));
searchBox.sendKeys("Presidential Suite");
Thread.sleep(5000);
searchBox = driver.findElement(By.id("EditRoom"));
searchBox.click();
Thread.sleep(5000);
String t1 = driver.findElement(By.className("left_panel")).getText();
if(t1.contains("successfully")) {
	Assert.assertEquals("HMS welcome page", driver.getTitle());
} else {
	Assert.assertEquals("HMS", driver.getTitle());
}
Assert.assertEquals("HMS welcome page", driver.getTitle());
}
/*@Test
public void testSearchBox() throws InterruptedException{
WebElement searchBox = driver.findElement(By.id("searcInput"));
searchBox.sendKeys("anup");
Thread.sleep(5000);
searchBox.submit();
Thread.sleep(5000);
Assert.assertEquals("Software testing - Wikipedia", driver.getTitle());
}*/
@After
public void closePage(){
driver.quit();
}
}