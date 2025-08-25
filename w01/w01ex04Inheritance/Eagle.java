package w01ex04Inheritance;

class  Eagle  extends Bird {
	public String name =  "eagle";
	public  int lifespan = 15;
	public  void  diveDownInWater()  {
		System.out.println("Dive down to catch fish...");
	}
	public  void  diveUpInWater()  {
		System.out.println("Dive up to pick target in air...");
	}
}
