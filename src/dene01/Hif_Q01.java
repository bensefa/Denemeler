package dene01;

import java.util.Scanner;

public class Hif_Q01 {
    public static void main(String[] args) {

        /*
        Scanner scan=new Scanner(System.in);                                                      // 1.Islem kullanıcıdan input almak için komut
        System.out.println(" toplama için 1\n çikarma için 2\n bolme için 3\n çarpma için 4");    // 2.Islem kullanıcı icin islem menüsü create etmek
        int islem = scan.nextInt();;                                                              // 3.Islem kullanicinin islem tercihi create edildi
        System.out.println("lütfen iki tam sayı giriniz");                                        // 4.kullanıcıya bildirmde bulunuldu.
        double num1 = scan.nextDouble();                                                          // 5. 1 sayı assign edildi
        double num2 = scan.nextDouble();                                                          // 6. 2 sayı assign edildi
        if (islem == 1) {
            System.out.println("toplama işleminin sonucu :" + num1 + " + " + num2 + " = " + (num1 + num2));
        }else if (islem == 2) {
            System.out.println("cıkarma işleminin sonucu :" + num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (islem == 3) {
            System.out.println("bolme işleminin sonucu :" + num1 + " / " + num2 + " = " + (num1 / num2));
        } else if (islem == 4) {
            System.out.println("carpma işleminin sonucu :" + num1 + " x " + num2 + " = " + (num1 * num2));
        } else System.out.println("hatalı secim yaptınız tekrar deneyiniz");
        */

        /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */
            Scanner scan=new Scanner(System.in);
        System.out.println( "toplama icin 1 \n cikarma icin 2 \n bolme icin 3 \n carpma icin 4");
        int islem= scan.nextInt();
        System.out.println("lutfen iki tam sayi giriniz");
        double num1=scan.nextDouble();
        double num2=scan.nextDouble();
        if (islem == 1) {
            System.out.println("sayilarin toplamı :" + (num1 + num2));
        }else if (islem == 2) {
            System.out.println("sayilarin toplami :" + (num1 - num2));
        }

    }
}