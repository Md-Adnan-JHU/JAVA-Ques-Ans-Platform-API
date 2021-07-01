package pJ.Adnan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pJ.Adnan.Model.Companies;

public interface Companies_Repo extends JpaRepository<Companies, Long> {

	Companies findByName(String name);

	
	

}
