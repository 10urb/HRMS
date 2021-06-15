package javaCamp.HRMSProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javaCamp.HRMSProject.entities.concretes.Workplace;

public interface WorkplaceDao extends JpaRepository<Workplace,Integer>{

}
