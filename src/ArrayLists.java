import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class ArrayLists {
	public static void main(String[] arg1) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("carrots");
		arrayList.add("grapes");
		arrayList.add("oranges");
		arrayList.add("apples");
		arrayList.add("blueberries");
		arrayList.add("rasberries");
		arrayList.add("soup");
		int randomDecider = new Random().nextInt(arrayList.size());
		JOptionPane.showMessageDialog(null, "You should eat " + arrayList.get(randomDecider) + " for dinner!");
	}
}
