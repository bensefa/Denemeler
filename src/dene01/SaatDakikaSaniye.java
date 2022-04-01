package dene01;

import java.util.Scanner;

public class SaatDakikaSaniye {
    public static void main(String[] args) {

        /*int sa,dk,sn;
        Scanner scan = new Scanner(System.in);
        System.out.print("Saniye giriniz : ");
        sn=scan.nextInt();
        sa=sn/3600;
        sn=sn-(sa*3600);
        dk=sn/60;
        sn=sn-(dk*60);
        System.out.format("%02d:%02d:%02d",sa,dk,sn);

*/
        Scanner scan=new Scanner(System.in);
        System.out.println("saniye değerini giriniz");
        int saniye= scan.nextInt();
        int dakika=saniye/60;
        int saat =dakika/60;
        int kalan= saniye%60;
        System.out.println(saat + "saat ve " + dakika+ " dakika ve "+ kalan + " saniye " );



    }
}
