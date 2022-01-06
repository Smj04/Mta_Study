
public class Test02 {
	public static void main(String[] args) {
		try {
			int i = 1 / 0;
			System.out.println("try");
		} catch (ArithmeticException e1) {
			System.out.println(e1);
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally");
		}
	}
}
