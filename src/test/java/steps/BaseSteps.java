package steps;

import base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.pages.DragAndDropPage;

public class BaseSteps {

    private BaseTest base;

    public BaseSteps(BaseTest base)
    {
        this.base = base;
    }

    @When("^the user opens the application$")
    public void theUserOpensTheApplication()
    {
        base.driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
        base.driver.manage().window().maximize();
    }

    @Then("^the user drag and drop a task$")
    public void theUserDragAndDropATask() throws InterruptedException {
        DragAndDropPage dragAndDropPage = new DragAndDropPage(base.driver);
        dragAndDropPage.dragAndDrop();
        Thread.sleep(5000);
    }
}
