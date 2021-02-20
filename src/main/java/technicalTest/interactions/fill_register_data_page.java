package technicalTest.interactions;

import technicalTest.model.user;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import static technicalTest.userInterface.register_personal_data_page.*;

public class fill_register_data_page {

    public static class FillRegisterDataPage implements Task {
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Enter.theValue(user.getFirstName()).into(Name),
                    Enter.theValue(user.getLastName()).into(LastName),
                    Enter.theValue(user.getEmail()).into(Email),
                    SendKeys.of(user.getBirthMonth()).into(BirthMonth),
                    SendKeys.of(user.getBirthDay()).into(BirthDay),
                    SendKeys.of(user.getBirthYear()).into(BirthYear),
                    Enter.theValue(user.getLanguage()).into(Language),
                    SendKeys.of(Keys.ENTER).into(Language),
                    Click.on(Next) );
        }

        public static FillRegisterDataPage FieldsFill() {
            return Tasks.instrumented(FillRegisterDataPage.class);

        }
    }
}

