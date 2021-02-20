package technicalTest.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class register_devices_page {
    public static final Target ComputerOS = Target.the("ComputerOS").locatedBy("//div[@id='web-device']/div/div[2]/div/div/span");
    public static final Target ComputerOSInput = Target.the("ComputerOSInput").locatedBy("(//input[@type='search'])[1]");
    public static final Target ComputerOSOption = Target.the("ComputerOSOption").locatedBy("//div[@id='ui-select-choices-row-3-0']/span/div/span");
    public static final Target OSVersion = Target.the("OSVersion").locatedBy("//div[@id='web-device']/div[2]/div[2]/div/div/span");
    public static final Target OSVersionInput = Target.the("OSVersionInput").locatedBy("(//input[@type='search'])[2]");
    public static final Target OSVersionOption = Target.the("OSVersionOption").locatedBy("//div[@id='ui-select-choices-row-4-0']/span");
    public static final Target PCOSLanguage = Target.the("PCOSLanguage").locatedBy("//div[@id='web-device']/div[3]/div[2]/div/div/span/span");
    public static final Target PCOSLanguageInput = Target.the("PCOSLanguageInput").locatedBy("(//input[@type='search'])[3]");
    public static final Target PCOSLanguageOption = Target.the("PCOSLanguageOption").locatedBy("//div[@id='ui-select-choices-row-5-0']/span");
    public static final Target DeviceMobile = Target.the("DeviceMobile").locatedBy("//div[@id='mobile-device']/div/div[2]/div/div/span");
    public static final Target DeviceMobileInput = Target.the("DeviceMobileInput").locatedBy("(//input[@type='search'])[4]");
    public static final Target DeviceMobileOption = Target.the("DeviceMobileOption").locatedBy("//div[@id='ui-select-choices-row-6-0']/span/div");
    public static final Target MobileModel = Target.the("MobileModel").locatedBy("//div[@id='mobile-device']/div[2]/div[2]/div/div/span");
    public static final Target MobileModelInput = Target.the("MobileModelInput").locatedBy("(//input[@type='search'])[5]");
    public static final Target MobileModelOption = Target.the("MobileModelOption").locatedBy("//div[@id='ui-select-choices-row-7-0']/span/div/span");
    public static final Target OSMobile = Target.the("OSMobile").locatedBy("//div[@id='mobile-device']/div[3]/div[2]/div/div/span");
    public static final Target OSMobileInput = Target.the("OSMobileInput").locatedBy("//div[@id='ui-select-choices-row-8-0']/span/div");
    public static final Target OSMobileOption = Target.the("OSMobileOption").locatedBy("//div[@id='ui-select-choices-row-8-0']/span/div");
    public static final Target Next3 = Target.the("Next3").locatedBy("//section[@id='regs_container']/div/div[2]/div/div[2]/div/div[2]/div/a");
}
