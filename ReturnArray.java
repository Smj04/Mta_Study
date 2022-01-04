
public class ReturnArray {
	static int[] makeArray() {	//배열 리턴 메소드
		int temp[] = new int[4];
		for (int i = 0; i < temp.length; i++)
			temp[i] = i;	//배열의 원소를 0,1,2,3으로 초기화
		return temp;
	}

	public static void main(String[] args) {
		int intArray[];
		intArray = makeArray();	//새로운 배열 변수에 위 배열을 할당
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i] + " ");
		}
	}
}
