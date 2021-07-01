package pJ.Adnan.Model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SubTopics {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  long id;
	private  String name;
	
	@Enumerated(EnumType.STRING)
	private Topic topic;

	public SubTopics() {
		super();
	}

	public SubTopics(long id, String name, Topic topic) {
		super();
		this.id = id;
		this.name = name;
		this.topic = topic;
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

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
	
	
	

}
