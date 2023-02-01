class Myclass {public int a;}
public class ExClass {
	public static void main(String[] args) {
		Myclass ob1 = new Myclass();
		Myclass ob2 = new Myclass();
		ob1.a = 10;
		ob2.a = 99;
		System.out.printf("ob1.a = %d\n", ob1.a);
		System.out.printf("ob2.a = %d\n", ob2.a);
	}
}