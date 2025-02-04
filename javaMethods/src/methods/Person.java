package methods;
//method returning an object
public class Person {
	String name;
	int age;
	
//constructor
Person(String name,int age){
	this.name=name;
	this.age=age;
}
public void displayInfo() {
	System.out.println("Name: "+name+" and Age: "+age);
}
}
