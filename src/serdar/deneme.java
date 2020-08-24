package serdar;

import java.util.*;

public class deneme {
    public static void main(String[] args) {
        /*
18. Given a list of people' names: "Ahmed", "John", Eric",
"Ahmed".....
Write a java operation to remove all the names named Ahmed
*/

        ArrayList<String>list=new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
ArrayList<String> names=new ArrayList<>();

        for (String each:list
             ) {
            if(!each.equals("Ahmed"))
                names.add(each);
        }
        System.out.println(names);
}}