package technicalTest.tasks;



import technicalTest.exceptions.error_navigate_to;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class navigate_to implements Task {
    PageObject page;

    public navigate_to(PageObject page) {
        this.page = page;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.wasAbleTo(Open.browserOn(page));
            page.getDriver().manage().window().maximize();
        } catch (Exception e) {
                throw new error_navigate_to(error_navigate_to.ErrorNavigateTo, e);
        }

    }

    public static navigate_to on (PageObject page) {

        return Tasks.instrumented(navigate_to.class, page);
    }
}
