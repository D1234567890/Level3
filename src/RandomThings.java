import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class RandomThings {
	public static void main(String[] arg3) {
		ArrayList<String> adjectives = new ArrayList<String>();
		ArrayList<String> nouns = new ArrayList<String>();
		adjectives.add("ugly");
		adjectives.add("fat");
		adjectives.add("beautiful");
		adjectives.add("dirty");
		nouns.add("notebook");
		nouns.add("computer");
		nouns.add("window");
		nouns.add("finger");
		int random = new Random().nextInt(adjectives.size());
		int random1 = new Random().nextInt(nouns.size());
		JOptionPane.showMessageDialog(null, adjectives.get(random) + " " + nouns.get(random1));
	}
}
