import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of electricity units: ");
        int units = sc.nextInt();

        if (units > 0) {
            if (units <= 100) {
                System.out.println("Total bill: ₹" + (units * 1.5));
            } else if (units <= 200) {
                System.out.println("Total bill: ₹" + (units * 2.5));
            } else if (units <= 300) {
                System.out.println("Total bill: ₹" + (units * 4));
            } else {
                System.out.println("Total bill: ₹" + (units * 6));
            }
        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
