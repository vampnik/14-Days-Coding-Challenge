import java.util.Scanner;
public class ATM1{
    public static void main(String [] args){
        double amount;
        double balance;
        double bCharges = 0.5;
        Scanner sc = new Scanner (System.in);
        amount = sc.nextInt();
        balance = sc.nextFloat();
        if (0<amount && amount<=2000 && balance>=0 && balance<=2000 && amount%5==0){
            if (amount+bCharges <= balance){
                System.out.println( balance - amount - bCharges);
            }
            else {
                System.out.println(balance);
            }
        }
        else {
            System.out.println(balance);
        }
        sc.close();
    }
}