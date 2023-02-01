class Person{
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
}

class Student extends Person {
	public void set() {
		age = 30; // 슈퍼 클래스의 디폴트 멤버 접근 가능
		name = "홍길동"; // 슈퍼 클래스의 public 멤버 접근 가능
		height = 175; // 슈퍼 클래스의 protected 멤버 접근 가능
		// weight = 99; // ERROR. 슈퍼 클래스의 private 접근 불가
		setWeight(99); // private 멤버 weight은 setWeight()으로 간접 접근
	}
	public void showStudent() { // 컬러 점의 좌표 출력
		getWeight();
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + height);
	}
}

public class ExInheritance {
	public static void main(String[] args) {
		Student s = new Student();
		s.set();
		s.showStudent();
		System.out.println("몸무게 : " + s.getWeight() + "kg");
	}
}
