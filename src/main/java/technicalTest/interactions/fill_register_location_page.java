package technicalTest.interactions;
import technicalTest.model.user;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;


import static technicalTest.userInterface.register_location_page.*;


public class fill_register_location_page {

    public static class FillRegisterLocationPage implements Task {
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    DoubleClick.on(City),
                    SendKeys.of(user.getCity()).into(City),
                    DoubleClick.on(Zip),
                    Enter.theValue(user.getZip()).into(Zip),
                    Click.on(Country),
                    SendKeys.of(user.getCountry()).into(Country2),
                    Click.on(Country3),
                    Click.on(Next2)
            );
        }

        public static FillRegisterLocationPage FieldsFill() {
            return Tasks.instrumented(FillRegisterLocationPage.class);

        }
    }
}

