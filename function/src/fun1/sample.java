package fun1;

public class sample {
public static void f1()
{
	System.out.println("same class function");
}
public static void main(String[] args) {
	System.out.println("main fuction");
	f1();
	fun2.f2();
}
}
