package Tasks;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

public class Homework06DropDown06 extends BaseTest {
/*
Go to URL: https://opensource-demo.orangehrmlive.com/
Login with Username: Admin
Login with Password: admin123
Click login button
Click on PIM
Click on Employee List
    Employee Name -> Use Faker Class
    ID -> Use Faker Class
    Employment Status -> select by index: 2
    Include -> selectByVisibleText: Current and Past Employees
    Supervisor Name -> Use Faker Class
    Job Title ->selectByValue: IT Manager
    Sub Unit ->selectByValue: 3
Click search button
Verify text visible : "No Records Found"

 */
@Test
        public void TEst() {
    driver.get("https://Admin:admin123@opensource-demo.orangehrmlive.com/");
    WebElement username = driver.findElement(By.name("username"));
    username.sendKeys("Admin");
    WebElement password = driver.findElement(By.xpath("//div/input[@name='password']"));
    password.sendKeys("admin123");
    WebElement login = driver.findElement(By.tagName("button"));
    login.click();
    WebElement pim = driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[2]"));
    pim.click();
    WebElement employeListButton = driver.findElement(By.xpath("//a[.='Employee List']"));
    employeListButton.click();
    Faker faker = new Faker();
    WebElement employeName = driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]"));
    employeName.sendKeys(faker.name().firstName());
    WebElement employeeId= driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
    employeeId.sendKeys(faker.idNumber().invalid());
    WebElement dropDown =driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[1]"));
    Select select=new Select(dropDown);
    select.selectByIndex(0);
    select.selectByVisibleText("Current and Past Employees");

}
}
