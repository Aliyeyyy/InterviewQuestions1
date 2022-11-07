package day1;

import java.util.Arrays;
import java.util.Scanner;

public class C01 {

    /*
  Kullanicidan bir String aliniz.
  String'de var olan her character'in sayisini ekrana yazdiriniz.
  Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
         abaa   ==> a=3  b=1
    */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir string giriniz :");
        String str=scan.nextLine();
        //split
        String arr[]=str.split("");//her bir karakteri ayırır
        System.out.println(Arrays.toString(arr));
        //sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //count: sayac olustur
        int counter=0;
        //karakterleri karsılastırmak icin for loop

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i-1].equals(arr[i])) { //birden fazla sayıdaki karakter icin calışır
                counter++;
            }else {
                System.out.println(arr[i-1]+ "sayisi " + counter+1);
            }
        if (i==arr.length-1){//en sonki karakter için çalışır
            System.out.println(arr[i] + "sayisi" + (counter+1));
        }

        }


    }





}
