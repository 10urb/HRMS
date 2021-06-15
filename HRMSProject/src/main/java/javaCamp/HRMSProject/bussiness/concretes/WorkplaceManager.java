package javaCamp.HRMSProject.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCamp.HRMSProject.bussiness.abstracts.WorkplaceService;
import javaCamp.HRMSProject.core.utilities.messages.Messages;
import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.core.utilities.results.SuccessDataResult;
import javaCamp.HRMSProject.core.utilities.results.SuccessResult;
import javaCamp.HRMSProject.dataAccess.abstracts.WorkplaceDao;
import javaCamp.HRMSProject.entities.concretes.Workplace;

@Service
public class WorkplaceManager implements WorkplaceService{

	WorkplaceDao workplaceDao;
	
	@Autowired
	public WorkplaceManager(WorkplaceDao workplaceDao) {
		super();
		this.workplaceDao = workplaceDao;
	}

	@Override
	public Result add(Workplace workplace) {
	this.workplaceDao.save(workplace);
	return new SuccessResult("Added");
	}

	@Override
	public DataResult<List<Workplace>> getAll() {
		return new SuccessDataResult<List<Workplace>>(this.workplaceDao.findAll(),Messages.Listed);
	}

	@Override
	public DataResult<Workplace> getById(int workplaceId) {
		return new SuccessDataResult<Workplace>(this.workplaceDao.getOne(workplaceId),Messages.Listed);
	}

}
