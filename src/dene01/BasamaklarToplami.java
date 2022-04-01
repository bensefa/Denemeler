package dene01;

import java.util.Scanner;

public class BasamaklarToplami {

    public static void main(String[] args) {

        /*Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.

                Örnek Çıktı:

        Verilen tamsayının rakamları toplamı 10'dur.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tammsayı yazın");

        int sayi = scan.nextInt();
        int toplam = 0;

        while (sayi != 0) {
            toplam += sayi % 10; //sağdaki basamağı toplama ekle
            sayi=sayi/10; //sağdaki basamağı sil
        }
        System.out.println("Yazdığınız sayının basamakları toplamı="+toplam);



    }
}
