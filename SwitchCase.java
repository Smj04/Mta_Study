
public class SwitchCase {
	public static void main(String[] args) {
		int age = 27;
		double discount;

		// 1)
		if (age >= 25) {
			discount = 0.50;
		} else if (age >= 21) {
			discount = 0.25;

		} else {
			discount = 0.0;
		}
		switch (age) {
		case 25:
			discount = 0.50;
			break;
		case 24:
		case 23:
		case 22:
		case 21:
			discount = 0.25;
			break;

		default:
			discount = 0.0;
		}

		// 2)
		String message;
		String grade = "";
		if (grade == "A") {
			message = "표준 초과";
		} else if (grade == "B") {
			message = "표준 충족";
		} else {
			message = "개선 필요";
		}

		switch (grade) {
		case "A": {
			message = "표준 초과";
			break;
		}
		case "B": {
			message = "표준 충족";
			break;
		}
		default:
			message = "개선 필요";
		}

		// 3)
		double gpa = 0.0;
		int priority = 0;

		if (gpa == 4.0) {
			priority = 1;
		} else if (gpa == 3.0) {
			priority = 2;
		} else if (gpa >= 2.5) {
			priority = 3;
		}

		/*
		 * switch (gpa) { //switch~case문에 double형 처리시 에러! case 4.0: { priority = 1;
		 * break; } case 3.0: { priority = 2; break; } case 2.5: { priority = 3; break;
		 * }
		 */
	}
}
