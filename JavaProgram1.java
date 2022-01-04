
public class JavaProgram1 {
	int x = 25; //加己
	public static void main(String[] args) {
		JavaProgram1 app = new JavaProgram1(); 
		{
			int x = 5;
		}
		{
			int x = 10;
		}
		int x = 100;
		System.out.println(x); //100
		System.out.println(app.x); //25
	}

	public JavaProgram1() { //积己磊何磐 角青凳!
		int x = 1;
		System.out.println(x);
	}
}
