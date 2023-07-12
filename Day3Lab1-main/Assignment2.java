package assignment;
public class DemoArray {
	public static void main(String[] args) {
		int firstArrayMatrix[][] = {{1,1,1},{1,1,1}};
		int secondArrayMatrix[][] = {{2,2,2},{2,2,2}};
		
		int numRow = firstArrayMatrix.length;
		int numCol = firstArrayMatrix[0].length;
		
		for (int r = 0; r < numRow; r ++) {
			for (int c = 0; c < numCol; c++) {
				System.out.print(firstArrayMatrix[r][c] + " ");
			}
			System.out.println();
		}
		
		for (int r = 0; r < numRow; r ++) {
			for (int c = 0; c < numCol; c++) {
				System.out.print(secondArrayMatrix[r][c] + " ");
			}
			System.out.println();
		}
		
		for (int r = 0; r < numRow; r ++) {
			for (int c = 0; c < numCol; c++) {
				int sum = firstArrayMatrix[r][c] +
						secondArrayMatrix[r][c];
				System.out.print(sum + " ");
			}
			System.out.println();
		}
	}
}
