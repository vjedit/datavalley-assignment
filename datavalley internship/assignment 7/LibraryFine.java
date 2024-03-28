import java.util.Scanner;
public class LibraryFine
{
    public static void main(String[] args)
{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days late: ");
        int daysLate = scanner.nextInt();
        double fine = 0;
        if (daysLate > 0 && daysLate <= 7) {
            fine = 0.50;
        } else if (daysLate > 7 && daysLate <= 14) {
            fine = 1;
        } else if (daysLate > 14 && daysLate <= 21) {
            fine = 5;
        } else if (daysLate > 21) {
            System.out.println("Your membership has been canceled.");
            return;
        }
        System.out.println("The fine is Rs. " + fine + "/-.");
    }
}