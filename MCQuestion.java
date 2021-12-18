/***
 * 
 * @author Leo Li
 * MC Question Sub Class
 *
 */
public class MCQuestion extends TestQuestion
{
	
	String[] choices;
	
	/*
	 * Write a constructor for MCQuestion which takes
	 * a string for the text, an array of Strings for answer choices
	 * and a string for the correct answer
	 */
	public MCQuestion(String text, String[] choices, String answer)
	{
		super(text, answer);
		this.choices = choices;
	}
	
	
	/*
	 * Override the toString method to display the question in the
	 * form:
	 * 
	 * 2.   This is the text for question number 2. What's your answer?
	 * 		A. answer choice one
	 * 		B. answer choice two
	 * 		C. answer choice three
	 * 		D. answer choice four
	 * 
	 * Keep in mind there are no restrictions on the number of answer
	 * choices.  Your method should work no matter the answer array.
	 * As a reminder, you may increment a char using ++ as it is primitive.
	 */
	
	public String toString()
	{
		String choiceDisplay = "";
		String questionNumber = getQuestionNumber();
		String questionText = getText();
		int currentChoice = 0;
		for(char i = 'A'; i < (char) ('A' + choices.length); i++)
		{	
			choiceDisplay += i + ". " + choices[currentChoice] + "\n     ";
			currentChoice++;
		}
		return questionNumber +".   " + questionText + " What's your answer?\n     " + choiceDisplay;				 
	}

}
