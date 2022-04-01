package dene01;

import java.util.Scanner;

public class SayiOrtalaAlmak {

    public static void main(String[] args) {

        Scanner klavye=new Scanner(System.in);
        int toplam=0;
        System.out.println("kaç sayi girmek istersiniz?");
        int n=klavye.nextInt();

        for (int i=1; i<=n; i++)
        {
            System.out.println(i+". sayiyi giriniz: ");
            int sayi = klavye.nextInt();
            toplam+=sayi;
        }

        double ortalama=(double)toplam/n;
        System.out.println("Bu "+n+" sayinin ortalamasi: "+ortalama);
    }

}
/*class Main {
    public static void main(String[] args) {

    }
}*/