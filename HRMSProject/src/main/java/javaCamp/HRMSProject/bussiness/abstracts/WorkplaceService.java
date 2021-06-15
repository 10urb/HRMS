package javaCamp.HRMSProject.bussiness.abstracts;

import java.util.List;

import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.entities.concretes.Workplace;

public interface WorkplaceService {

	Result add(Workplace workplace);
	DataResult<List<Workplace>> getAll();
	DataResult<Workplace> getById(int workplaceId);
}
