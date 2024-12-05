import java.util.Scanner;

public class sum
 {
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter First Number: ");
        int first = scanner.nextInt();
        System.out.println("Enter Second Number: ");
        int second = scanner.nextInt();
        System.out.println(first + second);
        scanner.close();
    }
}
