package ecco.onestopshop.models;

import org.springframework.data.mongodb.core.mapping.Document;


/**
 * 
 * @author Eduardo Lamas Suárez
 * Class made as a document representation of the beginner question collection
 *
 */
@Document
public class QuestionsBeginner {

		String question;
		String[] answers;
		
		public QuestionsBeginner(String question, String[] answers)
		{
			this.question = question;
			this.answers = answers;
		}

		public String getQuestion() {
			return question;
		}

		public void setQuestion(String question) {
			this.question = question;
		}

		public String[] getAnswers() {
			return answers;
		}

		public void setAnswers(String[] answers) {
			this.answers = answers;
		}
}
