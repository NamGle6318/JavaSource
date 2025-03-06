package oop;

public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account("123-45-678", "정현우", 1474525);

        account.deposit(10000000);

        account.withdraw(1234567);
        System.out.println(account.getBalance());

    }
}
