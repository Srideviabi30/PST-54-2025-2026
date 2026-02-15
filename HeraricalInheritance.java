package PST54;

public class HeraricalInheritance {

	public static void main(String[] args) {

		        A obj1 = new A();
		        B obj2 = new B();

		        obj1.Actor();
		        obj2.Actor();
		    }
		}

	
		class Vijay {
		    void Actor() {
		        System.out.println("Vijay is an Actor");
		    }
		}

		
		class A extends Vijay {
		    void Actor() {
		        System.out.println("Atharva is an Actor");
		    }
		}

	
		class B extends Vijay {
		    void Actor() {
		        System.out.println("SK is an Actor");
		    }
		}
