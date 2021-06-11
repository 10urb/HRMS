package javaCamp.HRMSProject.dataAccess.abstracts;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javaCamp.HRMSProject.entities.Dtos.ResumeAllDto;
import javaCamp.HRMSProject.entities.concretes.Resume;


public interface ResumeDao extends JpaRepository<Resume, Integer> {
	Resume getByResumeId(int resumeId);


	
//	@Query("Select new  javaCamp.HRMSProject.entities.Dtos.ResumeAllDto (j.userId, j.firstName, r.githubLink, r.linkedinLink) From "
//			+ "Resume  r Inner Join  j.jobSeeker j" )
//	List<ResumeAllDto> getResumeAll();
	


	


}
