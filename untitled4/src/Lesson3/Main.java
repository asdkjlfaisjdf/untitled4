package Lesson3;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int s = scanner.nextInt();

        int min = 0;

        if (a < b && s < a) {
            min = a;
            System.out.println(min);
        }else  {

            if (b < a && b < s) {
                min = b;
                System.out.println(min);

            }else  {
                if (s < a && s < b) {
                    min = s;

                }
                System.out.print(min);


            }

        }
    }
}
