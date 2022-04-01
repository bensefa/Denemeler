package dene01;

public class YerDegistirme {
    public static void main(String[] args) {
        /*Verilen iki degerin degerlerini degistiriniz. Mulakat Sorusu(Swap)

    int a= 3;
    int b= 5;
    Ornek Cikti:
    a=5
    b=3
    */
        int a= 3;
        int b= 5;
        System.out.println("a  kutusu : " + a + "\t b kutusu :" + b);
        a = b + b;
        b = a - b;
        a = a - b;
        System.out.println("a  kutusu : " + a + "\t b kutusu :" + b);

    }
}
