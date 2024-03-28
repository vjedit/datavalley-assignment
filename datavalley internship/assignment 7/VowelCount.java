import java.util.Scanner;

public class VowelCount{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int vowelCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = Character.toLowerCase(input.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }
        if (vowelCount > 0) {
            System.out.println("The string contains " + vowelCount + " vowels.");
        } else {
            System.out.println("The string does not contain any vowels.");
        }
    }
}