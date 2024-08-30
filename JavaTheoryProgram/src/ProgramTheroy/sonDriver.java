package ProgramTheroy;

public class sonDriver {

	public static void main(String[] args) {
		Father f= new son();
		System.out.println(f.age);
		f.walk();

		System.out.println("________________");
		son s = (son) f;
		System.out.println(s.age);
		System.out.println(s.name);
		s.walk();
		s.eat();
	}

}
