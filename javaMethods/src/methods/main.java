package methods;

public class main {

	public static void main(String[] args) {
//		Calculator calc=new Calculator();
//		Greeting greeting=new Greeting();
//		greeting.greet("Pavan Belur Narayana");
//	int result=	calc.multiplyAndAdd(3,4,5);
//	System.out.println("Result: "+result);
// //		int result=calc.add(1, 2);
////		int result1=calc.add(1, 2, 3);
////		System.out.println("Sum: "+result);
////		System.out.println("Sum1: "+result1);
//		calc.printMessage("Hello Java!!");
		PersonFactory factory=new PersonFactory();
		Person p=factory.createPerson("Pavan", 21);
		p.displayInfo();
		
		

	}

}
