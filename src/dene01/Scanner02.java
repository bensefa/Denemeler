package dene01;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {


        /*Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.

         //       Ornek Cikti :

        //Alan: 9

      Cevre: 12

       */

        Scanner scan = new Scanner(System.in);
        System.out.println("karenin kenar uzunlugunu giriniz");
        double uzunluk = scan.nextInt();
        uzunluk= (uzunluk*4);
        System.out.println(uzunluk + "cevresi : "+ uzunluk*2);



    }
}
