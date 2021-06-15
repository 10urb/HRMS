package javaCamp.HRMSProject.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCamp.HRMSProject.bussiness.abstracts.SystemEmployeeService;
import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.core.utilities.results.SuccessDataResult;
import javaCamp.HRMSProject.core.utilities.results.SuccessResult;
import javaCamp.HRMSProject.dataAccess.abstracts.SystemEmployeeDao;
import javaCamp.HRMSProject.entities.concretes.SystemEmployee;


@Service
public class SystemEmployeeManager implements SystemEmployeeService{
	SystemEmployeeDao systemEmployeeDao;

	@Autowired
	public SystemEmployeeManager(SystemEmployeeDao systemEmployeeDao) {
		super();
		this.systemEmployeeDao = systemEmployeeDao;
	}

	@Override
	public Result add(SystemEmployee systemEmployee) {
		this.systemEmployeeDao.save(systemEmployee);
		return new SuccessResult("Added");
	}

	@Override
	public Result update(SystemEmployee systemEmployee) {
		
		return null;
	}

	@Override
	public DataResult<List<SystemEmployee>> getAll() {
		return new SuccessDataResult<List<SystemEmployee>>( this.systemEmployeeDao.findAll(),"Listed");
	}

	@Override
	public DataResult<SystemEmployee> getById(int id) {
		return new SuccessDataResult<SystemEmployee>(this.systemEmployeeDao.getOne(id),"Listed");
	}

	
	

}
