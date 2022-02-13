package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        int dogumYili,artikGun;
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen dogum yilinizi giriniz");
        dogumYili=input.nextInt();
        artikGun=dogumYili%12;

        switch (artikGun){
            case 0:
                System.out.println("Maymun");
                break;
            case 1:
                System.out.println("Horoz");
                break;
            case 2:
                System.out.println("kopek");
                break;
            case 3:
                System.out.println("domuz");
                break;
            case 4:
                System.out.println("Fare");
                break;
            case 5:
                System.out.println(" Öküz");
                break;
            case 6:
                System.out.println(" Kaplan");
                break;
            case 7:
                System.out.println("Tavşan");
                break;
            case 8:
                System.out.println("Ejderha");
                break;
            case 9:
                System.out.println("Yılan");
                break;
            case 10:
                System.out.println("At");
                break;
            case 11:
                System.out.println("Koyun");
                break;
            default:
                System.out.println("girdiginiz sayi bulunamadi");








    }


    }
}


