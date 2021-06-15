package javaCamp.HRMSProject.bussiness.abstracts;

import java.util.List;

import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.entities.concretes.WorkingTime;

public interface WorkingTimeService {

	Result add(WorkingTime workingTime);
	DataResult<List<WorkingTime>> getAll();
	DataResult<WorkingTime> getById(int workingTimeId);
}
