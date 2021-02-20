package technicalTest.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class register_personal_data_page {

    public static final Target Name =Target.the("Name").locatedBy("#firstName");
    public static final Target LastName =Target.the("LastName").locatedBy("#lastName");
    public static final Target Email = Target.the("Email").locatedBy("#email");
    public static final Target BirthMonth =Target.the("Birth Month").locatedBy("#birthMonth");
    public static final Target BirthDay =Target.the("Birth Day").locatedBy("#birthDay");
    public static  final Target BirthYear =Target.the("Birth Year").locatedBy("#birthYear");
    public static final Target Language = Target.the("Language").locatedBy("//input[@type='search']");
    public static final Target Next=Target.the("Next").locatedBy("//a[@class='btn btn-blue']");
}
