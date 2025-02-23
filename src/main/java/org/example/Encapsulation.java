package org.example;


class BankAccount {
    private double balance;
    private String OwnerAccount;

    BankAccount(String OwnerAccount, double balance) {
        this.OwnerAccount = OwnerAccount;
        if (balance > 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    /*Lay so du*/
    public double getBalance() {
        return this.balance;
    }

    /*Nap tien*/
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("You can enter the amount of money > 0");
        }
    }

    /* Rut tien*/
    public void withdraw(double amount) {
        if (amount <= this.balance || this.balance > 0) {
            this.balance -= amount;
        } else {
            System.out.println("So du khong du de rut money");
        }
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        BankAccount user = new BankAccount("Danny", 0);
        System.out.println("The beginning Balance: " + user.getBalance());
        user.deposit(5000);
        System.out.println("The current balance: " + user.getBalance());
        System.out.println("Ngai danny co viec can rut tien");
        user.withdraw(2000);
        System.out.println("The rest" + user.getBalance());
    }
}
