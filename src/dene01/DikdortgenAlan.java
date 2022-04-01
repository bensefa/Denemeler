package dene01;

import java.util.Scanner;

public class DikdortgenAlan {

    public static void main(String[] args) {


        Scanner klavye=new Scanner(System.in);
        System.out.println("dikdortgenin kisa kenarı kac birim olsun?");
        int a=klavye.nextInt();

        System.out.println("dikdortgenin uzun kenarı kac birim olsun?");
        int b=klavye.nextInt();

        int cevre=2*(a+b);
        int alan=a*b;

        System.out.println("Alan="+alan);
        System.out.println("Cevre="+cevre);


    }

}
