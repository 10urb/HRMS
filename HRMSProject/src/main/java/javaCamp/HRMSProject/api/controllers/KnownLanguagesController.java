package javaCamp.HRMSProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaCamp.HRMSProject.bussiness.abstracts.KnownLanguageService;
import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.entities.concretes.KnownLanguage;

@RestController
@RequestMapping("/api/knownlanguages")
@CrossOrigin
public class KnownLanguagesController {
	KnownLanguageService knownLanguageService;

	@Autowired
	public KnownLanguagesController(KnownLanguageService knownLanguageService) {
		super();
		this.knownLanguageService = knownLanguageService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody KnownLanguage knownLanguage) {
	return	this.knownLanguageService.add(knownLanguage);
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<KnownLanguage>> getAll(){
		return this.knownLanguageService.getAll();
	}

}
