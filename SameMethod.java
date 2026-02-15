package PST54;

public class SameMethod {

	public static void main(String[] args) {
	int a=40,b=70,c=60;
	
		System.out.print(add(a,b));
		System.out.print(add(a,b,c));
	}
		
		public static int add(int a,int b) {
			return a+b;
		}	
		public static int add(int a,int b,int c) {
			return a+b+c;
		}
		}


		