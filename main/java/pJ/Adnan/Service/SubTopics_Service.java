package pJ.Adnan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pJ.Adnan.Model.SubTopics;
import pJ.Adnan.Repository.SubTopics_Repo;

@Service
public class SubTopics_Service {

	@Autowired
	SubTopics_Repo Srepo;
	
	
	public SubTopics saveSubTopic(SubTopics subtopic) {
		return Srepo.save(subtopic);
	}
	
	public List<SubTopics> saveSubTopics(List<SubTopics> subtopics) {
		return Srepo.saveAll(subtopics);
	}

	public List<SubTopics> getSubTopics() {
		return Srepo.findAll();
	}
	
	public SubTopics getSubTopicById(long id) {
		return Srepo.findById(id).orElse(null);
	}
	public SubTopics getSubTopicByName(String name) {
		return Srepo.findByName(name);
	}
	
	public SubTopics updateSubTopic(SubTopics subtopic) {
		SubTopics exC= Srepo.findById(subtopic.getId()).orElse(null);
		exC.setName(subtopic.getName());
		return Srepo.save(exC);
	}

	public String deleteSubTopic(long id) {
		 Srepo.deleteById(id);
		 return "subtopic Deleted"+id;
	}
}
