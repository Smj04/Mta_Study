class Child1 {
	public Child1() {
		System.out.println("������ A");
	}

	public Child1(int x) {
		System.out.println("�Ű����������� A");
	}
	
}

class Child2 extends Child1 {
	
	public Child2() {
		System.out.println("������ B");
	}

	public Child2(int x) {
		System.out.println("�Ű����������� B");
	}
}

public class ConstructorEx02 {
	public static void main(String[] args) {
		Child2 c2;
		c2 = new Child2(5);

	}
}
