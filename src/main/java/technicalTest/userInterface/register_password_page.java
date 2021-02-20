package technicalTest.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class register_password_page {
    public static final Target Password = Target.the("Password").locatedBy("#password");
    public static final Target ConfirmPassword = Target.the("ConfirmPassword").locatedBy("#confirmPassword");
    public static final Target TermsOfUse = Target.the("TermsOfUse").locatedBy("#termOfUse");
    public static final Target PrivacySettings = Target.the("PrivacySettings").locatedBy("#privacySetting");
    public static final Target CompleteSetup = Target.the("CompleteSetup").locatedBy("#laddaBtn");
}
