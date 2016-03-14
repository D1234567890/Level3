import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Jokes {
	public static void main(String[] arg2) {
		ArrayList<String> joke = new ArrayList<String>();
		ArrayList<String> jokeAnswers = new ArrayList<String>();
		joke.add("Why shouldn't you trust atoms?");
		joke.add("Can a kangaroo jump as high as a house?");
		jokeAnswers.add("Because they make up everything!");
		jokeAnswers.add("Of course! A house can't jump at all!");
		int yesOrNo = JOptionPane.showConfirmDialog(null, "Do you want a joke?", "Joke Menu",
				JOptionPane.YES_NO_OPTION);
		if (yesOrNo == JOptionPane.YES_OPTION) {
			int randomJoke = new Random().nextInt(joke.size());
			JOptionPane.showMessageDialog(null, joke.get(randomJoke));
			JOptionPane.showMessageDialog(null, jokeAnswers.get(randomJoke));
		}
	}
}