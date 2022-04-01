package dene01;

import java.util.Scanner;

public class SayiKupuyazma {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        Double sayi= scan.nextDouble();

        sayi= (sayi*sayi*sayi/2);
        System.out.println(sayi);

    }
}

    //Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.