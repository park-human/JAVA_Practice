abstract class Calculator {
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
}

public class ExGoodCalc extends Calculator{
	@Override
	public int add(int a, int b) { // 추상 메소드 구현
		return a+b;
	}
	@Override
	public int subtract(int a, int b) { // 추상 메소드 구현
		return a-b;
	}
	@Override
	public double average(int[] a) { // 추상 메소드 구현
		double sum = 0;
		for (int i = 0 ; i < a.length; i++)
			sum += a[i];
		return sum/a.length;
	}
}