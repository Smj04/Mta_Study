
public class ReturnArray {
	static int[] makeArray() {	//�迭 ���� �޼ҵ�
		int temp[] = new int[4];
		for (int i = 0; i < temp.length; i++)
			temp[i] = i;	//�迭�� ���Ҹ� 0,1,2,3���� �ʱ�ȭ
		return temp;
	}

	public static void main(String[] args) {
		int intArray[];
		intArray = makeArray();	//���ο� �迭 ������ �� �迭�� �Ҵ�
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i] + " ");
		}
	}
}
