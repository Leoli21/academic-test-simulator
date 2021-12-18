import java.util.ArrayList;
import java.util.Scanner;
/***
 * 
 * @author Leo Li
 * Test Questions Project Main Class
 *
 */
public class TestQuestionMain 
{

	public static void main(String[] args) 
	{
		ArrayList <TestQuestion> questionList = new ArrayList<TestQuestion>();
		boolean cont = true;
		
		while(cont)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Would you like to create a Multiple Choice or True/False question? ");
			String questionType = input.nextLine();
			while(!(questionType.equals("Multiple Choice")) && !(questionType.equals("True/False")))
			{
				System.out.println("Not a valid input. Choose to create either a Multiple Choice or True/False Question: ");
				questionType = input.nextLine();
			}
			if(questionType.contains("Multiple Choice"))
			{
				System.out.println("Enter your question: ");
				String questionText = input.nextLine();
				
				System.out.println("How many answer choices will there be? ");
				int numChoices = input.nextInt();
				input.nextLine();
				String[] choices = new String[numChoices];
				String correctAnswer = "";
				for(int i = 0; i < choices.length; i++)
				{
					System.out.println("Enter a answer choice: ");
					choices[i] = input.nextLine();
					System.out.println("Is this the correct answer? Y/N ");
					String answer = input.nextLine();
					while(!(answer.equals("Y")) && !(answer.equals("N")))
					{
						System.out.println("Not a valid input. Choose 'Y' or 'N': ");
						answer = input.nextLine();
					}
					if(answer.equals("Y"))
					{
						correctAnswer = choices[i];
					}
				}
				questionList.add(new MCQuestion(questionText,choices,correctAnswer));
			}
			else
			{
				System.out.println("Enter your question: ");
				String questionText = input.nextLine();
				
				String correctAnswer = "";
				System.out.println("What is the answer? T/F ");
				String answerReply = input.nextLine();
				if(answerReply.equals("T"))
				{
					correctAnswer = "T";
				}
				else
				{
					correctAnswer = "F";
				}
				
				questionList.add(new TrueFalse(questionText, correctAnswer));
			}
			
			System.out.println("Would you like to add another question? Y/N ");
			String response = input.nextLine();
			
			while(!(response.equals("Y")) && !(response.equals("N")))
			{
				System.out.println("Not a valid input. Choose to either Y or N: ");
				response = input.nextLine();
			}
			if (response.equals("N"))
			{
				cont = false;
			}
		}
		
		for(int i = 0; i < questionList.size(); i++)
		{
			TestQuestion question = questionList.get(i);
			question.setNextQuestionNumber(i);
			if(question instanceof MCQuestion)
			{
				System.out.println(((MCQuestion)question).toString());
			}
			else
			{
				System.out.println(((TrueFalse)question).toString());
			}	
		}
		
	}

}
