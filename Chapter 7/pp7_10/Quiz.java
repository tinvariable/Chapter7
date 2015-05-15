package pp7_10;

import java.util.Scanner;

public class Quiz 
{
	private final int MAX = 25;
	private Question[] questions;
	private int current, correct, incorrect;
	
	public Quiz()
	{
		questions = new Question[MAX];
		current = 0;
		correct = 0;
		incorrect = 0;
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
		
		for(int i = 0; i < current; i++)
		{
			System.out.println(questions[i].getQuestion());
			if(questions[i].answerCorrect(scan.nextLine))
			{
				correct++;
			}
			else
				incorrect++;
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
