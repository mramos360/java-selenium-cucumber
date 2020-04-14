package model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;

import java.awt.*;

public class DragAndDropPage {

    By colA = By.id("column-a");
    By colB = By.id("column-b");

    private WebDriver driver;

    public DragAndDropPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void dragAndDrop() throws InterruptedException, AWTException {
        WebElement drag = driver.findElement(colA);
        WebElement drop = driver.findElement(colB);


        Actions builder = new Actions(this.driver);
        Thread.sleep(2000);

        Robot robot = new Robot();
        robot.mouseMove(10,10);
        builder.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
//        Action mouseHome = builder.moveToElement(drop).click().build();
//        mouseHome.perform();
//
//        Action dnd = builder.dragAndDrop(drag, drop).build();
//        dnd.perform();

    }

}
