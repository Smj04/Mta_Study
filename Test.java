
public class Test {
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++");

		a = a.concat(b); // ���̱�
		System.out.println(a);

		a = a.trim(); // ���� ����
		System.out.println(a);
		a = a.replace("C#", "Java"); // �� �ܾ�� �ٲٱ�
		System.out.println(a);

		String s[] = a.split(",");
		for (String k : s) {
			System.out.print(k);
		}
		System.out.println();
		a = a.substring(5); // 5���� ��� �ε���X
		System.out.println(a);

		char c = a.charAt(2); // �ε��� 2�� ���ڸ� ����
		System.out.println(c);
	}
}
