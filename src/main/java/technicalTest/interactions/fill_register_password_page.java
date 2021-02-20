package technicalTest.interactions;

import technicalTest.model.user;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;


import static technicalTest.userInterface.register_password_page.*;



public class fill_register_password_page {


    public static class FillRegisterPasswordPage implements Task {
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    SendKeys.of("Password123/*-+").into(Password),
                    SendKeys.of("Password123/*-+").into(ConfirmPassword),
                    Click.on(TermsOfUse),
                    Click.on(PrivacySettings),
                    Click.on(CompleteSetup)
            );
        }

        public static FillRegisterPasswordPage FieldsFill() {
            return Tasks.instrumented(FillRegisterPasswordPage.class);
        }
    }
}
