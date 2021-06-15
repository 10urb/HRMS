package javaCamp.HRMSProject.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaCamp.HRMSProject.bussiness.abstracts.WorkingTimeService;
import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.entities.concretes.WorkingTime;

@RestController
@RequestMapping("/api/workingtimes")
public class WorkingTimesController {

	WorkingTimeService workingTimeService;

	public WorkingTimesController(WorkingTimeService workingTimeService) {
		super();
		this.workingTimeService = workingTimeService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody WorkingTime workingTime) {
		return this.workingTimeService.add(workingTime);
	}
	
	@CrossOrigin
	@GetMapping("/getall")
	public 	DataResult<List<WorkingTime>> getAll(){
	return	this.workingTimeService.getAll();
	}
	
	@CrossOrigin
	@GetMapping("/getbyid")
	public  DataResult<WorkingTime> getById(int workingTimeId){
		return this.workingTimeService.getById(workingTimeId);
	}
}
