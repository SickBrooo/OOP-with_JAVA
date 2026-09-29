package OOP_practiseProblems;

import java.util.Scanner;

public class BANK {
    String Name;
    int balance;

    BANK(String Name,int balance)
    {
        this.Name=Name;
        this.balance=balance;
    }
    int getBalance()
    {
        return balance;
    }
    void deposit(int ammount)
    {
        balance=balance+ammount;
    }
    void Withdraw(int ammount)
    {
        balance=balance-ammount;
    }
    void printInfo()
    {
        System.out.println(Name+" has "+balance+" taka");
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        input.nextLine();
        BANK[] arr=new BANK[n];
        for(int i=0;i<n;i++)
        {
            String Name=input.nextLine();
            int balance=input.nextInt();
            input.nextLine();
            arr[i]=new BANK(Name,balance);
        }
        arr[0].deposit(500);
        arr[1].Withdraw(500);
        for(int i=0;i<n;i++)
        {
           arr[i].printInfo();
        }
    }
}
