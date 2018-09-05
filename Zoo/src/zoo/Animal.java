package zoo;

abstract public class Animal {
	
	private String name;
	private int age;
	protected String typeOfAnimal;
	
	Animal(String typeOfAnimal) {
		this.typeOfAnimal = typeOfAnimal; 
	}
	
	protected abstract void hunt();
	
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getAge() {
		return age;
	}
	protected void setAge(int age) {
		this.age = age;
	}
	

}
