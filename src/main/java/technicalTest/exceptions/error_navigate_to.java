package technicalTest.exceptions;
import net.serenitybdd.core.exceptions.SerenityManagedException;

public class error_navigate_to extends SerenityManagedException {
    public static final String ErrorNavigateTo = "An error has occurred";
    public error_navigate_to(String openTheBrowserFailed, Throwable testErrorException) {
        super(testErrorException);
    }
}
