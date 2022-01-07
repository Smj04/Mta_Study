
public class vaildateEntriesEx {
	public static void main(String[] args) {
		String[] a = { "hello", "world", "2108", "mirim", "bye" };
		boolean b = vaildateEntries(a);
		System.out.println(b);
	}

	public static boolean vaildateEntries(String[] entries) {
		boolean allValldEntries = true;
		for (String entry : entries) {
			if (entry.length() > 10) {
				allValldEntries = false;
			}
		}
		return allValldEntries;
	}
}