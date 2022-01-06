
public class Memory {
	public static void main(String[] args) {
		String s1 = "Hello World";
		String s2 = "Hello World";
		String s4 = new String("Hello World"); //new는 객체를 새로 만듬!
		String s3 = s2;	//새로운 s3공간에 s2를 복제
		s1 = "ab";
		s2 = "de";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		if(s1==s2) System.out.println("s1과 s2은 같은 개체 참조");
		else if(s2==s3) System.out.println("s2과 s3은 같은 개체 참조");
		System.out.println(s1==s4);
	}
}
