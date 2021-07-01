package pJ.Adnan.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import pJ.Adnan.Model.Tags;

public interface Tags_Repo extends JpaRepository<Tags , Long> {

	Tags findByName(String name);

}
