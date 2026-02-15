package PST54;
import java.util.Scanner;
public class AsciiCharacter {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Character");
    char ch = sc.next().charAt(0);
System.out.println("ASCII value: " + (int) ch);
	}

}
