package dene01;

import java.util.Scanner;

public class DakikaYilYap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("dakika değerini giriniz");
       int dakika= scan.nextInt();
        int yil= dakika/525960;
        int gun= dakika/1440;

        System.out.println(yil+ " yıl ve "+ gun +" gündür");


    }
}
