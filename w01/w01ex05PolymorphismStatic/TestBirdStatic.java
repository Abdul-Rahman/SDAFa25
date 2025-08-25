package w01ex05PolymorphismStatic;

public class TestBirdStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Static polymorphism (method overloading)
		Bird myBird =  new Bird();
		myBird.fly();
		myBird.fly(10000);
		myBird.fly("eagle", 10000);
	}
}
