package serdar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class deneme {
    public static void main(String[] args) {
        String str = "AAABBBCCC";
        String nonDub="";
        for (int i = 0; i <str.length() ; i++) {
            if(!nonDub.contains(str.substring(i,i+1))){
                nonDub+=str.substring(i,i+1);
            }
        }
        System.out.println(nonDub);
    }
}