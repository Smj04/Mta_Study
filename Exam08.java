
public class Exam08 {

	public void printInt() {
		if (true) {
			int num = 1;
			if (num > 0) {
				num++;
			}
		}

		int num = 1;
		addOne(num);
		num = num - 1;
		System.out.println(num);
	}

	public void addOne(int num) {
		num = num + 1;
	}
}
