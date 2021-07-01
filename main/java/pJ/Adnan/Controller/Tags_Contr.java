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

import pJ.Adnan.Model.Tags;
import pJ.Adnan.Service.Tags_Service;

@RestController
public class Tags_Contr {

	
	@Autowired
	Tags_Service Tserv;
	
	@PostMapping("/addTag")
	public Tags addTag(@RequestBody Tags tag) {
		return Tserv.saveTag(tag);
	}
	
	@PostMapping("/addTags")
	public List<Tags> addAllTags(@RequestBody List<Tags> tags) {
		return Tserv.saveTags(tags);
	}

	@GetMapping("/getTags") 
    public List<Tags> findAllTags(){
    	return Tserv.getTags();
    }
	
	@GetMapping("/getTag/id/{id}")
    public Tags findTagById(@PathVariable long id){
    	return Tserv.getTagById(id);
    }
	
	@GetMapping("/getTag/name/{name}")
    public Tags findTagByName(@PathVariable String name){
    	return Tserv.getTagByName(name);
    }
	
	@PutMapping("/UpdateTag")
	public Tags updateTag(@RequestBody Tags tag) {
		 return Tserv.updateTag(tag);
	}
	
	@DeleteMapping("/deleteTag/{id}")
	public String deleteTag(@PathVariable long id) {
		return Tserv.deleteTag(id);
	}
}
