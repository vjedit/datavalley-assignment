import java.util.Scanner;
public class EmployeeBonus
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the current year: ");
int currentYear = scanner.nextInt();
System.out.print("Enter the year of joining: ");
int joiningYear = scanner.nextInt();
int serviceYears = currentYear - joiningYear;
int bonus = 0;
if (serviceYears > 5)
{
bonus = 5000;
}
else if (serviceYears >= 3 && serviceYears <= 5)
{
bonus = 3000;
}
if (bonus > 0)
{
System.out.println("Bonus of Rs. " + bonus + "/- awarded.");
}
else
{
}
}
}