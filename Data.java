import java.util.Scanner;

public class Data {
	public static void main(String[] args) {
		Scanner sc = new Scanner("1. 탁월  2. 우수 3. 양호 4. 불량");
		Object data1 = sc.hasNext();
		Object data2 = sc.hasNext();
		Object data3 = sc.hasNext();
		Object data4 = sc.hasNext();
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
	}
}
