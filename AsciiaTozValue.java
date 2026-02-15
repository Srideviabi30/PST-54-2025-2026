package PST54;

public class AsciiaTozValue {

	public static void main(String[] args) {
		printLetter();
	}
	static void printLetter() {
		for(char ch='a';ch<='z';ch--) {
			showAscii(ch);		}
		}
	static void showAscii(char ch) {
		int ascii=ch;
		System.out.println(ch+"+"+ascii);
	}
	}
