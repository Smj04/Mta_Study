class A{
	public A(){
		
	}
	public A(int x) {
		System.out.println("������ A");
	}
}
class B extends A{
	
	public B() {
		System.out.println("������ B");
	}
	
}
public class ConstructorEx01 {
	public static void main(String[] args) {
		B b;
		b = new B();
		
	}
}
