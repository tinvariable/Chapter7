package pp7_10;

import pp7_11.Question;

public class PP7_10 {

	public static void main(String[] args) 
	{
		Quiz quiz = new Quiz();
		
		quiz.add(new Question("What color are trees?", "Green"));
		quiz.add(new Question("Is socializing difficult?", "Yes"));
		quiz.add(new Question("Is Europe weird?", "Yes"));
		quiz.add(new Question("Is change difficult?", "Depends"));
		quiz.add(new Question("Do challenges make a person suicidal?", "Yes"));
		quiz.add(new Question("Is bread better with butter?", "Yes"));
		
		
		
		quiz.giveQuiz();
		
		System.out.println("Correct: " + quiz.getNumCorrect());
		System.out.println("Incorrect: " + quiz.getNumIncorrect());
		
		
		

	}

}
