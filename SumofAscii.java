package PST54;
import java.util.Scanner;
public class SumofAscii {

	public static void main(String[] args) {
		
				String str = method();
				int sum = method1(str);
				System.out.println("Sum of ASCII values = "+sum);
		}
		static String method() {
		    Scanner sc = new Scanner(System.in);
		    System.out.print("Enter a string: ");
		    return sc.nextLine();
		}
		static int method1(String str) {
		    int sum = 0;
		    for (int i = 0; i < str.length(); i++) {
		        sum = sum + str.charAt(i);
		    }
		    return sum;
		    }
		}
