package Lesson5;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int s = scanner.nextInt();
        int min = 0;
        int max = 0;

        if (a > b && s < a) {
            max = a;

        } else {

            if (b > a && b > s) {
                max = b;


            } else {
                if (s > a && s > b) {
                    max = s;


                }
                System.out.println(max);


            }
        }
    }
}
