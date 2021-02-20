package technicalTest.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class go_register_page {

    public static final Target go_to_register =Target.the("go to register")
            .locatedBy("//a[contains(text(), 'Join Today')]");

}
