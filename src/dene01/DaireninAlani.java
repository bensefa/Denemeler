package dene01;

import java.util.Scanner;

public class DaireninAlani {
    public static void main(String[] args) {

        Scanner girdi=new Scanner(System.in);

        System.out.println("Lütfen dairenin yarıçapını (r) cm cinsinden yazınız");
        int r=girdi.nextInt();

        double cevre=cevreHesapla(r);
        double alan=alanHesapla(r);

        System.out.println("Yarıçapı "+r+" cm olan bir dairenin çevresi="+cevre+" cm'dir");
        System.out.println("Yarıçapı "+r+" cm olan bir dairenin alanı="+alan+" cm karedir");
    }


    public static double cevreHesapla(int yaricap) {
        return 2*yaricap*Math.PI;
    }

    public static double alanHesapla(int yaricap) {
        return Math.PI*yaricap*yaricap;
    }
    }//git



