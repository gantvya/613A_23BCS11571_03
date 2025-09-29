import java.util.*;
class Account{
    String name;
    int accNo;
    double balance;

Account(String name , int accNo,double balance){
    this.name= name;
    this.accNo = accNo;
    this.balance=balance;
}
void   deposit(double amount){
    if(amount>=0){
        balance = balance+amount;
    }
}
boolean withdraw(double amount){
    if(amount<=balance && amount>=0){
        balance = balance - amount;
        return true;
    }
    return false;
}
}
public class BankingSystem {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int accNo = sc.nextInt();
        double initalBal = sc.nextDouble();
        double depositAmt = sc.nextDouble();
        double withdrawAmt = sc.nextDouble();
        if(accNo<=0||initalBal<0||withdrawAmt<0||depositAmt<0){
            System.out.println("Valid values");
            return;
        }
        Account acc = new Account(name, accNo, initalBal);
        acc.deposit(depositAmt);
        if(acc.withdraw(withdrawAmt)){
            System.out.println(acc.balance);
        }
        else{
       System.out.println("insufficient balance");
        }
       sc.close();
    }
}
