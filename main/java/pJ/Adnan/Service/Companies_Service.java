package pJ.Adnan.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pJ.Adnan.Model.Companies;
import pJ.Adnan.Repository.Companies_Repo;

@Service
public class Companies_Service {

	@Autowired
	Companies_Repo Crepo;


	public Companies saveCompany(Companies company) {
		return Crepo.save(company);
	}
	
	public List<Companies> saveCompanies(List<Companies> companies) {
		return Crepo.saveAll(companies);
	}

	public List<Companies> getCompanies() {
		return Crepo.findAll();
	}

	
	
	
	public Companies getCompanyById(long id) {
		return Crepo.findById(id).orElse(null);
	}
	public Companies getCompanyByName(String name) {
		return Crepo.findByName(name);
	}
	
	
	
	
	public Companies updatecompany(Companies company) {
		Companies exC= Crepo.findById(company.getId()).orElse(null);
		exC.setName(company.getName());
		return Crepo.save(exC);
	}


	public String deleteCompany(long id) {
		 Crepo.deleteById(id);
		 return "Company Deleted"+id;
	}





	



	
	
}
