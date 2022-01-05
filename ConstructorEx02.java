class Child1 {
	public Child1() {
		System.out.println("생성자 A");
	}

	public Child1(int x) {
		System.out.println("매개변수생성자 A");
	}
	
}

class Child2 extends Child1 {
	
	public Child2() {
		System.out.println("생성자 B");
	}

	public Child2(int x) {
		System.out.println("매개변수생성자 B");
	}
}

public class ConstructorEx02 {
	public static void main(String[] args) {
		Child2 c2;
		c2 = new Child2(5);

	}
}
