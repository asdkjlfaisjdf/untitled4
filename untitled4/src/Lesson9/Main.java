package Lesson9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Birinchi sonni kiriting: ");
        int a = in.nextInt();
        System.out.print("Ikkinchi sonni kiriting: ");
        int b = in.nextInt();
        System.out.print("uchinchi sonni kiriting: ");
        int c = in.nextInt();
        if (a <= b && a <= c)
            System.out.println(a);

        else if (b <= a && b <= c)
            System.out.println(b);

        else
            System.out.println(c + " eng katta raqam hisoblanadi.");
    }
    }

