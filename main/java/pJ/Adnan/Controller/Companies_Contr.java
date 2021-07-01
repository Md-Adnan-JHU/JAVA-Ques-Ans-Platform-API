package pJ.Adnan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import pJ.Adnan.Model.Companies;
import pJ.Adnan.Service.Companies_Service;


@RestController
public class Companies_Contr {
	
	
	@Autowired
	Companies_Service Cserv;
	
	@PostMapping("/addCompany")
	public Companies addCompany(@RequestBody Companies company) {
		return Cserv.saveCompany(company);
	}
	
	@PostMapping("/addCompanies")
	public List<Companies> addAllCompanies(@RequestBody List<Companies> companies) {
		return Cserv.saveCompanies(companies);
	}

	@GetMapping("/getCompanies") 
    public List<Companies> findAllCompanies(){
    	return Cserv.getCompanies();
    }
	
	@GetMapping("/getCompany/id/{id}")
    public Companies findCompanyById(@PathVariable long id){
    	return Cserv.getCompanyById(id);
    }
	
	@GetMapping("/getCompany/name/{name}")
    public Companies findCompanyByName(@PathVariable String name){
    	return Cserv.getCompanyByName(name);
    }
	
	@PutMapping("/UpdateCompany")
	public Companies updateCompany(@RequestBody Companies company) {
		 return Cserv.updatecompany(company);
	}
	
	@DeleteMapping("/deleteCompany/{id}")
	public String deleteCompany(@PathVariable long id) {
		return Cserv.deleteCompany(id);
	}

}
