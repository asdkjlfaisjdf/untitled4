package Lesson1;

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
            System.out.println(max);
        }else  {

            if (b > a && b > s) {
                max = b;
                System.out.println(max);

            }else  {
                if (s > a && s > b) {
                    max = s;
                }else  {
                    System.out.print("teng");
                }
                System.out.print(max);


            }

        }

        }







}
