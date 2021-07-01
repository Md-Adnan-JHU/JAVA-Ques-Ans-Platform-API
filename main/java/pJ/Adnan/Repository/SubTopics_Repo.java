package pJ.Adnan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pJ.Adnan.Model.SubTopics;

public interface SubTopics_Repo extends JpaRepository<SubTopics,  Long> {

	SubTopics findByName(String name);

}
