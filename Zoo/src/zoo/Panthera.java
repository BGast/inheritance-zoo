package zoo;

abstract public class Panthera extends Animal{
	
	Panthera(String typeOfAnimal) {
		super(typeOfAnimal); 
	}
	
	Panthera(String typeOfAnimal, String name, int age){
		
		super(typeOfAnimal);		
		setName(name);
		setAge(age);		
	}
	
	protected abstract void roar();
}
