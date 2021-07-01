package pJ.Adnan.Model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Answers {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  long id;
	private  String answer_text;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="subtopic_id")
	private SubTopics subtopic;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
	private Users user;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="question_id")
	private Questions question;
	
	

	public Answers() {
		super();
	}

	public Answers(long id, String answer_text, SubTopics subtopic, Users user, Questions question) {
		super();
		this.id = id;
		this.answer_text = answer_text;
		this.subtopic = subtopic;
		this.user = user;
		this.question = question;
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}



	public String getAnswer_text() {
		return answer_text;
	}



	public void setAnswer_text(String answer_text) {
		this.answer_text = answer_text;
	}



	public SubTopics getSubtopic() {
		return subtopic;
	}



	public void setSubtopic(SubTopics subtopic) {
		this.subtopic = subtopic;
	}



	public Users getUser() {
		return user;
	}



	public void setUser(Users user) {
		this.user = user;
	}



	public Questions getQuestion() {
		return question;
	}



	public void setQuestion(Questions question) {
		this.question = question;
	}
	
	

	
	
	
	

	
	
	
	
}

