package pJ.Adnan.Model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Answer_Comments {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="answer_id")
	private Answers answer;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
	private Users user;
	
	public Answer_Comments(long id, Answers answer, Users user) {
		super();
		this.id = id;
		this.answer = answer;
		this.user = user;
	}
	public Answer_Comments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Answers getAnswer() {
		return answer;
	}
	public void setAnswer(Answers answer) {
		this.answer = answer;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	
	
	

	
    



	

	
}
