import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RunEuler {
	public static void main(String args[]){
		final int COMPLETED_PROBLEMS = 25;
		String solution;
		ArrayList<String> problems = new ArrayList<String>();
		for (int i = 1; i <= COMPLETED_PROBLEMS; i++){
			problems.add("Problem " + (i));
		}
		Euler myEuler;
		String theProblem = (String) JOptionPane.showInputDialog(null, "Which problem would you like to solve?", 
				"Select Euler Problem", JOptionPane.QUESTION_MESSAGE, 
				null, problems.toArray(), problems.get(0));
		myEuler = new Euler(problems.indexOf(theProblem)+1);
		myEuler.solve();
		solution = myEuler.toString();
		JOptionPane.showMessageDialog(null, solution, theProblem, 2);
	}
}
