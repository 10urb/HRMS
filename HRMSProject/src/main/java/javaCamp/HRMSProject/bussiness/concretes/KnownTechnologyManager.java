package javaCamp.HRMSProject.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCamp.HRMSProject.bussiness.abstracts.KnownTechnologyService;
import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.core.utilities.results.SuccessDataResult;
import javaCamp.HRMSProject.core.utilities.results.SuccessResult;
import javaCamp.HRMSProject.dataAccess.abstracts.KnownTechnologyDao;
import javaCamp.HRMSProject.entities.concretes.KnownTechnology;

@Service
public class KnownTechnologyManager implements KnownTechnologyService{

	KnownTechnologyDao  knownTechnologyDao;
	
	@Autowired
	public KnownTechnologyManager(KnownTechnologyDao knownTechnologyDao) {
		super();
		this.knownTechnologyDao = knownTechnologyDao;
	}

	@Override
	public Result add(KnownTechnology knownTechnology) {
		this.knownTechnologyDao.save(knownTechnology);
		return new SuccessResult("Added");
	}

	@Override
	public DataResult<List<KnownTechnology>> getAll() {
	return new SuccessDataResult<List<KnownTechnology>>(this.knownTechnologyDao.findAll());
	}

}
