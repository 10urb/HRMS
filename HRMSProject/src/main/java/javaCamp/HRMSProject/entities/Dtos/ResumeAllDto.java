package javaCamp.HRMSProject.entities.Dtos;

import java.util.List;

import javaCamp.HRMSProject.entities.concretes.EducationInformation;
import javaCamp.HRMSProject.entities.concretes.Image;
import javaCamp.HRMSProject.entities.concretes.JobInformation;
import javaCamp.HRMSProject.entities.concretes.JobSeeker;
import javaCamp.HRMSProject.entities.concretes.KnownLanguage;
import javaCamp.HRMSProject.entities.concretes.KnownTechnology;
import javaCamp.HRMSProject.entities.concretes.Resume;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResumeAllDto {
	

	private JobSeeker jobSeeker;
	private Resume resume;
	private List<JobInformation> jobInformations;
	private List<EducationInformation> educationInformations;
	private List<KnownLanguage> knownLanguages;
	private List <KnownTechnology> knownTechnologies;
	private Image image;
	

	

	
}
