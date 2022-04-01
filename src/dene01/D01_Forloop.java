package dene01;

public class D01_Forloop {


    public static void main(String[] args) {
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        int input = 5;
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 1; i <=input ; i--) {
            for (int j = 1; j <=input ; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
