package dene01;

import java.util.Scanner;

public class Hif_Q04 {
    public static void main(String[] args) {



    Scanner input = new Scanner(System.in);
        System.out.println("qa\ndev\nba\npm\nLutfen mesleginizi giriniz :");
    String jobTitle = input.next();

    String qa = "Qualty Analyst";
    String dev = "Developer";
    String ba = "Business Analyst";
    String pm = "Project Manager";

   if(jobTitle.equalsIgnoreCase("qa"))
           System.out.println("Mesleginiz: "+qa);

    }
}