package ProgramTheroy;


public class recrations {
	public static void display()
	{
		System.out.println("he is walking");
		display();
	}

	public static void main(String[] args) {
		System.out.println("main start");
		display();
		System.out.println("main end");
	}
}
