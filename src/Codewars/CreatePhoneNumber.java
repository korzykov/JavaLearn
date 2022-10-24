package Codewars;

import java.text.DecimalFormat;

public class CreatePhoneNumber {
    public static void phoneNumber (int[] numbers){
        StringBuilder stringNum = new StringBuilder();
        for (int i: numbers){
            stringNum.append(i);
        }
        System.out.println(String.valueOf(stringNum).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3"));
    }

    public static void main(String[] args) {
        phoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
    }
}
