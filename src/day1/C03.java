package day1;

import java.util.Scanner;

public class C03 {


        /*
        Ask user enter a positive number and check if it is prime or not
        Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
         */

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= scanner.nextInt();

        boolean flag=true;

        if(sayi>=2){
            for (int i = 2; i <sayi ; i++) {
                if (sayi%i==0){
                    flag=false;
                    break;
                }
            }

            if (flag==true) System.out.println("sayi asaldir");
            else System.out.println("sayi asal degildir");

        }else System.out.println("sayi asal degildir");




    }


}
