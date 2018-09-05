package zoo;

abstract public class Canis extends Animal{
	
	Canis(String typeOfAnimal) {
		super(typeOfAnimal); 
	}
	
	Canis(String typeOfAnimal, String name, int age){
		
		super(typeOfAnimal);
		setName(name);
		setAge(age);		
	}
	
	protected abstract void howl();

}
