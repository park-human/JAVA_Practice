import java.util.Scanner;
public class ExScanner {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("나이, 체중, 신장을 빈 칸으로 분리해 순서대로 입력하세요.");
		System.out.println("당신의 나이는 " + a.nextInt() + "세입니다.");
		System.out.println("당신의 체중은 " + a.nextDouble() + "kg입니다.");
		System.out.println("당신의 신장은 " + a.nextDouble() + "cm입니다.");

	}

}
