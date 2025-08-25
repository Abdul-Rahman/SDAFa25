package w01ex07PolymorphismDynamic;

public class DynamicPolymorphismTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;  // Reference of parent class
        b = new HBL();  // HBL object
        System.out.println("HBL Interest Rate: " + b.getRateOfInterest() + "%");
        b = new UBL();  // UBL object
        System.out.println("UBL Interest Rate: " + b.getRateOfInterest() + "%");
        b = new MBL();  // Meezan Bank object
        System.out.println("MBL Interest Rate: " + b.getRateOfInterest() + "%");
	}

}
