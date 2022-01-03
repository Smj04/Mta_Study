

public class Exam05 {
	public static void main(String[] args) { 
		for(int i = 0; i < args.length; i++) {
			handleArgument(args[i]);
		}
	}

	private static void handleArgument(String string) {
		System.out.println(string);
	}
}

