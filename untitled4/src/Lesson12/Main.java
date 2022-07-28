package Lesson12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a < b && a < c) {
            System.out.println(b + c);
        } else if (b < a && b < c) {
            System.out.println(b + c);
        } else if (c < a && c < b) {
            System.out.println(a + b);

        }
    }
}
