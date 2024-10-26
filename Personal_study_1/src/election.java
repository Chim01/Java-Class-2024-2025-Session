import java.util.Scanner;
public class election{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter your age: ");
        int age= scanner.nextInt();

        System.out.printf("Enter your nationality:");
        String nationality = scanner.nextLine();

        if (age > 17 && nationality.equals("Nigeria")) {
            System.out.println("Eligible to vote");
        }
        else {
            System.out.println("Not eligible to vote");
        }

    }
}
