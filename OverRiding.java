package PST54;

public class OverRiding {

	public static void main(String[] args) {
		
		Animal obj2=new Animal();
		obj2.tiger();
		}

}
class Birds {
	 void Peacock(){
		 System.out.println("National Bird");
		 }
		 
	}

class Animal extends Birds{
	 void tiger() {
		 System.out.println("tiger is vijay movie");
	 }
	 
	 
}
