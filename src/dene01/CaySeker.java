package dene01;

import java.util.Scanner;

public class CaySeker {
    /*Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.

            1 şeker = 1.7 gr

    Örnek Çıktı:

    Yılda 12.41 kg şeker kullanıyor.*/


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir gunde ne kadar cay iciyorsunuz? ");
        int caySayisi= scan.nextInt();
        System.out.println("Bir gunde kac seker kullanıyorsunuz? ");
        Double sekerSayisi= scan.nextDouble();

        System.out.println("Bir yilda : " + sekerSayisi*1.7*360/1000 + "kg seker kullaniyoursunuz");


    }
}
