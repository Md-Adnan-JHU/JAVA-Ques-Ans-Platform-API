package pJ.Adnan.Model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tags {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  long id;
	private  String name;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "tag")
	private Set<Questions> question = new HashSet<>();
	
	public Tags() {
		super();
	}



	public Tags(long id, String name, Set<Questions> question) {
		super();
		this.id = id;
		this.name = name;
		this.question = question;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Questions> getQuestion() {
		return question;
	}

	public void setQuestion(Set<Questions> question) {
		this.question = question;
	}

	
	

}
