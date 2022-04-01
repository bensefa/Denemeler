package dene01;

import java.util.Scanner;

public class If_S3 {

    public static void main(String[] args) {

        int x;
        System.out.println("Kontrol edilecek sayiyi giriniz:");
        Scanner scanner = new Scanner(System.in);

        x = scanner.nextInt();

        if (x % 2 == 0) {
            System.out.println("Sayiniz çift sayidir.");
        } else {
            System.out.println("Sayiniz tek sayidir.");


        }


    }
}
