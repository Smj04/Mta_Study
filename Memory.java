
public class Memory {
	public static void main(String[] args) {
		String s1 = "Hello World";
		String s2 = "Hello World";
		String s4 = new String("Hello World"); //new�� ��ü�� ���� ����!
		String s3 = s2;	//���ο� s3������ s2�� ����
		s1 = "ab";
		s2 = "de";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		if(s1==s2) System.out.println("s1�� s2�� ���� ��ü ����");
		else if(s2==s3) System.out.println("s2�� s3�� ���� ��ü ����");
		System.out.println(s1==s4);
	}
}
