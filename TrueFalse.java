/***
 * 
 * @author Leo Li
 * True False Sub Class
 *
 */
public class TrueFalse extends TestQuestion
{
	
	/*
	 * Create a constructor which takes a string for the text and and
	 * string for the answer as arguments
	 * 
	 */
	
	public TrueFalse(String text, String answer)
	{
		super(text, answer);
	}
	
	
	/*
	 * override the toString method so that it displays the question
	 * in the following format:
	 * 
	 * 2. True/False:  This is the text for question 3.
	 * 
	 * The text only includes the statement.  You must format
	 * everything else.
	 */
	
	public String toString()
	{
		String questionNumber = getQuestionNumber();
		String questionText = getText();
		return questionNumber + ". True/False:\t" + questionText;						
	}

}
