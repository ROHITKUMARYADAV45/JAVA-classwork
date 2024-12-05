import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Initialize the array
        int[] arr = new int[n];

        // Take input for the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate the sum of the array
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        // Output the sum
        System.out.println("The sum of the array elements is: " + sum);

        scanner.close();
    }
}
