
public class convertStringToNumberEx {
	public static void main(String[] args) {
		convertStringToNumberEx c1 = new convertStringToNumberEx();
		c1.convertStringToNumber("3.14");
	}
	public void convertStringToNumber(String numberAsString) {
		double number = Double.parseDouble(numberAsString);
		System.out.println(number);
	}
}
