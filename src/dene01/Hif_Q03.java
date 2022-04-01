package dene01;

import java.util.Scanner;

public class Hif_Q03 {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen boyunucu cm giriniz");
        double boy= scan.nextDouble();

        System.out.println("lutfen kilonuzu kg olarak giriniz");
        double kilo= scan.nextDouble()/100;

        double bmi=kilo/((boy)*(boy));
        if (bmi <=20) {
            System.out.println("vucut kitle endeksiniz :" + bmi + " " +"Oldukca Zayifsiniz");
        }else if (bmi >20 & bmi <=25) {
            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Normalsınız");
        } else if (bmi>25 & bmi<=30){
            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Sismansınız");
        } else if (bmi>30){
            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Obezsiniz");

        //test
        }

    }
}
