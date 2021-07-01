package pJ.Adnan.Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Questions {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  long id;
	private  String question_text;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="subtopic_id")
	private SubTopics subtopic;

	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "question_company_mapping",
	     joinColumns = { @JoinColumn (name = "question_id")},
	     inverseJoinColumns = { @JoinColumn (name = "company_id")}
	)
	private Set<Companies> company = new HashSet<>();

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "question_tag_mapping",
	     joinColumns = { @JoinColumn (name = "question_id")},
	     inverseJoinColumns = { @JoinColumn (name = "tag_id")}
	)
	private Set<Tags> tag =  new HashSet<>();
	
	public Questions() {
		super();
	}

	public Questions(long id, String question_text, SubTopics subtopic, Set<Companies> company, Set<Tags> tag) {
		super();
		this.id = id;
		this.question_text = question_text;
		this.subtopic = subtopic;
		this.company = company;
		this.tag = tag;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getQuestion_text() {
		return question_text;
	}

	public void setQuestion_text(String question_text) {
		this.question_text = question_text;
	}

	public SubTopics getSubtopic() {
		return subtopic;
	}

	public void setSubtopic(SubTopics subtopic) {
		this.subtopic = subtopic;
	}

	public Set<Companies> getCompany() {
		return company;
	}

	public void setCompany(Set<Companies> company) {
		this.company = company;
	}

	public Set<Tags> getTag() {
		return tag;
	}

	public void setTag(Set<Tags> tag) {
		this.tag = tag;
	}



	

	
	
	
	
	
	

   
	
	
	
	
}
