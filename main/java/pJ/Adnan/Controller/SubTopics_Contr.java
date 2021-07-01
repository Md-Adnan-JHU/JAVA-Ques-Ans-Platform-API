package pJ.Adnan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pJ.Adnan.Model.SubTopics;
import pJ.Adnan.Service.SubTopics_Service;

@RestController
public class SubTopics_Contr {

	
	@Autowired
	SubTopics_Service Sserv;
	
	@PostMapping("/addSubTopic")
	public SubTopics addSubTopic(@RequestBody SubTopics subtopic) {
		return Sserv.saveSubTopic(subtopic);
	}
	
	@PostMapping("/addSubTopics")
	public List<SubTopics> addAllSubTopics(@RequestBody List<SubTopics> subtopics) {
		return Sserv.saveSubTopics(subtopics);
	}

	@GetMapping("/getSubTopics") 
    public List<SubTopics> findAllSubTopics(){
    	return Sserv.getSubTopics();
    }
	
	@GetMapping("/getSubTopic/id/{id}")
    public SubTopics findSubTopicById(@PathVariable long id){
    	return Sserv.getSubTopicById(id);
    }
	
	@GetMapping("/getSubTopic/name/{name}")
    public SubTopics findSubTopicByName(@PathVariable String name){
    	return Sserv.getSubTopicByName(name);
    }
	
	@PutMapping("/UpdateSubTopic")
	public SubTopics updateSubTopic(@RequestBody SubTopics SubTopic) {
		 return Sserv.updateSubTopic(SubTopic);
	}
	
	@DeleteMapping("/deleteSubTopic/{id}")
	public String deleteSubTopic(@PathVariable long id) {
		return Sserv.deleteSubTopic(id);
	}
}
