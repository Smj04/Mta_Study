
public class showGreetingEx {
	public static void main(String[] args) {
		showGreetingEx s = new showGreetingEx();
		String firstName = "john";
		System.out.println(s.showGreeting(firstName));
	}

	public String showGreeting(String firstName) {
		String welcomMsg = "�ȳ��ϼ���.";
		welcomMsg += (firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase());
		// substring(0,1) ù���� �빮�ڷ� �̾Ƴ�, substring(1) //���������� ������ �ҹ��ڷ� ����
		return welcomMsg;
	}
}
