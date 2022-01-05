
public class Duplicate {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3 };
		duplicate(array);
	}

	public static boolean duplicate(int[] array) {
		boolean isDuplicate = false;

		for (int x = 1; x < array.length - 1; x++) {
			for (int y = x + 1; y < array.length; y++) {
				if (array[x] == array[y]) {
					isDuplicate = true;
					if (isDuplicate) {
						break;
					}
				}
				System.out.println(array[y]);
			}
		}
		return isDuplicate;
	}
}
