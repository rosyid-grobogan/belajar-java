package com.sekolahbackend;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * ===========================================
        * Requirements
        * 1. maksimal inputan 100 X.
        * 2. kalau user input = -999 -> close (break).
        * 3. kalau tidak, lanjut terus sampai 100 kali.
        * ===========================================
         */

        System.out.println("=======================================");
        System.out.println("Kalkulator Dengan Looping & Conditional");
        System.out.println("=======================================");


        //instansiasi objek
        Scanner scan = new Scanner(System.in);

        try {
            int i = 1;
            int angkaMax = 100;

            for (i = 1; i <= angkaMax; i++ ) {

                //1. maksimal inputan 100 X
                if (i > angkaMax ){
                    System.exit(0);

                }

                Calculator resultApp = new Calculator();
                DecimalFormat decimalFormat = new DecimalFormat("#.##");

                System.out.println("@Percobaan ke-"+ i);
                System.out.print(":: Input Angka 1: ");
                double nilai1 = scan.nextDouble();
                if(nilai1 == -999){ break;}

                System.out.print(":: Input Operator ( + - * / % ): ");
                String operator2 = scan.next();
                if (operator2 == "-999") {break;}

                System.out.print(":: Input Angka 2: ");
                double nilai2 = scan.nextDouble();
                if (nilai2 == -999) {break;}

                resultApp.processResult(nilai1,nilai2,operator2);
                String hasil = decimalFormat.format( resultApp.getResult() );
                String nilaiDF1 = decimalFormat.format(nilai1);
                String nilaiDF2 = decimalFormat.format(nilai2);
                System.out.println("==> Hasil dari Aritmatika "+ nilaiDF1 +" "+operator2+" "+nilaiDF2+" adalah "+hasil);

            }
        }catch (Exception e) {
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println("MASUKKAN NILAI INPUT YANG SESUAI !");
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        }

            System.out.println("@Percobaan Selesai.");


    }

    //

}
