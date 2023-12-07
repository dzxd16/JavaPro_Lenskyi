package de.telran.HomeWork061212.Ex2;

public class SimpleBank {
    public static void main(String[] args) {
        BankService bankService = new BankService();

        // Регистрация клиентов
        bankService.registerClient("Петя", 1985, TypeOper.CONSULT,9);
        bankService.registerClient("Вася", 1970, TypeOper.DEPOSITING, 9);
        bankService.registerClient("Саша", 1960, TypeOper.DEPOSITING, 10);
        bankService.registerClient("Зина", 1955, TypeOper.RECEIVING,11);

        // Обслуживание клиентов
        bankService.serviceClients();
    }
}
