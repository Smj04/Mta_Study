
public class ForEach {
	enum Week {
		월, 화, 수, 목, 금, 토, 일
	} // 사용자가 만든 데이터 타입 enum

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int k : num)
			sum += k;
		System.out.println("합은 " + sum);

		String names[] = { "사과", "배", "바나나", "체리", "딸기", "포도" };
		for (String s : names)
			System.out.print(s + " ");

		for (Week day : Week.values())	//values() = Week의 테이터들을 추출
			System.out.println(day + "요일");
	}
}
