package Lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sacanner = new Scanner(System.in);
        System.out.print("Birinchi sonni kiriting: ");
        int n1 = sacanner.nextInt();
        System.out.print("Ikkinchi sonni kiriting: ");
        int n2 = sacanner.nextInt();
        System.out.print("Uchinchi sonni kiriting: ");
        int n3 = sacanner.nextInt();

        if (n1 >= n2 && n1 >= n3)
            System.out.println(n1);

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2);

        else
            System.out.println(n3 + " eng katta raqam hisoblanadi.");
    }
    }

