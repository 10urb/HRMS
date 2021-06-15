package javaCamp.HRMSProject.bussiness.abstracts;

import java.util.List;

import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.entities.concretes.City;

public interface CityService {
	//Result add(City city);
	DataResult<List<City>> getAll();
	DataResult<City> getById(int cityId);

}
