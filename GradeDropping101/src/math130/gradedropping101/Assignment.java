package math130.gradedropping101;

/**
 * @author jmartinez
 *
 */
public class Assignment {

	// Keeps track of grades created on runtime
	public static int GradesCreated = 0;
	
	/* Private variables */
	private int maxScore;
	private int score;
	
	/* Default constructor */
	public Assignment(){
		
		// Initialize variables
		maxScore = 100;
		score = 0;
		
		GradesCreated++;
	}
	
	public Assignment(int maxScore, int score){
		
		if(maxScore < 1 || score < 0)
			throw new IllegalArgumentException("The maximum score should be >= 1"
					+ " and the score should be >= 0");
		
		// Initialize variables
		this.maxScore = maxScore;
		
		/* Check that the actual score is 
		 * at most the maximum score
		 */
		if(score > maxScore)
			this.score = maxScore;
		else
			this.score = score;
		
		GradesCreated++;
	}
	
	/* Getters & Setters */
	public void setMaxScore(int maxScore){
		
		if(maxScore < 1)
			throw new IllegalArgumentException("The maximum score should be >= 1");
		
		/* Check that the actual score is 
		 * at most the maximum score
		 */
		if(maxScore < score)
			this.maxScore = score;
		else
			this.maxScore = maxScore;
	}
	
	public void setScore(int score){
		
		if(score < 0)
			throw new IllegalArgumentException("The score should be >= 0");
		
		/* Check that the actual score is 
		 * at most the maximum score
		 */
		if(score > maxScore)
			this.score = maxScore;
		else
			this.score = score;

	}
	
	public int getMaxScore(){
		
		return maxScore;
	}
	
	public int getScore(){
		
		return score;
	}
}
