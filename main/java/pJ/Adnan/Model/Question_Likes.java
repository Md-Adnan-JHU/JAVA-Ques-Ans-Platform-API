package pJ.Adnan.Model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Question_Likes {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
	private Users user;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="answer_id")
	private Answers answer;
	
	
	public Question_Likes(long id, Users user, Answers answer) {
		super();
		this.id = id;
		this.user = user;
		this.answer = answer;
	}
	public Question_Likes() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Answers getAnswer() {
		return answer;
	}
	public void setAnswer(Answers answer) {
		this.answer = answer;
	}
	
	
	
	
	
	
	
}
