package math130.gradedropping101;
import java.util.Scanner;

/**
 * @author jmartinez
 *
 */
public class GradeDroppingTest {

	public static void main(String[] args) {

		// Scanner object
		Scanner stdin = new Scanner(System.in);
		
		// Needed variables
		int totalScores = 0;
		int totalMaxScores = 0;
		double maxPercentage = 0;
		
		// Print title
		System.out.println("Mimi Rasky's% java challenge");
		
		// Get number of assignments
		System.out.print("\nInput number of assignments: ");
		int assignmentsLen = stdin.nextInt();
		
		// Create array of grades
		Assignment[] assignments = new Assignment[assignmentsLen];
		
		for(int i = 0; i < assignmentsLen; i++){
			
			// Read score and max score
			System.out.print("\nInput the student's score: ");
			int score = stdin.nextInt();
			
			System.out.print("\nInput the max score: ");
			int maxScore = stdin.nextInt();
			
			// Add to array
			assignments[i] = new Assignment(maxScore,score);
			totalScores+=score;
			totalMaxScores+=maxScore;
		}
		
		for(int i = 0; i < assignmentsLen-2; i++){
			
			// Remove
			totalScores -= assignments[i].getScore();
			totalMaxScores -= assignments[i].getMaxScore();
			
			for(int j = i+1; j < assignmentsLen-1; j++){
				
				// Remove
				totalScores -= assignments[j].getScore();
				totalMaxScores -= assignments[j].getMaxScore();
				
				for(int x = j+1; x < assignmentsLen; x++){
					
					// Remove
					totalScores -= assignments[x].getScore();
					totalMaxScores -= assignments[x].getMaxScore();
					
					// Calculate percentage
					double percentage = (double) totalScores/totalMaxScores;
					
					// Check if more than max
					if(maxPercentage < percentage)
						maxPercentage = percentage;
					
					// Add back
					totalScores += assignments[x].getScore();
					totalMaxScores += assignments[x].getMaxScore();
				}
				
				// Add back
				totalScores += assignments[j].getScore();
				totalMaxScores += assignments[j].getMaxScore();
			}
			
			// Add back
			totalScores += assignments[i].getScore();
			totalMaxScores += assignments[i].getMaxScore();
		}
			
		System.out.printf("\nBest possible percentage: %.1f%%", maxPercentage*100);
	}
}
