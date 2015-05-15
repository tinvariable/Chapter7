package pp7_11;

public class PP7_11 {

	public static void main(String[] args) 
	{
		Quiz2 quiz = new Quiz2();
		Question temp;
		
		temp = new Question("What is the capital of Idaho?", "Boise");
		temp.setComplexity(10);
		quiz.add(temp);
		
		temp = new Question("What color is the sky?", "Blue");
		temp.setComplexity(1);
		quiz.add(temp);
		
		temp = new Question("Are cats amazing creatures?", "Yes");
		temp.setComplexity(1);
		quiz.add(temp);
		
		temp = new Question("Has mankind innovated?", "Yes");
		temp.setComplexity(1);
		quiz.add(temp);
		
		temp = new Question("Are calculators useful?", "Yes");
		temp.setComplexity(2);
		quiz.add(temp);
		
		temp = new Question("Are computers useful?", "Yes");
		temp.setComplexity(2);
		quiz.add(temp);
		
		temp = new Question("Is food necessary?", "Yes");
		temp.setComplexity(3);
		quiz.add(temp);
		
		temp = new Question("Are pencils useful?", "Yes");
		temp.setComplexity(4);
		quiz.add(temp);
		
		quiz.giveQuiz(3, 5);
		
		System.out.println("Correct: " + quiz.getNumCorrect());
		System.out.println("Incorrect: " +quiz.getNumIncorrect());
		
		

	}

}
