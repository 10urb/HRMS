package javaCamp.HRMSProject.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCamp.HRMSProject.bussiness.abstracts.KnownLanguageService;
import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.core.utilities.results.SuccessDataResult;
import javaCamp.HRMSProject.core.utilities.results.SuccessResult;
import javaCamp.HRMSProject.dataAccess.abstracts.KnownLanguageDao;
import javaCamp.HRMSProject.entities.concretes.KnownLanguage;
import net.bytebuddy.asm.Advice.This;

@Service
public class KnownLanguageManager implements KnownLanguageService{
	KnownLanguageDao knownLanguageDao;

	@Autowired
	public KnownLanguageManager(KnownLanguageDao knownLanguageDao) {
		super();
		this.knownLanguageDao = knownLanguageDao;
	}

	@Override
	public Result add(KnownLanguage knownLanguage) {
	this.knownLanguageDao.save(knownLanguage);
		return new SuccessResult("Added");
	}

	@Override
	public DataResult<List<KnownLanguage>> getAll() {
	
		return new SuccessDataResult<List<KnownLanguage> >(this.knownLanguageDao.findAll());
	}

}
