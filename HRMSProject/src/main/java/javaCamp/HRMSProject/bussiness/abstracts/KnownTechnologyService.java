package javaCamp.HRMSProject.bussiness.abstracts;

import java.util.List;

import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.entities.concretes.KnownTechnology;

public interface KnownTechnologyService {
	Result add(KnownTechnology knownTechnology);
	DataResult<List<KnownTechnology>> getAll();

}
