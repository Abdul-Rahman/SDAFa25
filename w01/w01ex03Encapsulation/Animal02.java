package w01ex03Encapsulation;

// Demonstrates more encapsulation as compared to previous example
public class  Animal02  {
	private String name;
	private  double averageWeight;
	private  int numberOfLegs;

// Getter methods
	public String getName()  {
		return name;
	}
	public  double  getAverageWeight()  {
		return averageWeight;
	}
	public  int  getNumberOfLegs()  {
		return numberOfLegs;
	}
	
	public Animal02() {
		this.name = "Cow";
		this.averageWeight= 250.34;
		this.numberOfLegs= 4;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal02 myAnimal =  new Animal02();
		System.out.println("Name: "  + myAnimal.getName());
		System.out.println("Average weight: "  + myAnimal.getAverageWeight()  +  "kg");
		System.out.println("Number of legs: "  + myAnimal.getNumberOfLegs());
	}
}
