package com.company.HomeWork16;
import java.util.Scanner;
public class Account {

    float balance;
    float amountc;
    float amountd;
    int x;

    public Account(float balance) {
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public void credit(){

       float c = balance += amountc;
        if (x == 1){
            System.out.printf("Ваш счет после пополнения: %.2f гривен", c);
        }

    }

    public void debit(){

        float d = balance -= amountd;
        if (x == 2){
                System.out.printf("Ваш счет после снятия: %.2f гривен", d);
        }

    }

    public void Scan1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваш текущий баланс:");
        balance = scan.nextFloat();

        int k = 1;
        int i = 1;
        while (i > 0){
            System.out.println("Введите 1 для пополнения счета или 2 для снятия средств!");
            x = scan.nextInt();

            if (x != 1 && x !=2){
                System.out.println("Вы ввели неверную операцию!");
            }else {
                break;
            }
            i++;
        }

        switch (x){
            case 1:{
                while (k > 0){
                    System.out.println("Введите сумму для пополнения счета:" );
                    amountc = scan.nextFloat();
                    if (amountc < 0){
                        System.out.println("Вы ввели отрицательное число, а нужно положительное!");
                    }else {
                        break;
                    }
                    k++;
                }
                break;
            }
            case 2:{
                while (k > 0){
                    System.out.println("Введите сумму для снятия средств:" );
                    amountd = scan.nextFloat();
                    if (balance < amountd){
                        System.out.println("Недостаточно средств на счету!");
                    }else if (amountd < 0){
                        System.out.println("Вы ввели отрицательное число, а нужно положительное!");
                    }else {
                        break;
                    }
                    k++;
                }
                break;
            }
            default:
        }
      scan.close();
    }

}
