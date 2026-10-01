Program:

import java.util.Scanner;
 
interface Payment {
    double charge(double amount);
 
    String name();
}
 
class Upi implements Payment {
 
    public double charge(double a) {
        return 0;
    }
 
    public String name() {
        return "UPI";
    }
}
 
class Card implements Payment {
 
    public double charge(double a) {
        return a * 0.02;
    }
 
    public String name() {
        return "Card";
    }
}
 
class Cash implements Payment {
 
    public double charge(double a) {
        return 20;
    }
 
    public String name() {
        return "Cash";
    }
}
 
class NetBanking implements Payment {
 
    public double charge(double a) {
        return 12;
    }
 
    public String name() {
        return "NetBanking";
    }
}
 
public class PaymentDemo {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter number of payments: ");
        int n = sc.nextInt();
 
        for (int i = 1; i <= n; i++) {
 
            System.out.println("\nPayment " + i);
 
            System.out.print("Enter fee amount: ");
            double fee = sc.nextDouble();
 
            Payment[] modes = {
                    new Upi(),
                    new Card(),
                    new Cash(),
                    new NetBanking()
            };
 
            System.out.println("------------------------------------------");
 
            for (Payment m : modes) {
 
                double charge = m.charge(fee);
                double total = fee + charge;
 
                System.out.printf(
                        "%-10s charge %8.2f  total %10.2f%n",
                        m.name(), charge, total);
            }
 
            System.out.println("------------------------------------------");
        }
 
        sc.close();
    }
}

Output:

Enter number of payments: 2

Payment 1
Enter fee amount: 1000
------------------------------------------
UPI        charge     0.00  total    1000.00
Card       charge    20.00  total    1020.00
Cash       charge    20.00  total    1020.00
NetBanking charge    12.00  total    1012.00
------------------------------------------

Payment 2
Enter fee amount: 2020
------------------------------------------
UPI        charge     0.00  total    2020.00
Card       charge    40.40  total    2060.40
Cash       charge    20.00  total    2040.00
NetBanking charge    12.00  total    2032.00
------------------------------------------
