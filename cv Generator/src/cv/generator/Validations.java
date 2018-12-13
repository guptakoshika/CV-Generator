package cv.generator;

import Entity.cv;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validations {
     String validateData(cv obj){
         String nameregx = "^[\\p{L} .'-]+$";
         Pattern pattern = Pattern.compile(nameregx,Pattern.CASE_INSENSITIVE);
         Matcher matcher = pattern.matcher(obj.getFname());
       if(matcher.find() == false)
           return "name is not valid please check and retry again!";
         
         String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (pat.matcher(obj.getEmail()).matches() == true)
             return "okay";
        return "email is not valid! Please check and retry again!";
     }    
}
