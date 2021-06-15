package javaCamp.HRMSProject.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCamp.HRMSProject.bussiness.abstracts.WorkingTimeService;
import javaCamp.HRMSProject.core.utilities.messages.Messages;
import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.core.utilities.results.SuccessDataResult;
import javaCamp.HRMSProject.core.utilities.results.SuccessResult;
import javaCamp.HRMSProject.dataAccess.abstracts.WorkingTimeDao;
import javaCamp.HRMSProject.entities.concretes.WorkingTime;

@Service
public class WorkingTimeManager implements WorkingTimeService {
		WorkingTimeDao workingTimeDao;
	
		@Autowired
	public WorkingTimeManager(WorkingTimeDao workingTimeDao) {
	super();
	this.workingTimeDao = workingTimeDao;
}

	@Override
	public Result add(WorkingTime workingTime) {
		this.workingTimeDao.save(workingTime);
		
		return new SuccessResult(Messages.Added);
	}

	@Override
	public DataResult<List<WorkingTime>> getAll() {
		return new SuccessDataResult<List<WorkingTime>>(this.workingTimeDao.findAll(),Messages.Listed);
	}

	@Override
	public DataResult<WorkingTime> getById(int workingTimeId) {
		return new SuccessDataResult<WorkingTime>(this.workingTimeDao.getOne(workingTimeId),Messages.Listed);
	}

}
