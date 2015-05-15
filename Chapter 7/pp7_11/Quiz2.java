package pp7_11;

import java.util.Scanner;

public class Quiz2 
{
	private final int MAX = 25;
	private Question[] questions;
	private int current, correct, incorrect;
	
	public Quiz2()
	{
		questions = new Question[MAX];
		current = 0;
		correct = incorrect = 0;
		
	}
	public void add(Question newQuestion)
	{
		if(current < MAX)
		{
			questions[current++] = newQuestion;
		}
	}
	public void giveQuiz()
	{
		Scanner scan = new Scanner(System.in);
		
		for(int index = 0; index < current; index++)
		{
			System.out.println(questions[index].getQuestion());
			
			if(questions[index].answerCorrect(scan.nextLine()))
			{
				correct++;
			}
			else
			{
				incorrect++;
			}
			
		}
	}
	public void giveQuiz(int minComplexity, int maxComplexity)
	{
		Scanner scan = new Scanner(System.in);
		
		int complexity;
		for(int index = 0; index < current; index++)
		{
			complexity = questions[index].getComplexity();
			if(complexity >= minComplexity && complexity <= maxComplexity)
			{
				System.out.println(questions[index].getQuestion());
				
				if(questions[index].answerCorrect(scan.nextLine()))
				{
					correct++;
				}
				else
				{
					incorrect++;
				}
			}
		}
		if(correct == 0 && incorrect == 0)
		{
			System.out.println("No questions fall within the complexity range");
		}
	}
	public int getNumCorrect()
	{
		return correct;
	}
	public int getNumIncorrect()
	{
		return incorrect;
	}

}
