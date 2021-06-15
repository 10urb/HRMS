package javaCamp.HRMSProject.bussiness.abstracts;

import java.util.List;

import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.entities.concretes.SystemEmployee;

public interface SystemEmployeeService {
	Result add(SystemEmployee systemEmployee);
	Result update(SystemEmployee systemEmployee);
	DataResult<List<SystemEmployee>> getAll();
	DataResult<SystemEmployee> getById(int id);

}
