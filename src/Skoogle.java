
public class Skoogle {
	static int x = 0;

	Skoogle() {
		System.out.println(x++);
		new Skoogle();
	}

	public static void main(String[] arg1) {
		new Skoogle();
	}
}
