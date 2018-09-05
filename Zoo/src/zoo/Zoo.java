package zoo;

import java.util.ArrayList;

public class Zoo {

	public static void main(String[] args) {
		
		ArrayList<Animal> animalList = new ArrayList<>();
		
		animalList.add(new Coyote("Coyote", "Wylie", 15));
		animalList.add(new Dingos("Dingo", "Dingbat", 22));
		animalList.add(new Wolf("Wolf", "Wolfy", 56));
		animalList.add(new Lion("Lion", "Leo", 45));
		animalList.add(new Lion("Tiger", "Tony", 13));
		animalList.add(new Lion("Leopard", "Leopold", 65));
		
		for(Animal x : animalList) {
			System.out.println("My animal is a "+x.typeOfAnimal+ " called " + 
								x.getName() + " and I am " +x.getAge() + " years old.");
		}

	}

}
