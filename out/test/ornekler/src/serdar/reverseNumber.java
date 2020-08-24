package serdar;

public class reverseNumber {
    public static void main(String[] args) {
        int original=359;
        int rev=0;
        int i=1;

        while(original!=0){
            int digit =original%10;
            rev=rev*10+digit;
            original=original/10;
        }
        System.out.println("Reverse  :"+rev);
    }
}
