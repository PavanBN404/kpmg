package methods;

public class PersonFactory {
	Person createPerson(String name,int age) {
		return new Person(name,age);
	}

}
