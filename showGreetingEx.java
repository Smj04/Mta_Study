
public class showGreetingEx {
	public static void main(String[] args) {
		showGreetingEx s = new showGreetingEx();
		String firstName = "john";
		System.out.println(s.showGreeting(firstName));
	}

	public String showGreeting(String firstName) {
		String welcomMsg = "안녕하세요.";
		welcomMsg += (firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase());
		// substring(0,1) 첫글자 대문자로 뽑아냄, substring(1) //나머지부터 끝까지 소문자로 변경
		return welcomMsg;
	}
}
