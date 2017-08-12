package debashishoop;

//Defines an animal (Abstract Class)
public abstract class Animal {

	// static field
	private static int counter = 1;

	// encapsulation
	private int id;
	private String breed;
	private String color;
	private int numLegs;

	// final field
	private static final int DEFAULT_LEGS = 4;

	public Animal(String breed, String color, int numLegs) {
		id = counter++;
		this.breed = breed;
		this.color = color;
		setNumLegs(numLegs); // use setter to set legs
	}

	public void setNumLegs(int numLegs) {
		if (numLegs <= 0) // if invalid legs
			numLegs = DEFAULT_LEGS;
		else
			this.numLegs = numLegs;
	}

	public int getId() {
		return id;
	}

	public String getBreed() {
		return breed;
	}

	public String getColor() {
		return color;
	}

	public int getNumLegs() {
		return numLegs;
	}

	public abstract void sound();

	public String toString() {
		return "ID: " + id + "\nBreed: " + breed + "\nColor: " + color + "\nNumber of Legs: " + numLegs;
	}

}
