package dene01;

import java.util.Scanner;

public class Modulus {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = scan.nextInt();

        System.out.println("kalan" + (sayi = sayi%5));



    }
}
