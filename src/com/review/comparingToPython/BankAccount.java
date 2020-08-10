package com.review.comparingToPython;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/*
Compare to compareJavaPython.py impl in pythonKit/oop/
 */
public class BankAccount {
    private double balance;
    private String accountNum;
    private String customerName;

    public BankAccount(String accNo, String cName, double bal) {
        accountNum = accNo;
        customerName = cName;
        balance = bal;
    }

    public String toString() {
        String ret = accountNum + " (" + customerName + "): " + balance;
        return ret;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public static void main(String[] args) {
        HashMap<String, BankAccount> accounts = new HashMap<String, BankAccount>();
        String accno = "";
        Scanner scan = new Scanner(System.in);

        BankAccount one = new BankAccount("NC321234", "Bob Jones", 435.88);
        accounts.put("NC321234", one);
        BankAccount two = new BankAccount("NC321234", "Sue Thomas", 845.99);
        accounts.put("NC544563", two);
        BankAccount three = new BankAccount("NC321234", "Tim Doe", 731.40);
        accounts.put("NC865552", three);
        BankAccount four = new BankAccount("NC321234", "Jim Gray", 328.24);
        accounts.put("NC154567", four);
        //BankAccount one = new BankAccount("NC321234", "Bob Jones", 435.88);
        accounts.put("NC912818", new BankAccount("NC912818", "Saray Jay", 596.34));

        do {
            System.out.print("Account Number: ");
            accno = scan.nextLine();

            if(!accno.equals("exit")) {
                if (accounts.containsKey(accno)) {
                    BankAccount tmp = accounts.get(accno);
                    System.out.println("Customer: " + tmp.getCustomerName());
                    System.out.println("Current Balance: " +
                            accounts.get(accno).getBalance());
                    System.out.println();
                }
                else {
                    System.out.println("No such account: " + accno);
                    System.out.println();
                }
            }
        } while(!accno.equals("exit"));

        System.out.println("\n\n");
        //iterate over accts
        Set accList = accounts.entrySet();
        Iterator iter = accList.iterator();
        while(iter.hasNext()) {
            Map.Entry mE = (Map.Entry) iter.next();
            //System.out.println(mE.getKey());
            System.out.println(mE.getValue());
        }
    }

}
