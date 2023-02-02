public class ExCalcTestProg{
	public static void main(String[] args) {
		ExGoodCalc c = new ExGoodCalc();
		System.out.println(c.add(2,3));
		System.out.println(c.subtract(2,3));
		System.out.println(c.average(new int[] {2,3,4}));
	}
}