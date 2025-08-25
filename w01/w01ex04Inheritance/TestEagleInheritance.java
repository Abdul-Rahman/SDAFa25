package w01ex04Inheritance;

public class TestEagleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eagle myEagle =  new Eagle();
		System.out.println("Name: "  + myEagle.name);  
		System.out.println("Reproduction: "  + myEagle.reproduction); //generalization
		System.out.println("Outer covering: "  + myEagle.outerCovering); //generalization
		System.out.println("Lifespan: "  + myEagle.lifespan); //specialization
		myEagle.flyUp(); //parent
		myEagle.flyDown(); //parent
		myEagle.diveDownInWater(); //specialization
		myEagle.diveUpInWater(); //specialization
		
		System.out.println();
		
		Bird myBird = new Bird();
		System.out.println("Reproduction: "  + myBird.reproduction);
		System.out.println("Outer covering: "  + myBird.outerCovering);
		myBird.flyUp();
		myBird.flyDown();
	}
}
