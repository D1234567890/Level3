public class FirstClass {
	public static void main(String[] args) {
		int[][] array = new int[5][5];
		for (int i = 0; i < array.length; i++) {
			for (int ii = 0; ii < array[0].length; ii++) {
				array[i][ii] = 10;
				System.out.println(array[i][ii]);
			}
		}
	}
}