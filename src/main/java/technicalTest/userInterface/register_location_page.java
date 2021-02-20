package technicalTest.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class register_location_page {
    public static final Target City =Target.the("City").locatedBy("#city");
    public static final Target Zip =Target.the("Zip").locatedBy("#zip");
    public static final Target Country = Target.the("Country").locatedBy("//section[@id='regs_container']/div/div[2]/div/div[2]/div/form/div/div[3]/div/div[4]/div[2]/div/div/div/span");
    public static final Target Country2 = Target.the("Country2").locatedBy("(//input[@type='search'])[2]");
    public static final Target Country3 = Target.the("Country3").locatedBy("//div[@id='ui-select-choices-row-2-0']/span/div");
    public static final Target Next2 =Target.the("Next2").locatedBy("//span[contains(text(),'Next: Devices')]");
}
