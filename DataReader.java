import java.util.Scanner;

public class DataReader {
	public static String main(String[] args) {
	return getBirthdate();	
	}

	private static String getBirthdate() {
		System.out.println("������ MMDDYYYY �������� �Է��Ͻʽÿ�");
		Scanner sc = new Scanner(System.in);
		String birthdate = sc.next();
		sc.close();
		return birthdate;
	}
}
