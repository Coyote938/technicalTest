package technicalTest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static technicalTest.userInterface.go_register_page.go_to_register;

public class go_to_register_page implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(go_to_register)

        );
    }

    public static go_to_register_page GoToRegister(){
        return Tasks.instrumented(go_to_register_page.class);
    }

}
