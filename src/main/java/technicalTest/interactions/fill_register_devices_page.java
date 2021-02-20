package technicalTest.interactions;

import technicalTest.model.user;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;

import static technicalTest.userInterface.register_devices_page.*;

public class fill_register_devices_page {
    public static class FillRegisterDevicesPage implements Task {
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(ComputerOS),
                    SendKeys.of(user.getComputer()).into(ComputerOSInput),
                    Click.on(ComputerOSOption),
                    Click.on(OSVersion),
                    SendKeys.of(user.getVersion()).into(OSVersionInput),
                    Click.on(OSVersionOption),
                    Click.on(PCOSLanguage),
                    SendKeys.of(user.getPcLanguage()).into(PCOSLanguageInput),
                    Click.on(PCOSLanguageOption),
                    Click.on(DeviceMobile),
                    SendKeys.of(user.getMobile()).into(DeviceMobileInput),
                    Click.on(DeviceMobileOption),
                    Click.on(MobileModel),
                    SendKeys.of(user.getModel()).into(MobileModelInput),
                    Click.on(MobileModelOption),
                    Click.on(OSMobile),
                    Click.on(OSMobileOption),
                    Click.on(Next3)
            );
        }

        public static FillRegisterDevicesPage FieldsFill() {
            return Tasks.instrumented(FillRegisterDevicesPage.class);

        }
    }
}
