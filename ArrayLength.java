import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		int intArray[] = new int[5];
		int sum = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.print(intArray.length + "개의 정수를 입력하세요>>");
		for (int i = 0; i < intArray.length; i++) //입력받는 반복문
			intArray[i] = scanner.nextInt();

		for (int i = 0; i < intArray.length; i++) //총합 구하는 반복문
			sum += intArray[i];

		System.out.println("평균은 " + (double) sum / intArray.length); //평균계산
		scanner.close();
	}
}
