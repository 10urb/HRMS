package javaCamp.HRMSProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaCamp.HRMSProject.bussiness.abstracts.KnownTechnologyService;
import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.entities.concretes.KnownTechnology;

@RestController
@RequestMapping("/api/knowntechnologies")
@CrossOrigin
public class KnownTechnologiesController {
	KnownTechnologyService knownTechnologyService;

	@Autowired
	public KnownTechnologiesController(KnownTechnologyService knownTechnologyService) {
		super();
		this.knownTechnologyService = knownTechnologyService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody KnownTechnology knownTechnology) {
		return this.knownTechnologyService.add(knownTechnology);
	}

	@GetMapping("/getall")
	public DataResult<List<KnownTechnology>> getAll(){
		return this.knownTechnologyService.getAll();
	}
}
