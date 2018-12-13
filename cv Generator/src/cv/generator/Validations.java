package cv.generator;

import Entity.cv;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validations {

    String validateData(cv obj) {
        if (obj.getFname() == null || obj.getSname() == null || obj.getContact() == null
                || obj.getNationality() == null || obj.getDob() == null || obj.getAdress1() == null
                || obj.getAdress1() == null) {
            return "All personal details are required!";
        }

        //validate first, last name and nationality
        String nameregx = "^[\\p{L} .'-]+$";
        Pattern namePattern = Pattern.compile(nameregx, Pattern.CASE_INSENSITIVE);
        Matcher fmatcher = namePattern.matcher(obj.getFname());
        Matcher lmatcher = namePattern.matcher(obj.getSname());
        Matcher nmatcher = namePattern.matcher(obj.getNationality());
        if (fmatcher.find() == false || lmatcher.find() == false) {
            return "Name is not valid please check and retry again!";
        } else if (nmatcher.find() == false) {
            return "Nationality is not valid! please check and try again later!";
        }

        //phone number validation
        //validate email
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."
                + "[a-zA-Z0-9_+&*-]+)*@"
                + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                + "A-Z]{2,7}$";

        Pattern emailpat = Pattern.compile(emailRegex);
        if (emailpat.matcher(obj.getEmail()).matches() == true) {
            return "okay";
        }
        return "E-mail is not valid! Please check and retry again!";
    }
}
