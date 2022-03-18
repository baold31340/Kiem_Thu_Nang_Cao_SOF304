
public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		if (age <= 18 || age > 65) {
			throw new IllegalArgumentException("Invalid age: " + age);
		}
	}



}
