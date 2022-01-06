
public class TwoDArray {
	public static void main(String[] args) {
		String[][] b = {{"a", "b", "c"}, {"d","f","g"}};
		TwoDArray t = new TwoDArray();
		t.traverse(b);
	}
	public void traverse(String[][] board) {
		for(int x = 0; x<board.length; x++) {
			for(int y = 0; y<board[x].length; y++) {
				System.out.println(board[x][y]);
			}
		}
	}
}
