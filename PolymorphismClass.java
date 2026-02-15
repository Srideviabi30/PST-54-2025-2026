package PST54;
public class PolymorphismClass {

	public static void main(String[] args) {
		int a=10,b=20;
    System.out.println(add(a,b));
    
	System.out.println(sub(a,b));
	System.out.println(Mul(a,b));
	System.out.println(Div(a,b));
	
	}
	public static int add(int a,int b) {
		return a+b;
	}
	
	public static  int sub(int a,int b) {
		
        return a-b;
	}
	
	public static int Mul(int a,int b) {
	
		return a*b;
		
	}
	public static int Div(int a,int b) {
	
		return a/b;
	}
	}
