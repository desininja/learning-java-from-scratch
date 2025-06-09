package regEx;

import java.util.regex.Pattern;

public class Per {


    private String name;
    private String email;
    private final String emailRegex = "^(.+)@(.+).com";
    private final Pattern pattern = Pattern.compile(emailRegex);

    public Per(String name, String email){
        if(!pattern.matcher(email).matches()){
            throw new IllegalArgumentException("Error, Invalid Email");
        }

        this.name =  name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{"+"name="+name+", email="+email+"}";
    }

}
