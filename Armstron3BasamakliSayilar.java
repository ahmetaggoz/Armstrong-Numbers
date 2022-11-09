package Giris;

public class Armstron3BasamakliSayilar {
    public static void main(String[] args) {

        for (int i = 100; i<=999; i++){
            int number = i;
            int diffNumber;
            int numberCounter = 0;
            int numberValues = 0;
            int numberPower;
            int result = 0;

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
                for (int k = 1; k <= numberCounter; k++){
                    numberPower *= numberValues;
                }
                result += numberPower;
                diffNumber /= 10;
            }

            if (result == number){
                System.out.println(number + " sayısı bir Armstrong sayıdır.");
            }
        }

    }
}
