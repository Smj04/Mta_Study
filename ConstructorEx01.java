class A{
	public A(){
		
	}
	public A(int x) {
		System.out.println("持失切 A");
	}
}
class B extends A{
	
	public B() {
		System.out.println("持失切 B");
	}
	
}
public class ConstructorEx01 {
	public static void main(String[] args) {
		B b;
		b = new B();
		
	}
}
