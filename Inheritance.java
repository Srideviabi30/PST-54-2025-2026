package PST54;

public class Inheritance {

	public static void main(String[] args) {
	

		        ClassB obj1 = new ClassB();
		        obj1.IT();      
		        obj1.ECE();     
		    }
		}

		
		class ClassA {
		    void ECE() {
		        System.out.println("Electronics Communication");
		    }
		}

		
		class ClassB extends ClassA {
		    void IT() {
		        System.out.println("Information Technology");
		    }
		}
