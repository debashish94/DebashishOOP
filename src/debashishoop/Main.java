package debashishoop;

public class Main {
	
	public static void main(String[] args) {
		//polymorohism to create dog and assign to animal
		Animal tiger = new Tiger("Wild Cat", "Yellow", 4, "Roaaaar", 2); //create a tiger
		Animal dog = new Dog("Pup", "White", 4, "John", false); //create a dog
		Cat cat = new Cat("Cat", "Gray", 4, "Meow");
		
		//print details
		System.out.println(tiger);
		System.out.println("\n"+dog);
		System.out.println("\n"+cat);
		
		//sound of tiger
		System.out.println();
		tiger.sound();
		dog.sound();
		cat.sound();
		
		System.out.println();
		
		//take care of pet
		Petable pet = (Petable) dog;
		pet.takeCare();
		
	}
}