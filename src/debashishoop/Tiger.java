package debashishoop;
//Defines a tiger that is animal and a cat
public class Tiger extends Cat{
	private int cubs;

	public Tiger(String breed, String color, int numLegs, String sound, int cubs) {
		super(breed, color, numLegs, sound);
		this.cubs = cubs;
	}
	
	public int getCubs() {
		return cubs;
	}
	
	public String toString() {
		return super.toString()+"\nCubs: "+cubs;
	}
	
}
