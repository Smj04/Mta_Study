import java.util.ArrayList;
public class ALTest {

public static void Process(ArrayList<String> invoices) {
	for(int i = 0; i<invoices.size();) { //++�� ����
		String invoice = invoices.get(i);
		System.out.println(invoices.get(i)+"����");
		invoices.remove(i);
		System.out.println(invoices);
	}
}
	public static void main(String[] args) {
		ArrayList<String> invoices = new ArrayList<String>();
		invoices.add("a");
		invoices.add("b");
		invoices.add("c");
		Process(invoices);
	}

}
