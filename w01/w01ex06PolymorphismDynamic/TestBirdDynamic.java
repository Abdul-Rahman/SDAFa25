package w01ex06PolymorphismDynamic;

public class TestBirdDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dynamic polymorphism (method overriding)
		Animal myAnimal =  new Animal();
		myAnimal.eat();
		Bird myBird =  new Bird();
		myBird.eat();
	}
}
