package javaCamp.HRMSProject.bussiness.abstracts;

import java.util.List;

import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.entities.concretes.KnownLanguage;
import javaCamp.HRMSProject.entities.concretes.Resume;

public interface KnownLanguageService {
	Result add(KnownLanguage knownLanguage);
	DataResult<List<KnownLanguage>> getAll();

}
