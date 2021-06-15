package javaCamp.HRMSProject.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javaCamp.HRMSProject.bussiness.abstracts.WorkplaceService;
import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.entities.concretes.Workplace;

@RestController
@RequestMapping("/api/workplaces")
public class WorkplacesController {
	WorkplaceService workplaceService;

	public WorkplacesController(WorkplaceService workplaceService) {
		super();
		this.workplaceService = workplaceService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Workplace workplace) {
	return this.workplaceService.add(workplace);	
	}
	
	@CrossOrigin
	@GetMapping("/getall")
	public DataResult<List<Workplace>> getAll(){
		return this.workplaceService.getAll();
	}
	
	@CrossOrigin
	@GetMapping("/getbyid")
public 	DataResult<Workplace> getById(@RequestParam int workplaceId){
		return this.workplaceService.getById(workplaceId);
	}

}
