package com.company.HomeWork17;
//Создать класс Сберегательный счет. Используйте статическую переменную «годовая процентная ставка» для хранения годовой процентной ставки всех владельцев счетов. Каждый объект класса содержит переменную частного сбережения, указывающую сумму, которую хранитель в настоящее время имеет при внесении. Написать метод для расчета ежемесячного процента. Напишите статический метод «изменение процентной ставки», который устанавливает «годовую процентную ставку» на новое значение.
//Напишите программу для тестирования класса Сберегательный счет. Создайте два объекта сберегательной учетной записи: saver1 и saver2, с балансом $ 2000.00 и $ 3000.00 соответственно. Установить годовую процентную ставку до 4%, затем рассчитать ежемесячный процент и распечатать новые балансы для обоих вкладчиков. Затем установите годовую процентную ставку на 5%, рассчитайте проценты следующего месяца и распечатайте новые балансы для обоих вкладчиков.
public class SavingsAccount{

    private static float annualinterestrate = 0f;
    private float savingsbalance;

    public SavingsAccount(float balance) {
        this.savingsbalance = balance;
    }

    public static void setAnnualinterestrate(float t) {
        if (t >= 0 && t <= 1)
            annualinterestrate = t;

    }

    private float MonthlyInterest() {
        return (savingsbalance * annualinterestrate) / 12;
    }

    public float getSavingsbalance() {
        return savingsbalance + MonthlyInterest();
    }

    public String toString() {
        return String.format("Баласн через месяц: %.2f", getSavingsbalance());
    }
}
    class SavingsAccountTest {
        public static void main(String[] args) {

            SavingsAccount saver1 = new SavingsAccount(2000);
            SavingsAccount saver2 = new SavingsAccount(3000);

            SavingsAccount.setAnnualinterestrate(0.01f);

            System.out.println("C учетом 1%");
            System.out.println("Сберегательная учетная запись 1 клиента: " + saver1 + " гривен");
            System.out.println("Сберегательная учетная запись 2 клиента: " + saver2 + " гривен");

            SavingsAccount.setAnnualinterestrate(0.05f);

            System.out.println("C учетом 5%");
            System.out.println("Сберегательная учетная запись 1 клиента: " + saver1 + " гривен");
            System.out.println("Сберегательная учетная запись 2 клиента: " + saver2 + " гривен");
        }
    }
