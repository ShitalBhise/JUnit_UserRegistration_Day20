package junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
static String regex = "[A-Z]{1}[a-z]{2,}";
	
	

public boolean FirstName(String firstName) {
	regex = "[A-Z]{1}[a-z]{2,}";
	Pattern p = Pattern.compile(regex);
	Matcher m = p.matcher(firstName);
	return m.matches();

}
}
