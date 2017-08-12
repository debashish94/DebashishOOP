package debashishoop;
//Represwnts adog that can be a pet
public class Dog extends Animal implements Petable {
	private String owner;
	private boolean hasTail;

	public Dog(String breed, String color, int numLegs, String owner, boolean hasTail) {
		super(breed, color, numLegs); // call super class constructor

		this.owner = owner;
		this.hasTail = hasTail;
	}

	public String getOwner() {
		return owner;
	}

	public boolean isHasTail() {
		return hasTail;
	}

	public String toString() {
		return super.toString() + "\nOwner: " + owner + "\nHas Tail: " + hasTail;
	}

	@Override
	public void sound() {
		System.out.println("Dog says Bowwwww!");
	}

	@Override
	public void takeCare() {
		System.out.println("Dog was taken out for walk by "+owner);
	}

}
