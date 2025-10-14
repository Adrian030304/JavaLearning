package def;

public class Student {
	private String name;
	private int age;
	
	public Student(String initialName) {
		this.age = 0;
		this.name = initialName;
	}
	
	public String toString() {
		return this.name + ", age " + this.age + " years ";
	}
	
	public void growOlder() {
		if (this.age < 30) {
			this.age += 1;
		}
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public int returnAge() {
		return this.age;
	}
}
