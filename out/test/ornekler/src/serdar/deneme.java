package serdar;

import java.util.*;

public class deneme {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i] > arr[j]) {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;

                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }
}