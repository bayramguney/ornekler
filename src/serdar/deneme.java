package serdar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class deneme {
    public static void main(String[] args) {
        String password = "123abc#$%A";
        System.out.println(isValid(password));
    }

    public static boolean isValid(String password) {

        String uppercase=".*[A-Z].*";
        String lowercase=".*[a-z].*";
        String number=".*[0-9].*";
        String special=".*[ -/, :-@].*";

        boolean hasUpper=password.matches(uppercase),
                hasLower=password.matches(lowercase),
                hasNumber=password.matches(number),
                hasSpecial=password.matches(special),
        isValid=false;
        if(password.length()>=6 && !password.contains(" ")){
            if(hasLower && hasNumber && hasUpper && hasSpecial)
            isValid=true;
        }




    return isValid;
    }
}