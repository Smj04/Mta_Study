
public class ForEach {
	enum Week {
		��, ȭ, ��, ��, ��, ��, ��
	} // ����ڰ� ���� ������ Ÿ�� enum

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int k : num)
			sum += k;
		System.out.println("���� " + sum);

		String names[] = { "���", "��", "�ٳ���", "ü��", "����", "����" };
		for (String s : names)
			System.out.print(s + " ");

		for (Week day : Week.values())	//values() = Week�� �����͵��� ����
			System.out.println(day + "����");
	}
}
