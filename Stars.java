package PST54;
import java.util.Scanner;

public class Stars {

	public static void main(String[] args) {
	
		        star2 obj1 = new star2();
		        obj1.vertical();
		    }
		}

		class star {

		    void horizontal() {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the Number: ");
		        int n = sc.nextInt();

		        for (int i = 1; i <= n; i++) {
		            System.out.print("* ");
		        }
		    }
		}

		class star2 {

		    void vertical() {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the Number: ");
		        int n = sc.nextInt();

		        for (int i = 1; i <= n; i++) {
		            System.out.println("*");
		        }
		    }
		}
