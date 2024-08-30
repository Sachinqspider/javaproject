package ProgramTheroy;

public class MethodOverLoading {
public static void add()
{
	int a=10;
	int b=30;
	System.out.println(a+b);
}
public static void add(int a)
{
	int b=20;
	System.out.println(a+b);
	
}
public static void add(int a, int b) {
	System.out.println(a+b);
}

}
