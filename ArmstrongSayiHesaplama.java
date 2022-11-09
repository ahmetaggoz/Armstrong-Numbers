package Giris;
import java.util.Scanner;
public class ArmstrongSayiHesaplama {
    public static void main(String[] args) {
        Scanner baba = new Scanner(System.in);
        int number;
        int diffNumber;
        int numberCounter = 0;
        int numberValues = 0;
        int numberPower;
        int result = 0;
        System.out.print("Lütfen bir sayı giriniz : ");
        number = baba.nextInt();

        diffNumber = number;
        while (diffNumber != 0){
            diffNumber /= 10;
            numberCounter++;
        }

        diffNumber = number;
        while (diffNumber != 0){
            numberValues = diffNumber % 10;
            //1*1*1*1 = 1^4
            numberPower = 1;
            for (int i = 1; i <= numberCounter; i++){
                numberPower *= numberValues;
            }
            result += numberPower;
            diffNumber /= 10;
        }

        if (result == number){
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        }else {
            System.out.println(number + " sayısı Armstrong sayı değildir!");
        }


    }
}
