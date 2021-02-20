package technicalTest.utils;

import technicalTest.model.user;
import cucumber.api.DataTable;

import java.util.List;
import java.util.Map;


public class read {

    public static void the(DataTable data){
        List<Map<String,String>> values = data.asMaps(String.class, String.class);
        if(values.get(0).containsKey("firstname")){
            user.setFirstName(values.get(0).get("firstname"));
            user.setLastName(values.get(0).get("lastname"));
            user.setEmail(values.get(0).get("email"));
            user.setBirthMonth(values.get(0).get("month"));
            user.setBirthDay(values.get(0).get("day"));
            user.setBirthYear(values.get(0).get("year"));
            user.setLanguage(values.get(0).get("language"));
            user.setCity(values.get(0).get("city"));
            user.setZip(values.get(0).get("zip"));
            user.setCountry(values.get(0).get("country"));
            user.setComputer(values.get(0).get("computer"));
            user.setVersion(values.get(0).get("version"));
            user.setPcLanguage(values.get(0).get("pclanguage"));
            user.setMobile(values.get(0).get("mobile"));
            user.setModel(values.get(0).get("model"));
            user.setPassword(values.get(0).get("password"));
            user.setConfirmPassword(values.get(0).get("confirmpassword"));
        }else{
            System.out.println("THE DATA COULD NOT BE SEEN");
        }
    }
}
