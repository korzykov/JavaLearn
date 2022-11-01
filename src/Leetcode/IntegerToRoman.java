package Leetcode;

import java.util.Scanner;

// Задача: ввести число - вывести число римскими цифрами

public class IntegerToRoman {
    public static String intToRoman(int num) {
        StringBuilder gl = new StringBuilder();
        final int numLength = 4;
        int[] ourNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 40, 50, 60, 90, 100, 400, 500, 600, 900, 1000};
        String[] romanSymbols = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XL", "L", "LX", "XC", "C", "CD", "D", "DC", "CM", "M"};
        int[] our = new int[numLength];
        int memoryNumber = num;
        int count = 0;
        for (int i = 1000; i > 0; i /= 10) {
            our[count] = memoryNumber / i;
            memoryNumber = memoryNumber % i;
            count++;
        }
        for (int i = 0; i < our.length; i++) {
            if (i == 0) {
                gl.append("M".repeat(Math.max(0, our[i])));
            }
            if (i == 1) {
                for (int n = 0; n < ourNumbers.length; n++) {
                    if (our[i] * 100 == ourNumbers[n]) {
                        gl.append(romanSymbols[n]);
                        break;
                    }
                }
                String check = gl.toString();
                if (check.contains("D") || check.contains("C")) {
                    continue;
                } else if (our[i] > 5) {
                    gl.append("D");
                    gl.append("C".repeat(Math.max(0, our[i] - 5)));
                } else {
                    gl.append("C".repeat(Math.max(0, our[i])));
                }
            }
            if (i == 2) {
                for (int n = 0; n < ourNumbers.length; n++) {
                    if (our[i] * 10 == ourNumbers[n]) {
                        gl.append(romanSymbols[n]);
                        break;
                    }
                }
                String check = gl.toString();
                if (check.contains("L") || check.contains("X")) {
                    continue;
                } else if (our[i] > 5) {
                    gl.append("L");
                    gl.append("X".repeat(Math.max(0, our[i] - 5)));
                } else {
                    gl.append("X".repeat(Math.max(0, our[i])));
                }
            }
            if (i == 3) {
                for (int n = 0; n < ourNumbers.length; n++) {
                    if (our[i] == ourNumbers[n]) {
                        gl.append(romanSymbols[n]);
                        break;
                    }
                }
            }
        }
        return gl.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(intToRoman(num));
    }
}
