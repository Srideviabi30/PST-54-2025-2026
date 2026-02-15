package PST54;
import java.util.Scanner;
public class AsciiString {

	public static void main(String[] args) {

		        String str = Method();
		        Method1(str);
		    }

		    static String Method() {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Hello World: ");
		        return sc.nextLine();
		    }

		    static void Method1(String str) {
		        for (int i = 0; i < str.length(); i++) {
		            char a = str.charAt(i);
		            int ascii = a;
		            System.out.println(a + " = " + ascii);
		        }
		    }
		}
