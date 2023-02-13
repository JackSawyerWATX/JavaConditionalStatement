import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number 1-10");
            int i = scanner.nextInt();

        if (i < 5) {
            System.out.println("less");
        } else if (i > 5) {
            System.out.println("more");
        } else {
            System.out.println("same");
        }
    }
}