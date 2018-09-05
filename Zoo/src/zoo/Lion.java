package zoo;

public class Lion extends Panthera{
	
	Lion(String typeOfAnimal, String name, int age) {
		super(typeOfAnimal, name, age);
		roar();
		hunt();
	}

	protected void roar() {
		
		System.out.println("I roar as a "+super.typeOfAnimal);
	}

	protected void hunt() {
		
		System.out.println("I am a " + super.typeOfAnimal + ", watch me hunt");
	}

}
