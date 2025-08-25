package w01ex02Interfaces;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eagle myEagle =  new Eagle();
		myEagle.eat();
		myEagle.sound();
		myEagle.fly();
		System.out.println("Number of legs: "  + Bird.numberOfLegs);
		System.out.println("Outer covering: "  + Bird.outerCovering);
		System.out.println();
		
		Cow myCow =  new Cow();
		myCow.eat();
		myCow.sound();
		myCow.produceMilk();
		System.out.println("Number of legs: "  + Cow.numberOfLegs);
		System.out.println("Outer covering: "  + Cow.outerCovering);
	}
}
