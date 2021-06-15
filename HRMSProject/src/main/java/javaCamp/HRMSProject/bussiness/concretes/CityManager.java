package javaCamp.HRMSProject.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCamp.HRMSProject.bussiness.abstracts.CityService;
import javaCamp.HRMSProject.core.utilities.messages.Messages;
import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.SuccessDataResult;
import javaCamp.HRMSProject.dataAccess.abstracts.CityDao;
import javaCamp.HRMSProject.entities.concretes.City;

@Service
public class CityManager implements CityService{
	CityDao cityDao;

	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public DataResult<List<City>> getAll() {
		return new SuccessDataResult<List<City>>(this.cityDao.findAll(),Messages.Listed);
	}

	@Override
	public DataResult<City> getById(int cityId) {
	return new SuccessDataResult<City>(this.cityDao.getOne(cityId),Messages.Listed);
	}	

	
}
