package dene01;

import java.util.Scanner;

public class BasHarfYazdirma {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String isim;
        System.out.println("lutfen adinizi yazınız");
        isim= scan.next();
        System.out.println("İsmin başharfi:"+isim.charAt(0));

    }
}
