package day1;

import java.util.Scanner;

public class C02 {

    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str= scan.nextLine();
        System.out.println("bir sayi giriniz");
        int sayi= scan.nextInt();

        System.out.println(ilkSonHarf(str, sayi));


    }
    private static String ilkSonHarf(String str, int sayi){

        String ilkSonHarfler=str.substring(0,1)+ str.substring(str.length()-1);
        System.out.println("ilkSonHarfler ="+ ilkSonHarfler);
        String output="";

        for (int i = 0; i < sayi; i++) { //birlesimden kac tane yazdiracaksam onu verir
            output+= ilkSonHarfler;
        }
        return output;
    }

    }






