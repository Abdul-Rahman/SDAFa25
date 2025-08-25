package w01ex02Interfaces;

public class Cow implements Animal, Cattle{
	public  void  eat()  {
	System.out.println("Eats grass.");
	}
	public  void  sound()  {
	System.out.println("Has a low-pitched mooooo sound.");
	}
	public  void  produceMilk()  {
	System.out.println("Produces up to 4 litres of milk per day.");
	}
}
