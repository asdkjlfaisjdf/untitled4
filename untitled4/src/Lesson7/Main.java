package Lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinchi sonni kiriting: ");
        int a = sc.nextInt();
        System.out.print("Ikkinchi sonni kiriting: ");
        int b = sc.nextInt();
        System.out.print("Uchinchi sonni kiriting: ");
        int c = sc.nextInt();

        if (a == b) {
            System.out.println("1- va 2- bir xil");
        } else if (a == c) {
            System.out.println("1- va 3- bir xil");
        } else if (b == c) {
            System.out.println("2- va 3-  bir xil");
        } else {
            System.out.println("Biz xillar yõq");
        }
    }
}
