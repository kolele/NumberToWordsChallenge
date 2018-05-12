package com.kole;

public class Main {

    public static void main(String[] args) {

        numberToWords(10);
    }


    public static void numberToWords(int number) {
        int forNumber = number;

        number = reverse(number);
        if (number < 0) {
            System.out.println("Invalid Value");

        } else while (number > 0) {

            int temp = number % 10;


            switch (temp) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }

            number = number / 10;

        }
        int difference = getDigitCount(forNumber) - getDigitCount(reverse(forNumber));
        for (int i = 1; i <= difference; i++) {
            System.out.println("Zero");
        }


    }

    public static int reverse(int number) {
        int reversedNum = 0;
        while (number != 0) {
            int tempNum = number % 10;
            reversedNum *= 10;
            reversedNum += tempNum;
            number /= 10;
        }
        return reversedNum;
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        } else while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}