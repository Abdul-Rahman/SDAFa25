package w01ex03Encapsulation;

//Demonstrates more encapsulation as compared to previous example
public class  Animal04  {
	private String name;
	private  double averageWeight;
	private  int numberOfLegs;

	void displayDetails()  {
		System.out.println("Name: "  + this.name);
		System.out.println("Average weight: "  + this.averageWeight+  "kg");
		System.out.println("Number of legs: "  + this.numberOfLegs);
	}
	
	public Animal04() {
		this.name = "Dog";
		this.averageWeight= 25.34;
		this.numberOfLegs= 4;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal04 myAnimal =  new Animal04();
		myAnimal.displayDetails();
		
	}
}
