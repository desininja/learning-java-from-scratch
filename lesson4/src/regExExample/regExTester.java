package regExExample;
import java.util.regex.Pattern;
public class regExTester {

    public static void main(String[] args){
        String emailRegex = "^(.+)@(.+).(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        String email = "jeffmail.com";

        System.out.println(pattern.matcher(email).matches());

    }
}
