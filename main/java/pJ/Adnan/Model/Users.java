package pJ.Adnan.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  long id;
	@Column(nullable=false , length=30)
	private  String full_name;
	@Column(nullable=false , length=20)
	private String password;
	
	
	public Users(long id, String full_name, String password) {
		super();
		this.id = id;
		this.full_name = full_name;
		this.password = password;
	}

	public Users() {
		super();	
	}
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getFull_name() {
		return full_name;
	}
	
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
