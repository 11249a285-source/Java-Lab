Program:

import java.util.Scanner;

public class Rebate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        if (days < 26)
            amount = amount - (amount * 0.10);
        else
            amount = amount;

        System.out.println("Final amount = " + amount);

        sc.close();
    }
}

Output:

Enter number of days: 20
Enter amount: 2000
Final amount = 1800.0
