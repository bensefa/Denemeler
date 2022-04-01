package dene01;

import java.util.Scanner;

public class FloatShort {
    //Kullanıcıdan bir Float değer girmesini isteyin, bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.


    public static void main(String[] args) {

        /*Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ondalikli bir sayi giriniz");
        float sayi= scan.nextFloat();
        short sayi2 =(short) sayi;
        System.out.println(sayi2);

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ondalikli bir sayi giriniz");
        double doubleSayi = scan.nextDouble();
        int intSayi = (int) doubleSayi;
        System.out.println("Tam sayi :" + intSayi);
    }
}
