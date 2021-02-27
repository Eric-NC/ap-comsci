package eric.unit5;

// EXERCISE 1

/*
You’ve been hired to create a software system for the Awesome Animal Clinic! They would like to keep track of their animal patients. Here are some attributes of the pets that they would like to track:

- Name
- Age
- Weight
- Type (dog, cat, lizard, etc.)
- Breed

1. Create a class that keeps track of the attributes above for pet records at the animal clinic. Decide what instance variables are needed and their data types. Make sure you use int, double, and String data types. Make the instance variables private.
2. Create 2 constructors, one with no parameters and one with many parameters to initialize all the instance variables.
3. Create Accessor (get) methods for each of the instance variables.
4. Create a toString() method that returns all the information in a pet record.
5. In the main method below, create 3 pet objects and call their constructors, accessor methods, and toString methods to test all of your methods.
6. Make sure you use good commenting!
*/

// EXERCISE 2

/*
Copy your Awesome Animal Clinic Pet class from the last exercise.

Add set methods for each of the 5 instance variables. Make sure you use good commenting!

Test each of the set methods in the main method.
*/

public class Pet {
    public static final String UNKNOWN_BREED = "Unknown"; 

    // Pet properties.
    // Breed could also be an enum, but it'd have to depend on pet type, so it'd be massive pain to handle.
    // I'm not doing that for now.
    private String name = "No-Name";
    private int monthsOld = 0;
    private double lbs = 0;
    private PetType type = PetType.Unknown;
    private String breed = UNKNOWN_BREED;

    // Default ctor.
    public Pet() {}

    // VSCode generated ctor.
	public Pet(String name, int ageInMonths, double weightInLbs, PetType type, String breed) {
		this.name = name;
		this.monthsOld = ageInMonths;
		this.lbs = weightInLbs;
		this.type = type;
		this.breed = breed;
	}

    // Getters.
    public String getName() { return name; }
    public int getAgeInMonths() { return monthsOld; }
    public double getWeightInLbs() { return lbs; }
    public PetType getType() { return type; }
    public String getBreed() { return breed; }

    // Setters.
    public void setName(String name) { this.name = name; }
    public void setAgeInMonths(int monthsOld) { this.monthsOld = monthsOld; }
    public void setWeightInLbs(int lbs) { this.lbs = lbs; }
    public void setType(PetType type) { this.type = type; }
    public void setBreed(String breed) { this.breed = breed; }

    // Pretty self-explanatory.
    public String toString() {
        return String.format("\"%1$s\". %2$s, breed %3$s. %4$s months old and %5$s pounds.", name, type, breed, monthsOld, lbs);
    }
}

class PetTest {
    public static void main(String[] args) {
        var pet = new Pet();
        System.out.println(pet);

        pet = new Pet("Bingus", 27, 10, PetType.Cat, "Sphynx");
        System.out.println(pet);
        System.out.println(pet.getName());
        pet.setName("Mingus");
        System.out.println(pet.getName());
    }
}
