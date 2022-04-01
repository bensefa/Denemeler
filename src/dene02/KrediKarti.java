package dene02;

import java.util.Scanner;

public class KrediKarti {

    public static <str> void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen isim girin");
        String isim = scan.next();

        System.out.println("lutfen soy isim girin");
        String soyIsim = scan.next();

        System.out.println("lutfen kart numarasını girin");
        String kartNo = scan.next();

        

        System.out.println((isim) + "," + (soyIsim) + "," + (kartNo));


    }
}
