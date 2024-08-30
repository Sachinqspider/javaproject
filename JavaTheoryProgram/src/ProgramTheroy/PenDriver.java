package ProgramTheroy;

public class PenDriver {
	public static void main(String[] args) {
		Pen P = new Pen(10,"Classmate");
		System.out.println("Pen Cost : "+P.getcost());
		System.out.println("Pen Brand : "+P.getbrand());

		System.out.println("_____________________");

		P.setcost(20);
		P.setbrand("cello");

		System.out.println("Pen Cost : "+P.getcost());
		System.out.println("Pen Brand : "+P.getbrand());

	}



}

