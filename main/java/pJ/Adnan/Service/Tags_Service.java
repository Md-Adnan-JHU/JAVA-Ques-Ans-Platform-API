package pJ.Adnan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pJ.Adnan.Model.Tags;
import pJ.Adnan.Repository.Tags_Repo;

@Service
public class Tags_Service {

	@Autowired
	Tags_Repo Trepo;
	
	
	public Tags saveTag(Tags tag) {
		return Trepo.save(tag);
	}
	
	public List<Tags> saveTags(List<Tags> tag) {
		return Trepo.saveAll(tag);
	}

	public List<Tags> getTags() {
		return Trepo.findAll();
	}
	
	public Tags getTagById(long id) {
		return Trepo.findById(id).orElse(null);
	}
	public Tags getTagByName(String name) {
		return Trepo.findByName(name);
	}
	
	public Tags updateTag(Tags tag) {
		Tags exC= Trepo.findById(tag.getId()).orElse(null);
		exC.setName(tag.getName());
		return Trepo.save(exC);
	}

	public String deleteTag(long id) {
		 Trepo.deleteById(id);
		 return "tag Deleted"+id;
	}
}
