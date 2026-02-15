package PST54;
import java.util.Scanner;
public class ArrayPrint {

	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter number of elements: ");
		        int n = scanner.nextInt();

		        int[] arr = new int[n];

		        System.out.println("Enter array elements:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = scanner.nextInt();
		        }

		        System.out.println("Array elements are:");
		        for (int i = 0; i < n; i++) {
		            System.out.print(arr[i] + " ");
		        }

		        scanner.close();
		    }
		}

