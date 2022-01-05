
public class Test {
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++");

		a = a.concat(b); // 붙이기
		System.out.println(a);

		a = a.trim(); // 공백 제거
		System.out.println(a);
		a = a.replace("C#", "Java"); // 뒤 단어로 바꾸기
		System.out.println(a);

		String s[] = a.split(",");
		for (String k : s) {
			System.out.print(k);
		}
		System.out.println();
		a = a.substring(5); // 5까지 출력 인덱스X
		System.out.println(a);

		char c = a.charAt(2); // 인덱스 2번 문자를 추출
		System.out.println(c);
	}
}
