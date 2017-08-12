package debashishoop;

//Represents a cat
public class Cat extends Animal {
	
	private String sound;

	public Cat(String breed, String color, int numLegs, String sound) {
		super(breed, color, numLegs);
		this.sound = sound;
	}
	
	public String getSound() {
		return sound;
	}
	
	public String toString() {
		return super.toString()+"\nSound: "+sound;
	}

	@Override
	public void sound() {
		System.out.println("Cat says "+sound);
	}
	
}
