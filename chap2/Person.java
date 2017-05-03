package chap2;

public class Person {

	private final String name;
	private final String address;

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String toString() {
		return "[ Person: name = " + name + ", address = " + address + " ]";
	}

}
